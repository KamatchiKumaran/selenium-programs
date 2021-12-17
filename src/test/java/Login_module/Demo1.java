package Login_module;

//import java.io.File;
//import java.io.File;
//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 extends BaseClass {
	
	@Test(dataProvider="sendData")
	public void secondstep(String company, String fName, String lName ) throws IOException {
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.linkText("Create Lead")).click();;
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
	}
		@DataProvider
		public String[][] sendData(){
			String[][] data = new String [2][3];
			
			data[0][0]="Testleaf";
			data[0][1]="Flower";
			data[0][2]="Butterfly";
			
			data[1][0]="Infosys";
			data[1][1]="Butterfly";
			data[1][2]="Flower";
			return data;
			
		
		
		
//		File source = driver.getScreenshotAs(OutputType.FILE);
//		File target = new File("./Learning_selenium/screen_shot/one.png");
//		FileUtils.copyFile (source,target);
		//button[@id='ext-gen334']
		//input[@class=' x-form-text x-form-field ']
		//a[@href='/crmsfa/control/createLeadForm;jsessionid=4EFB2A28DF5A899C26E15383B4F2DA02.jvm1']
		//a[@style='color: black;']
		//input[@id='username']
		//input[@id='password']
		//input[@class='decorativeSubmit']
			 
		
	}

}
