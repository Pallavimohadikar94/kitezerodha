package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;

  
public Pom3(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void verifyuserID(String expID) {
	String actID = userID.getText();
	if(expID.equals(actID)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}