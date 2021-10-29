package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New2Test {
  @Test
  public void f() {
	  Reporter.log("Hi", true);
  }
  @Test
  public void a() {
	  Reporter.log("Hello", true);
  }
  @Test
  public void g() {
	  Reporter.log("hey", true);
  }
  @Test
  public void b() {
	  Reporter.log("Hi hello", true);
  }

}
