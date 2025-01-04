package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.Generic;
import pages.CommonPageOHRM;
import pages.LoginPageOHRM;
import pages.PIMPageOHRM;

public class PIM_TCs extends Generic {
	
	@Test 
	public void pimPageVaidateWithEmpName() throws Exception {
		
//		Login_TCs logobj = new Login_TCs();
//		logobj.validateHRMLogin();
		
		Generic.extentLogger = extentReport.createTest("TC01_Validating PIM login");
		LoginPageOHRM loginPage = new LoginPageOHRM(driver);
		loginPage.loginOrangeHrmApplication1("Admin", "admin123");
		
		CommonPageOHRM commonPage = new CommonPageOHRM(driver);
		commonPage.goToAPage("PIM");
		

		PIMPageOHRM obj = new PIMPageOHRM(driver);
		obj.pimPageEmployeeName("Charles");
		obj.pimPageResetSearchButton("Search");

		scrollToBottomOfThePage();

	}

}
