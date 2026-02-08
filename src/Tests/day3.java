package Tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.beust.jcommander.Parameter;

public class day3 {
	
	
	@BeforeClass
	public void beforeclass() 
	{
		
		System.out.println("It is executed before class");
		
	}
	
	@Parameters({"URL","APIkey/userkey"})
	@Test
	public void webloginHomeloan(String urlname,String key) 
	{
		
		System.out.println("Web login Home");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	@BeforeSuite
	public void BFsuite() 
	{
		
		System.out.println("I'm no 1");
		
	}
	
	@Test 
	public void MobilelogingHomeloan() 
	{
		
		System.out.println("Mobile Home loan");
		
	}
	
	@Test (dataProvider="getData")
	public void MobileSignHomeloan(String username, String password) 
	{
		
		System.out.println("Mobile sign In loan");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(dependsOnMethods= {"webloginHomeloan","MobilelogingHomeloan"})
	public void APIlogingHomeloan() 
	{
		
	System.out.println("API Home loan");	
		
	}
	
	@DataProvider
	public Object[][] getData() 
	{
	// passing the different types of data as input
	
		
	Object [][] data = new Object[3][2];	
	
	// 1st set
	
	data [0][0]="firstsetusername";
	data[0][1]="firstpassword";
	
	// 2nd set
	
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	
	// 3rd set
	
	data[2][0]="thirdusername";
	data[2][1]="Thirdpassword";
		
	return data;
	}
	
	@Test	
	public void lastexecution() {
			
			System.out.println("I will execute last..");
			Assert.assertTrue(false);
			
		}
	

}
