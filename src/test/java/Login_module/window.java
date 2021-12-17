package Login_module;

//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	@Test
	public static void windows() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("						");
//		WebElement one = driver.findElement(By.xpath("//a[@href= 'pages/Window.html']"));
//		one.click();
		WebElement two = driver.findElement(By.xpath("//a[@href='pages/Alert.html']"));
		two.click();
		WebElement ale1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		ale1.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		
		
	
			
		
//		Set <String> windows = driver.getWindowHandles();
//		for (String eachhandle: windows)
//		{
//			System.out.println(eachhandle);
//
//		java.util.List<String> list = new ArrayList<String>(windows);
//		String secondid = list.get(2);
//		driver.switchTo().window(secondid);
//		driver.manage().window().maximize();
//		WebElement three = driver.findElement(By.xpath("//body[@class='page page-id-153 page-template page-template-page-keyword-category page-template-page-keyword-category-php']"));
//		three.click();
//		WebElement four = driver.findElement(By.xpath("//button[@id='home']"));
//		four.click(); 
		//button[@id='home']
		//http://leafground.com/
		//a[@href= 'pages/Window.html']
	}//body[@class='page page-id-153 page-template page-template-page-keyword-category page-template-page-keyword-category-php']

}
