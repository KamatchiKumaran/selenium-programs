package crosBrowserTesting;
//		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
			public class crossBrowserTest {
			WebDriver driver;
			@BeforeTest
			@Parameters("browser")
			public void setup(String browser) throws Exception{
				if(browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://leaftaps.com/opentaps/control/login/");
				}
			}
			
			@Test
			public void testParameterWithXML() throws InterruptedException{
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			}
	}

