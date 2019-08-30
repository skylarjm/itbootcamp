/*package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Header.NavigationMenu1;
import pages.Header.NavigationMenu2;
import pages.Header.PageURLs;
import pages.DonatePage;
import pages.JobsPage;
import pages.AboutPage;
import pages.ContactPage;
import pages.BlogPage;
import pages.ProjectsPage;
import pages.HelpPage;

public class NavigationTest {
	public static final String SearchTerm = "book";
	public static final String AMOUNT = "1000";
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\freak\\Desktop\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test
	public void navigationTest() throws Exception{
		
		driver.navigate().to(PageURLs.HELP_PAGE);
		//new NavigationMenu2(driver).clickOnWebIcon();
		//new NavigationMenu1(driver).sendTextToWayBackSearch(SearchTerm);
		//new NavigationMenu1(driver).searchWayToBack();
		//new NavigationMenu2(driver).clickOnTextIcon();
		//new NavigationMenu1(driver).clickOnTextsFeaturedElements(2);
		//new DonatePage(driver).clickOnAmount(5);
		//new DonatePage(driver).customAmount(AMOUNT);
		//int abc = new JobsPage(driver).getNumberOfElements();
		//System.out.println(abc);
		//new AboutPage(driver).clickOnMoreButton();
		//int abc = new AboutPage(driver).newsListNumberOfElements();
		//System.out.println(abc);
		//new ContactPage(driver).clickOnMap2();
		//new BlogPage(driver).selectFromDropdown(2);
		//int abc = new ProjectsPage(driver).listOfProjects();
		//System.out.println(abc);
		
		
		

}
}
*/