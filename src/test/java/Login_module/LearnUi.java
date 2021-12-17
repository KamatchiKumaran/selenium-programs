package Login_module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnUi   {

	public static void main(String[] args) {
		
//		Hover Effect
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		
		
		
//		Drag and Drop
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leafground.com/pages/drop.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		WebElement Source = driver.findElement(By.id("draggable"));
//		WebElement Target = driver.findElement(By.id("droppable"));
//		Actions builder = new Actions(driver);
//		builder.dragAndDrop(Source, Target).perform();
//		driver.close();
		
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leafground.com/pages/selectable.html");
//		driver.manage().window().maximize(); 
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
//		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
//		WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
//		WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
//		WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
//		WebElement ele7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
//		Actions builder = new Actions(driver);
//		builder.keyDown(Keys.CONTROL).click(ele1).click(ele3).click(ele5).click(ele7).keyUp(Keys.CONTROL).perform();
		
		
		
		 
		  
		
	}

}







