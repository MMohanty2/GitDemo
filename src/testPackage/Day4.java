package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void webloginCar() {
		System.out.println("This is weblogin for Carloan.");
	}
	@Test(groups= {"Smoke"})
	public void mobileloginCar() {
		System.out.println("This is mobilelogin for Carloan.");
	}
	@Test(groups= {"Smoke"})
	public void apiloginCar() {
		System.out.println("This is apilogin for Carloan.");
	}
	@BeforeMethod
	public void bfmethod() {
		System.out.println("I execute before every method of the class I belong");
	}
	@AfterMethod
	public void afmethod() {
		System.out.println("I execute after every method of the class I belong");
	}

}
