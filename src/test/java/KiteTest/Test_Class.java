package KiteTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_Class;
import Pom_classes.Pom1;
import Pom_classes.Pom2;
import Pom_classes.Pom3;
import Utility.Utility_class;

public class Test_Class extends Base_Class{
	//declare all useful members as global
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
@BeforeClass
public void openBrowser()throws Throwable{
	initilizeBrowser();
	//all objects of POM class
	login1 = new Pom1(driver);
	login2 = new Pom2(driver);
	home = new Pom3(driver);
}

@BeforeMethod
public void loginToApp()throws Throwable{
	//enter un 
	login1.enterUN(Utility_class.geTD(0, 0));
	System.out.println(Utility_class.geTD(0, 0));
	
	//enter pwd
	login1.enterPWD(Utility_class.geTD(0, 1));
	
	//clck on login btn
	login1.clickLogin();
	
	//enter pin
	login2.enterPIN(Utility_class.geTD(0, 2));
	
	//click on continue btn
	login2.clickctnbtn();
}
@Test
public void verifyuserID() throws Throwable {
	Reporter.log("running verify user id",true);
	String actID = home.verifyuserID();
	 String expID=Utility_class.geTD(0, 0);
	Assert.assertEquals(expID,actID,"both are same tc is failed");
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
	
}

}
