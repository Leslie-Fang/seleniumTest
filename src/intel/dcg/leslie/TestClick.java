package intel.dcg.leslie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestClick {
    public static WebDriver driver = null;

    //两个文件中(在xml中属于同一个test tag下面)都有beforetest，两个beforetest 都会被执行
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Test Begin2!");
//    }
//
//    @AfterTest
//    public void afterTest(){
//        System.out.println("Test Done2!");
//    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Class Begin2!");
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/leslie/testcode/javaTestCode/ChromeDriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Class Done2!");
        driver.quit();
    }
    //当前文件中都有beforemethod会被执行，要是当前文件中没有则不会执行
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("Method Begin2!");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("Method Done2!");
//    }

    @Test
    public void testD3(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.get("http://47.91.245.251:5000/");
        WebElement clickButton = driver.findElement(By.linkText("Show Dummy Data"));
        clickButton.click();
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
