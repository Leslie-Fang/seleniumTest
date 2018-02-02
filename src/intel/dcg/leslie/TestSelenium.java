package intel.dcg.leslie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestSelenium {
    public static  WebDriver driver = null;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Suite Begin!");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Suite Done!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test Begin!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Test Done!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Class Begin!");
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/leslie/testcode/javaTestCode/ChromeDriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Class Done!");
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Method Begin!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Method Done!");
    }


    @Test
    public void testGoogleSearch(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        WebElement searchBox = driver.findElement(By.name("wd"));
        searchBox.sendKeys("search something");
        searchBox.submit();
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testGoogleSearch2(){
//        // Optional, if not specified, WebDriver will search your path for chromedriver.
//        System.setProperty("webdriver.chrome.driver", "/Users/leslie/testcode/javaTestCode/ChromeDriver/chromedriver");
//        //System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
//        WebDriver driver = new ChromeDriver();
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        WebElement searchBox = driver.findElement(By.name("wd"));
        searchBox.sendKeys("search something2");
        searchBox.submit();
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
//        driver.quit();
    }
}
