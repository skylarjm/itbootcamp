package tests;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.Header.NavigationMenu1;
import pages.Header.NavigationMenu2;
import base.PageURLs;

public class SearchTest {

	WebDriver driver;
	public static final String SearchTerm = "qa";
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\freak\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void navigationTest() throws Exception {
		
		//Test3
		
		driver.navigate().to(PageURLs.MAIN_PAGE);
		new NavigationMenu2(driver).clickOnTextIcon();
		new NavigationMenu1(driver).clickOnTextsFeaturedElements(0);
		String url = new MainPage(driver).getChildWindowUrl();
		System.out.println(url);
		driver.navigate().to(PageURLs.MAIN_PAGE);
		new MainPage(driver).clickOnTextsIcon();
		String url1 = new MainPage(driver).getChildWindowUrl();
		System.out.println(url1);
		Assert.assertTrue(url.equals(url1));
		
		// Test4
		
		driver.navigate().to(PageURLs.MAIN_PAGE);
		new MainPage(driver).clickOnSearchBar();
		Boolean visible = new MainPage(driver).dropDownShow();
		Assert.assertTrue(visible, "Dropdown is not visible.");
		new MainPage(driver).sendTextToSearch(SearchTerm);
		new MainPage(driver).clickOnGoButton();
		String search = "?query=qa";
		Assert.assertTrue(driver.getCurrentUrl().contains(search));

	}
}
