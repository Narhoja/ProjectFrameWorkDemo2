package utilities;

import pageObjects.CommonPage;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class PageInitialiser extends BaseClass {
	public static HomePage hp;
	public static LoginPage lp;
	public static DashboardPage dp;	
	public static CommonPage cp;
	
	public static void initialise() {
		hp = new HomePage();
		lp = new LoginPage();
		cp = new CommonPage();
		dp= new DashboardPage();
				
	}
}
