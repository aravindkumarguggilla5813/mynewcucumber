package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClass {
	
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using ="Log in") WebElement login; 
	@FindBy(how=How.ID,using ="Email") WebElement username;
	@FindBy(how=How.NAME,using="Password") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement log;

public PageClass(WebDriver driver)
{
	this.driver=driver;
	
}

public void loginMethod(String uid ,String pwd)
{
	login.click();
	username.sendKeys(uid);
	password.sendKeys(pwd);
	log.click();
}
	

	
}

