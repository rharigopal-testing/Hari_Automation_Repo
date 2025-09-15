package SeleniumTestNGDemo.Learning;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest2 {
	
@BeforeTest
public void setup() {
	System.out.println("we are in Before Test");
	}

	@Test(priority=2)
  public void add() {
		int a1 =10, a2=20;
		int a3=a1+a2;
	  System.out.println("Addition of "+a1+" and "+a2+" is : "+a3);
	  Assert.assertEquals(20, a3);
  }
  @Test(priority = 1, groups ="Snaity")
  public void sub() {
	  int s1=50, s2=30;
	  System.out.println("Substraction of "+s1+" and "+s2+" is : "+s1+s2);
  }
  @Test(priority = 0)
  public void mul() {
	  int m1=50, m2=30;
	  System.out.println("Multiplication of "+m1+" and "+m2+" is : "+m1+m2);
  }
 
@AfterTest
public void teardown() {
	System.out.println("we are in After Test");
}

  
}
