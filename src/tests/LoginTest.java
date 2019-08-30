package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageURLs;
import pages.Header.NavigationMenu2;
import pages.pages.LoginPage;

public class LoginTest {

	WebDriver driver;

	public static final String EMAIL = "foo@gmail.com";
	public static final String PASSWORD = "bar";

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void MainTest() throws Exception {

		// Test 6

		driver.navigate().to(PageURLs.MAIN_PAGE);
		new NavigationMenu2(driver).clickOnSignIn();
		Assert.assertTrue(new LoginPage(driver).getLoginButton().isDisplayed());
		new LoginPage(driver).inputEmail(EMAIL);
		new LoginPage(driver).inputPassword(PASSWORD);
		new LoginPage(driver).clickOnLogin();
		Assert.assertTrue(new LoginPage(driver).getErrorMessage().isDisplayed());

		// Test 7
		String search = "terms";
		driver.navigate().to(PageURLs.MAIN_PAGE);
		new NavigationMenu2(driver).clickOnSignIn();
		Assert.assertTrue(new LoginPage(driver).getForgotPassword().isDisplayed());
		new LoginPage(driver).clickOnSignUp();
		new LoginPage(driver).clickOnTermOfConditions();
		Thread.sleep(3000);
		new LoginPage(driver).switchToNextWindow();
		Assert.assertTrue(driver.getCurrentUrl().contains(search));

	}
}
