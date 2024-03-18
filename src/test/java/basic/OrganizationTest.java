package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common_utils.PropertyFileUtil;
import common_utils.WebDriverUtil;


public class OrganizationTest {
	@Test
	public void createOrganizationsTest() throws IOException, InterruptedException {
		
		PropertyFileUtil propertyFileUtil=new PropertyFileUtil();
		WebDriverUtil webDriverUtil=new WebDriverUtil();
		
			WebDriver driver=new ChromeDriver();
			//to maximize the window
			webDriverUtil.maximize(driver);
			//to apply wait
			webDriverUtil.implicitWait(driver);
			
			//to read data from property file
			String URL = propertyFileUtil.getDataFromPropertyFile("Url");		
			String USERNAME = propertyFileUtil.getDataFromPropertyFile("Username");
			String PASSWORD = propertyFileUtil.getDataFromPropertyFile("Password");
			
			//launch application
			driver.get(URL);
			
			Thread.sleep(2000);
			//enter username in username text fiels
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			
			Thread.sleep(2000);
			//enter password in password text field
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			
			Thread.sleep(2000);
			//click on login button
			driver.findElement(By.id("submitButton")).click();
	}
}
