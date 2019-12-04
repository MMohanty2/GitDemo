package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("I execute before every testcase");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("I execute after every testcase");
	}
	@Test
	public void pLoan() {
		System.out.println("Some loan account");
	}

}
