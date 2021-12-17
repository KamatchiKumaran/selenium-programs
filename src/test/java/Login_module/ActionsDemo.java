package Login_module;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement logo = driver.findElement(By.xpath("//a[@class='logo']/*"));
		File temp = logo.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screen_shot/logo.png");
		try {
			FileUtils.copyFile(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ele = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele);
		List<WebElement> elem = driver.findElements(By.xpath("//ul[@id='developers-menu-dropdown']/li"));
		for(WebElement element1 : elem ) {
			System.out.println(element1.getText());
		}
		
	}

}

	
