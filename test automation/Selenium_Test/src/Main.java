import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;


import java.util.List;

//this requires external libraries
//https://www.selenium.dev/downloads/
//https://github.com/mozilla/geckodriver/releases
public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\Temp\\GeckoDriver\\geckodriver.exe");  //make sure to have this
        WebDriver driver = new FirefoxDriver();
        driver.get("localhost:8080/signup");

        driver.findElement(By.id("fName")).sendKeys("The");
        driver.findElement(By.id("lName")).sendKeys("CHAMP");
        driver.findElement(By.id("email")).sendKeys("theCHAMP@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("DoB")).sendKeys("09/10/1997");
        driver.findElement(By.id("gender")).sendKeys("male");
        driver.findElement(By.id("phone")).sendKeys("123-456-7890");

        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);     //gecko might have an issue with this line
        List<LogEntry> logs= entry.getAll();
        // Print one by one
        for(LogEntry e: logs)
        {
            System.out.println(e);
        }

        // Printing details separately
        for(LogEntry e: logs)
        {
            System.out.println("Message is: " +e.getMessage());
            System.out.println("Level is: " +e.getLevel());
        }

    }
}
