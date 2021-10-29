package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New6Test {
	  @Test
	  public void createCustomer() {
		  Reporter.log("createCustomer", true);
	  }
	  @Test(dependsOnMethods = {"createCustomer"} )
	  public void editCustomer() {
		  Reporter.log("editCustomer", true);
	  }
	  @Test(dependsOnMethods = {"editCustomer"})
	  public void deleteCustomer() {
		  Reporter.log("deleteCustomer", true);
	  }
}
