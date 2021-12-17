package Login_module;

//import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;

import javax.xml.xpath.XPathExpression;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement Ele1 = driver.findElement(By.xpath("//span[text()='Returns']/.."));
		Ele1.click();
		WebElement Ele2 = driver.findElement(By.xpath("(//input[@name='email'])"));
		Ele2.sendKeys("8220536277");
		WebElement Ele3 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		Ele3.click();
}
}
