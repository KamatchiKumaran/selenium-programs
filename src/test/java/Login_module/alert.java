package Login_module;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		WebElement two = driver.findElement(By.xpath("//a[@href='pages/Alert.html']"));
		two.click();
//		WebElement three = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
//		three.click();
//		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
//		WebElement four = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
//		four.click();
//		Alert alert2 = driver.switchTo().alert();
//		alert1.dismiss();
		
		
		WebElement five = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		five.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("kamatchi");
		alert3.accept();
		WebElement six = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		six.click();
		Alert alert4 = driver.switchTo().alert();
		System.out.println(alert4.getText());
		alert4.dismiss();  
		WebElement seven = driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		seven.click();
		//button[@onclick='sweetalert()']
		
		
		//button[@onclick='normalAlert()']
	
	}

}
