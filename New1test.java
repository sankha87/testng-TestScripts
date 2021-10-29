package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New1Test {
  @Test
  public void fb() {
	  Reporter.log("hi", true);
  }
  @Test
  public void fd() {
	  Reporter.log("hi hello hi", true);
  }
  @Test
  public void fc() {
	  Reporter.log("hi hello", true);
  }
}
