package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class day1 {
	
	@Test
	public void demo() {
		
		System.out.println("Hello ");
	}
	
	@AfterSuite
    public void AFSuite() {
		
		System.out.println("I m the last ");
	}

	@Test
	public void secondTestcases() {
		
		System.out.println("Byee..");
	}
	

}
