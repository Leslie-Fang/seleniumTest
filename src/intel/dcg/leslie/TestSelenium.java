package intel.dcg.leslie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestSelenium {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Test Class Begin!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Test Class Done!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test Begin!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Test Done!");
    }

    @Test
    public void testGoogleSearch(){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/leslie/testcode/javaTestCode/ChromeDriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
        WebDriver driver = new ChromeDriver();
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
        driver.quit();
    }

    @Test
    public void testGoogleSearch2(){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/leslie/testcode/javaTestCode/ChromeDriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
        WebDriver driver = new ChromeDriver();
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
        driver.quit();
    }
}
