package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void weblogingCarloan(String urlname) 
	{
		
		System.out.println("Web login Car");
		System.out.println(urlname);
		
	}
	
	@BeforeMethod
	public void BM() 
	{
		
		System.out.println("Before methods I m executing 1");
		System.out.println("Before methods I m executing 2");
		System.out.println("Before methods I m executing 3");
		System.out.println("Before methods I m executing 4");
		
	}
	
	@AfterMethod
	public void AM() 
	{
		
		System.out.println("After methods I m executing ");
		
	}
	
	@Test (groups={"smoke"})
	public void MobilelogingCarloan() 
	{
		
		System.out.println("Mobile car loan");
		
	}
	
	@Test(timeOut=4000)
	public void MobileSignoutCarloan() 
	{
		
		System.out.println("Mobile car Sign out");
		
	}
	
	@Test
	public void MobileSignINCarloan() 
	{
		
		System.out.println("Mobile car Sign in");
		
	}
	
	@Test
	public void APIlogingCarloan() 
	{
		
	System.out.println("API car loan");	
	
		
	}

}
