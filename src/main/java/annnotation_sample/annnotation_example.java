package annnotation_sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class annnotation_example {
	  @Test
	  public void Demo() {
		  System.out.println("Papaa");
	  }
	  @BeforeMethod
	  public void Demo1() {
		  System.out.println("Rinitha");
	  }
	  @AfterMethod
	  public void Demo3() {
		  System.out.println("I Love You");
	  }
	  @BeforeClass
	  public void Demo4() {
		  System.out.println("Queen");
	  }
	  @BeforeTest
	  public void Demo5() {
		  System.out.println("My Dear");
	  }	
	  @AfterClass
	  public void Demo6() {
		  System.out.println("Miss u a lot");
	  }	
	  @AfterSuite
	  public void Demo7() {
		  System.out.println("Nee than En Ulagamaee");
	  }	
	  @AfterTest
	  public void Demo8() {
		  System.out.println("Unaku onu theriumaaa");
	  }	
}
