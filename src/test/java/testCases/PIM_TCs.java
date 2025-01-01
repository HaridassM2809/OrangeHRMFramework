package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.PIMPageOHRM;

public class PIM_TCs extends Login_TCs {
	
	@Test (priority = 2)
	public void pimPageVaidateWithEmpName() {

		PIMPageOHRM obj = new PIMPageOHRM(driver);
		obj.pimPageEmployeeName("Charles");
		obj.pimPageResetSearchButton("Search");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");

	}

}
