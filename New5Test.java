package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New5Test {
	  @Test(priority=0)
	  public void createCustomer() {
		  Reporter.log("createCustomer", true);
	  }
	  @Test(priority=1, enabled = false)
	  public void editCustomer() {
		  Reporter.log("editCustomer", true);
	  }
	  @Test(priority=2)
	  public void deleteCustomer() {
		  Reporter.log("deleteCustomer", true);
	  }
}
