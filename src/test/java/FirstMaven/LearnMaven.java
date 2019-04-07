package FirstMaven;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LearnMaven
{
    protected static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();//getting chrome browser
        // implicit wait applied
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test

        public void userShouldBeRegisterSuccessfully()
        {
            driver.get("https://demo.nopcommerce.com/register");
            driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("abc123");
            driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("efg123");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc123" + "@test.com");
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcefg");
            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abcefg");

        }
        @Test
        public void currency()
        {


        }
        @Test
        public void jewelleryLink()
        {

        }
//        String actualRegistrationSuccessMessage = driver.findElement(By.xpath("//div[@class'result']")).getText();
//
//        Assert.assertEquals("Your registration completed",actualRegistrationSuccessMessage);
//        driver.quit();



    @After
    public void closeBrowser() {

    }
}