package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

public class BasicSeleniumTest {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        // implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // page load wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://ticktick.com/");
    }

    @AfterEach
    public void cleanup(){
        driver.quit();
    }

    @Test
    public void verifyCRUDProject() throws InterruptedException {

        // login
        driver.findElement(By.xpath("//div[@class='navRow_236y3 container']/ul/li/a[text()='Sign In']")).click();
        driver.findElement(By.id("emailOrPhone")).sendKeys("final@bootcamp.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        Thread.sleep(5000);
        String nameProject="Bootcamp";
        driver.findElement(By.xpath("//div[@id='project-list-scroller']/div[2]/section[1]/div[1]/li/a/button[2]/div")).click();
        driver.findElement(By.id("edit-project-name")).sendKeys(nameProject);
        driver.findElement(By.xpath("//button[@class='ap-button ap-button-middle ap-button-primary']")).click();
        driver.findElement(By.xpath("//ul[@id=\"project-ul\"]/div/li/div/button/div[3]/div")).click();
        driver.findElement(By.xpath("//div[13]/div/div/div[2]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//button[@class='rounded-[4px] leading-none transition-colors duration-200 ease-in text-center cursor-pointer inline-block relative disabled:cursor-not-allowed btn btn-primary bg-primary text-white border border-[transparent] border-solid disabled:bg-btn-disable-color hover:bg-btn-hover-color focus:bg-btn-hover-color  active:bg-btn-active-color med h-[32px] text-[14px] px-[18px] min-w-[80px]']")).click();

        Thread.sleep(1000);


    }
}
