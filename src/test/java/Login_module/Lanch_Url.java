package Login_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lanch_Url {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.click();
		username.sendKeys("demoSalesManager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("crmsfa");
		WebElement button = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		button.click();
		WebElement link = driver.findElement(By.xpath("//div[@id='label']"));
		link.click();
		//WebElement createLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']"));
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();



		
	
	}

}
