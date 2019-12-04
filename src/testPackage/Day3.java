package testPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void webloginHome() {
		System.out.println("This is weblogin for Homeloan.");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am the first to execute");
	}
	@Test
	public void mobileloginHome() {
		System.out.println("This is mobilelogin for Homeloan.");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am the last to execute");
	}
	
	@Test(groups= {"Smoke"})
	public void mobilesigninHome() {
		System.out.println("This is mobile sign in for Homeloan.");
	}
	
	@Test
	public void mobilesignoutHome() {
		System.out.println("This is mobile sign out for Homeloan.");
	}
	@Test
	public void apiloginHome() {
		System.out.println("This is apilogin for Homeloan.");
	}
}
