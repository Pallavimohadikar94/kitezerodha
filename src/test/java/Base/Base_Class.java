package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public WebDriver driver;
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

}
