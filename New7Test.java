package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class New7Test {
	  @Test
	  public void createCustomer() {
		  Reporter.log("createCustomer", true);
	  }
	  @Test(dependsOnMethods = {"createCustomer"} )
	  public void editCustomer() {
		  WebDriver d = new SafariDriver();
		  Reporter.log("editCustomer", true);
	  }
	  @Test(dependsOnMethods = {"editCustomer"}, alwaysRun = true)
	  public void deleteCustomer() {
		  Reporter.log("deleteCustomer", true);
	  }
}
