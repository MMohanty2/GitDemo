package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Demo() {
		System.out.println("This is first test case");
	}
	@Test(groups= {"Smoke"})
	public void SecondDemo() {
		System.out.println("This is second test case");
	}
	@BeforeClass
	public void bfclass() {
		System.out.println("I execute before the java class I belong");
	}
	@AfterClass
	public void afclass() {
		System.out.println("I execute after the java class I belong");
	}
}
