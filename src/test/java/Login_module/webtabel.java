package Login_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtabel {
	public static void main(String[] args)  throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		java.util.List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowcount = rows.size();
		java.util.List<WebElement> data = driver.findElements(By.xpath("//table[@id='table_id']//tr[2]/td"));
		int datacount = data.size();
		for (int i=2; i<=rowcount;i++) {
			for (int j=1; j<=datacount; j++) {
				if (j==3)
				{
					 driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]/input")).click();
				} else {
		String one = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
		System.out.println(one);
				}
		}
		}
	}
}
