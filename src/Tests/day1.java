package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.*;




public class day1 {
	
	@Test
	public void demo() {
		
		System.out.println("Hello ");
		System.out.println("Whats up ??? ");
		System.out.println("How are you ..!! ");
	}
	
	@AfterSuite
    public void AFSuite() {
		
		System.out.println("I m the last ");
		System.out.println("I m first ");
		System.out.println("I m second ");
		
	}

	@Test
	public void secondTestcases() {
		
		System.out.println("Byee..");
		
		System.out.println("See you .....");
		System.out.println("See you sooonn..");
	}
	

}
