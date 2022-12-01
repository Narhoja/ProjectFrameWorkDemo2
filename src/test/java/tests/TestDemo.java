package tests;

import org.testng.annotations.BeforeClass;

import utilities.BaseClass;
import utilities.BaseClass51;
import utilities.CommonMethods;

public class TestDemo extends CommonMethods{

	@BeforeClass
	public void beforeTest() {
		BaseClass.getDriver();
	}
}
