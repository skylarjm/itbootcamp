package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageURLs;
import pages.MainPage;
import pages.Header.NavigationMenu1;
import pages.Header.NavigationMenu2;

public class MainPageTest {

	WebDriver driver;
	public static final String SearchTerm = "qa";

	// MainPage main = new MainPage(driver);

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\freak\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void Test1() throws Exception {

		// Test1

		driver.navigate().to(PageURLs.MAIN_PAGE);
		Assert.assertTrue(new MainPage(driver).getTopCollectionsSize() >= 20);

		MainPage main = new MainPage(driver);

		Assert.assertTrue(main.getTopCollectionsSize() >= 20);
		main.getTopCollectionsSize();
		List<WebElement> tekst = new MainPage(driver).getTopCollections();
		for (WebElement i : tekst) {
			Assert.assertTrue(i.getText().toLowerCase().contains("items"));
		}

		// Test2
		driver.navigate().to(PageURLs.MAIN_PAGE);
		List<WebElement> collections = new MainPage(driver).getNumberOfItems();
		WebElement number = collections.get(0);
		String[] views1 = number.getText().split("[\\n]");
		System.out.println(views1[0]);

		new MainPage(driver).clickOnTopCollectionItem(0);
		WebElement results = new MainPage(driver).resultNumbers();
		String[] views2 = results.getText().split("[\\s]");
		System.out.println(views2[0]);
		Assert.assertTrue(views2[0].equals(views1[0]), "Results are not the same.");

		// Test3

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
