import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class test{
    public static void main(String[] args){
        System.out.println("Test Begin");
        new test().testGoogleSearch();
        System.out.println("Test Done");
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
        searchBox.sendKeys("ChromeDriver hhh");
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