package seleniumBasis;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
@Test
	public void testCase1() {
		System.out.println("Test case");
	}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("After method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before class");
}
@AfterClass
public void afterClass() {
	System.out.println("After class");
}
@BeforeTest
public void beforeTest() {
	System.out.println("Before test");
}
@AfterTest
public void afterTest() {
	System.out.println("After test");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before suite");
}
@AfterSuite
public void afterSuite() {
	System.out.println("After suite");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
