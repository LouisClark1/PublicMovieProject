// Generated by Selenium IDE
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() throws InterruptedException {

    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1200, 1000));
    Thread.sleep(3000);
    driver.findElement(By.id("addFilmTitleTextInput")).click();
    driver.findElement(By.id("addFilmTitleTextInput")).sendKeys("Extra special example");
    Thread.sleep(1000);
    driver.findElement(By.id("addFilmLangIDTextInput")).click();
    driver.findElement(By.id("addFilmLangIDTextInput")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.id("addFilmDescriptionTextInput")).click();
    driver.findElement(By.id("addFilmDescriptionTextInput")).sendKeys("keep this quiet");
    Thread.sleep(1000);
    driver.findElement(By.id("addFilmLengthTextInput")).click();
    driver.findElement(By.id("addFilmLengthTextInput")).sendKeys("26");
    Thread.sleep(1000);
    driver.findElement(By.id("addButtonInput")).click();
    Thread.sleep(1000);
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = driver.switchTo().alert();
      String text = alert.getText();
      alert.accept();
      assertEquals("A name was submitted: Extra special example", text);
    } catch (Exception e) {
      //exception handling
    }
    Thread.sleep(2000);

    driver.findElement(By.id("removeFilmTextInput")).click();
    driver.findElement(By.id("removeFilmTextInput")).sendKeys("1047");

    Thread.sleep(1000);
    driver.findElement(By.id("removeButtonInput")).click();
    Thread.sleep(1000);
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = driver.switchTo().alert();
      String text = alert.getText();
      alert.accept();
      assertEquals("Film number 1047 was deleted", text);
    } catch (Exception e) {
      //exception handling
    }
    Thread.sleep(1000);

    driver.findElement(By.id("searchTextInput")).click();
    driver.findElement(By.id("searchTextInput")).sendKeys("egg");
    driver.findElement(By.id("searchButtonInput")).click();


    Thread.sleep(3000);



  }
}
