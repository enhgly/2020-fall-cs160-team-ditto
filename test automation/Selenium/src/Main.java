import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this requires external libraries
//https://www.selenium.dev/downloads/
//https://github.com/mozilla/geckodriver/releases
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Temp\\GeckoDriver\\geckodriver.exe");  //make sure to have this
        WebDriver driver = new FirefoxDriver();
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions= new ChromeOptions();
//        chromeOptions.setBinary("C:\\Users\\Arlan\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\arlan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver(chromeOptions);
/**
 SIGN UP
 */
        //unique user
        //driver.get("localhost:8080/signup");
//        driver.findElement(By.id("fName")).sendKeys("The");
//        driver.findElement(By.id("lName")).sendKeys("CHAMP");
//        driver.findElement(By.id("email")).sendKeys("theCHAMP1@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("password");
//        driver.findElement(By.id("DoB")).sendKeys("09/10/1997");
//        driver.findElement(By.id("gender")).sendKeys("male");
//        driver.findElement(By.id("phone")).sendKeys("123-456-7890");
//        driver.findElement(By.id("submit")).submit();
//        driver.findElement(By.id("return")).submit();


//        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);     //gecko might have an issue with this line
//        List<LogEntry> logs= entry.getAll();
//        // Print one by one
//        for(LogEntry e: logs)
//        {
//            System.out.println(e);
//        }
//
//        // Printing details separately
//        for(LogEntry e: logs)
//        {
//            System.out.println("Message is: " +e.getMessage());
//            System.out.println("Level is: " +e.getLevel());
//        }
//
//    }


/**
 * LOGIN

        Scanner scan = new Scanner(System.in);
        //successful login
        ArrayList<loginInfo> list = new ArrayList<>();
        list.add(new loginInfo("theCHAMP1@gmail.com", "password"));                 //successful
        list.add(new loginInfo("thislogindoesnotexist@gmail.com", "nonya"));        //not in database
        list.add(new loginInfo("", ""));                                            //nulls
        list.add(new loginInfo("theCHAMP1@gmail.com", "wrongpass"));                //wrong pass

        for(loginInfo login : list) {
            driver.get("localhost:8080/index");
            driver.findElement(By.id("email")).sendKeys(login.login);
            driver.findElement(By.id("password")).sendKeys(login.password);
            driver.findElement(By.id("yes")).click();
            String input = scan.nextLine();
            System.out.println(input);
        }
 */

/**
 * Post
 */
        driver.get("localhost:8080/index");
        driver.findElement(By.id("email")).sendKeys("a");
        driver.findElement(By.id("password")).sendKeys("a");
        driver.findElement(By.id("yes")).click();
        ArrayList<String> postList = new ArrayList<>();
        postList.add("This is my first successful post");               //successful
        postList.add("");                                               //empty string
        postList.add("THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST over 500 characters");
        for(String post : postList) {
            driver.findElement(By.id("status")).sendKeys(post);
            driver.findElement(By.id("confirm")).click();
        }
//        for (LogEntry entry : driver.manage().logs().get(LogType.BROWSER)) {
//            String msg = entry.getMessage();
//            System.err.println("Message: " + msg);
//        }
        //driver.close();
    }
}
class loginInfo{
    public String login;
    public String password;
    public loginInfo(String log, String pass){
        login = log;
        password = pass;
    }
}