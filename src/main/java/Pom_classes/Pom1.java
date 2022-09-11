package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//step1 Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LOGINBTN;
	
	//step2 initialization
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver,this); 
	}
	
	
	//implementation
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLogin() {
		LOGINBTN.click();
	}
}

