package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}
	// ELEMENTS

	private static WebElement searchBar() {
		return driver.findElement(By.xpath("//*[@id=\"q\"]"));
	}

	private static WebElement searchButton() {
		return driver.findElement(By.xpath("//*[@id=\"btn_search_jobs\"]"));
	}

	private static WebElement advancedButton() {
		return driver.findElement(By.xpath("//*[@id=\"link_show_advanced_search\"]"));
	}

	private static List<WebElement> generatedList() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElements(By.cssSelector("table#jobs_table tr:not(:nth-child(1))"));
	}

	//ACTIONS

	public int getNumberOfElements() {
		return generatedList().size();
	}

	public void sendTextToSearch(String SearchTerm) {
		searchBar().sendKeys(SearchTerm);
	}

	public void clickOnSearchButton() {
		searchButton().click();
	}

}
