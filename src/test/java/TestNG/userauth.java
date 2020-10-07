package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class userauth {
	  WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 driver = new ChromeDriver();
         //FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://192.168.56.101:3001");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  ///////ChromeOptions ChromeOptions = new ChromeOptions();
		  //ChromeOptions.addArguments("window-size=1024,768", "--no-sandbox");
		  //driver = new ChromeDriver(ChromeOptions);
		  ChromeOptions chromeOptions = new ChromeOptions(); 
		  chromeOptions.addArguments("--headless"); 
		  chromeOptions.addArguments("--no-sandbox"); 
		  WebDriver driver = new ChromeDriver(chromeOptions); 
		  chromeOptions.addArguments("--headless"); 
		  chromeOptions.addArguments("--no-sandbox");
		  chromeOptions.addArguments("--disable-dev-shm-usage");
		  ChromeOptions ChromeOptions = new ChromeOptions();
		  ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		  driver = new ChromeDriver(ChromeOptions);
	
	}
  @Test
  public void verifyauth() {
	  driver.findElement(By.name("login")).sendKeys("devops");
	  driver.findElement(By.name("password")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
  }
  
 // @AfterMethod
  //public void close() {
	//  driver.close();
	//}
}