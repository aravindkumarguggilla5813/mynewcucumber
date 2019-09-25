package extenreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class logintest {
  WebDriver driver =null;
	@Test
  public void Login() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver(); 
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
driver.findElement(By.name("Password")).sendKeys("aravind");
driver.findElement(By.xpath("//input[@value='Log in']")).click();
ExtentHtmlReporter reporter= new ExtentHtmlReporter("C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\Extentreport.html");
ExtentReports extent= new ExtentReports();
extent.attachReporter(reporter);
ExtentTest logger=extent.createTest("Login");
logger.log(Status.FAIL, MarkupHelper.createLabel("test case failed", ExtentColor.RED));
logger.log(Status.PASS, "Login successfull");
extent.flush();












	  
	  
  }
}
