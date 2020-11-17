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
        String longString = "THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST THIS IS A LONG POST over 500 characters";
        //unique user
        driver.get("localhost:8080/signup");

        ArrayList<signUpInfo> signUpInfoArrayList = new ArrayList<>();
        signUpInfoArrayList.add(new signUpInfo("Henry","Cavill","superman@gmail.com","iwanttoplaysupermanagain","05/05/1983","male","123-456-7890", "valid sign up, new email"));
        signUpInfoArrayList.add(new signUpInfo("Henry","Cavill","superman@gmail.com","iwanttoplaysupermanagain","05/05/1983","male","123-456-7890", "invalid sign up, same email"));
        signUpInfoArrayList.add(new signUpInfo("null","man",null,"nullpass","01/01/1900","null","000-000-0000", "invalid sign up, null email"));
        signUpInfoArrayList.add(new signUpInfo("empty","man","","emptypass","01/01/1900","empty","000-000-0000", "invalid sign up, empty email"));
        signUpInfoArrayList.add(new signUpInfo("Short","Pass","shortpass@gmail.com",":)","09/10/1987","n/a","000-000-0000", "invalid sign up, pwd too short"));
        signUpInfoArrayList.add(new signUpInfo("Long","Pass","longpass@gmail.com",longString,"09/10/1987","n/a","000-000-0000", "invalid sign up, pwd too long"));
        signUpInfoArrayList.add(new signUpInfo("Null","Pass","nullpass@gmail.com",null,"09/10/1987","n/a","000-000-0000", "invalid sign up, null pwd"));
        signUpInfoArrayList.add(new signUpInfo("Empty","Pass","emptypass@gmail.com","","09/10/1987","n/a","000-000-0000", "invalid sign up, empty pwd"));
        for(signUpInfo signupinfo : signUpInfoArrayList) {
            driver.get("localhost:8080/signup");
            driver.findElement(By.id("fName")).sendKeys(signupinfo.fName);
            driver.findElement(By.id("lName")).sendKeys(signupinfo.lName);
            driver.findElement(By.id("email")).sendKeys(signupinfo.email);
            driver.findElement(By.id("password")).sendKeys(signupinfo.password);
            driver.findElement(By.id("DoB")).sendKeys(signupinfo.DoB);
            driver.findElement(By.id("gender")).sendKeys(signupinfo.gender);
            driver.findElement(By.id("phone")).sendKeys(signupinfo.phone);
            driver.findElement(By.id("submit")).submit();
            //look for text field for if error message is displayed
            //print message saying if message is displayed or not along with signupinfo.task
        }


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
*/

        //successful login
        ArrayList<loginInfo> list = new ArrayList<>();
        list.add(new loginInfo("theCHAMP1@gmail.com", "password"));                     //successful
        list.add(new loginInfo("thislogindoesnotexist@gmail.com", "wrongpass"));        //not in database
        list.add(new loginInfo("", ""));                                                //nulls
        list.add(new loginInfo("theCHAMP1@gmail.com", "wrongpass"));                    //wrong pass
        int i =1;
        String url;
        for(loginInfo login : list) {
            driver.get("localhost:8080/index");
            driver.findElement(By.id("email")).sendKeys(login.login);
            driver.findElement(By.id("password")).sendKeys(login.password);
            driver.findElement(By.id("yes")).click();
            url = driver.getCurrentUrl();
            System.out.println(i + ". " + login.login + " | " + login.password + " | " + url);      //confirms logged in by url
            i++;
        }


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
        postList.add(longString);                                       //long string
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
class signUpInfo{
    public String fName, lName, email, password, DoB, gender, phone, task;
    public signUpInfo(String fName,String lName,String email,String password,String DoB,String gender,String phone,String task){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.DoB = DoB;
        this.gender = gender;
        this.phone = phone;
        this.task = task;
    }
}