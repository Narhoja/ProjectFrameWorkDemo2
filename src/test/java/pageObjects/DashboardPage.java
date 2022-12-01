package pageObjects;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage {
	
	public DashboardPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
}
