package Oct30_TestNG;

import org.testng.annotations.*;

public class TestNG {

@BeforeSuite

	public void beforeSuite() {
		System.out.println("Testing @BeforeSuite annotation");
}

@BeforeTest

	public void beforeTest() {
		System.out.println("Testing @BeforeTest annotation");
}

@BeforeClass

	public void beforeClas() {
		System.out.println("Testing @BeforeClass annotation");
}

@BeforeMethod

	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
}

@Test

	public void testcase() {
		System.out.println("My code is working fine");
}

@AfterSuite

	public void afterSuite() {
		System.out.println("Testing @AfterSuite annotation");
}

@AfterTest

	public void afterTest() {
		System.out.println("Testing @AfterTest annotation");
}

@AfterClass

	public void afterClass() {
		System.out.println("Testing @AfterClass annotation");
}

@AfterMethod

	public void afterMethod() {
		System.out.println("Testing @AfterMethod annotation");
}
}
