package Tests;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void lastexecution()
	{
		
		
		System.out.println("Last execution 1");
		System.out.println("Last execution 2");
		System.out.println("Last execution 3");
		System.out.println("Last execution 4");
	}
	
	@Test (groups={"smoke"})
	public void ploan() {
		
		
		System.out.println("Personal loan ");
	}
	
	@BeforeSuite
	public void prerequisite() 
	{
		System.out.println("I will execute first");
		
	}

}
