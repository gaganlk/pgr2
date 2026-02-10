package dev_prg1;
  
import org.testng.Assert;
import org.testng.annotations.Test;



public class Resulttest {
  @Test 
  public void testPass() {
	  Assert.assertEquals(result.display(55),"pass");
  }
  
  @Test
  public void testFail() {
	  Assert.assertEquals(result.display(35),"fail");
  }
  @Test
  public void testinvalid() {
	  Assert.assertEquals(result.display(101),"invalid");
  }
  
}
