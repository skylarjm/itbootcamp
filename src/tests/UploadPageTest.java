package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Header.NavigationMenu2;
import pages.Header.NavigationMenu3;
import base.PageURLs;
import pages.pages.UploadPage;

public class UploadPageTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void Test3() throws Exception {

		// Test 5

		driver.navigate().to(PageURLs.MAIN_PAGE);
		new NavigationMenu2(driver).clickOnUpload();
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("Log in"));
		Assert.assertTrue(pageSource.contains("Sign up"));

	}

}
