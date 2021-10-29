package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New4Test {
	  @Test(priority=0, invocationCount = 4)
	  public void createCustomer() {
		  Reporter.log("createCustomer", true);
	  }
	  @Test(priority=1, invocationCount = 3)
	  public void editCustomer() {
		  Reporter.log("editCustomer", true);
	  }
	  @Test(priority=2)
	  public void deleteCustomer() {
		  Reporter.log("deleteCustomer", true);
	  }
}
