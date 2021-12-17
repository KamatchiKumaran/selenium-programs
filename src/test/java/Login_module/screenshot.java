package Login_module;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	ChromeDriver driver;
	
	@Test
	public void Start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/");	
	}
	@Test
	public void webEle() {
		WebElement two = driver.findElement(By.xpath("//a[@href='pages/Alert.html']"));
		two.click();
		WebElement five = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		five.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("kamatchi");
		alert3.accept();
		}
	@Test
	public void screenShot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File("screenshot.png");
		FileUtils.copyFile(src, tar);
	}
}
