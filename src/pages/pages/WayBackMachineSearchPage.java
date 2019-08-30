package pages.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WayBackMachineSearchPage {
	static WebDriver driver;

	public WayBackMachineSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}

	private static List<WebElement> searchResult() {
		return driver.findElements(By.cssSelector("ul.result-list li"));
	}

//
	public void inputSearchTerm(String searchTerm) {
		searchBar().sendKeys(searchTerm);
		searchBar().sendKeys(Keys.ENTER);
	}
}