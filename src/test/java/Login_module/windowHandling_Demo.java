package Login_module;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling_Demo {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TakesScreenshot tks = (TakesScreenshot)driver;
	File temp = tks.getScreenshotAs(OutputType.FILE);
	File perm = new File("first.png");
	try {
		FileUtils.copyFile(temp,perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement ele = driver.findElement(By.xpath("//div[@class='top-bar-wrapper body-row']"));
	File temp1 = ele.getScreenshotAs(OutputType.FILE);
	File perm1 = new File("first1.png");
	try {
		FileUtils.copyFile(temp1, perm1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
//canvas[@class='ns-hc15b-e-3 image']