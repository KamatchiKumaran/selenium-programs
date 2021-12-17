package Login_module;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;

public class Demo2 extends BaseClass {
	
	@AfterSuite
	public void thirdStep() {
		driver.quit();
	}

}
