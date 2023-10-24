package swaglab;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		LoginFuncation(StandardUserName,passWord);
		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		LoginFuncation(ProblemUserName,passWord);
		Thread.sleep(3000);


	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		LoginFuncation(PerformanceUserName,passWord);
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void myPostTesting() {
	}

}
