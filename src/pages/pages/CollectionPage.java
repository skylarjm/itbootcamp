package pages.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage {

	static WebDriver driver;

	public CollectionPage(WebDriver driver) {

		this.driver = driver;

	}

	private static List<WebElement> sortButtons() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden)"));
	}

	private static List<WebElement> resultList() {
		return driver.findElements(By.cssSelector("div#ikind--downloads div:not(.mobile-header).item-ia.hov"));
	}

	private static List<WebElement> mediaTypeChech() {
		return driver.findElements(By.cssSelector("div.fatable.facet-mediatype input[type=checkbox]"));
	}

	private static WebElement mediaTypeMore() {
		return driver.findElement(By.cssSelector("div.facet_mediatype.collapse > a"));
	}

	private static List<WebElement> yearChech() {
		return driver.findElements(By.cssSelector("div.fatable.facet-year input[type=checkbox]"));
	}

	private static WebElement yearMore() {
		return driver.findElement(By.cssSelector("div.facet_year.collapse > a"));
	}

	private static List<WebElement> topicAndSubjectsChech() {
		return driver.findElements(By.cssSelector("div.fatable.facet-subject input[type=checkbox]"));
	}

	private static WebElement topicsAndSubjectsMore() {
		return driver.findElement(By.cssSelector("div.facet_subject.collapse > a"));
	}

	private static List<WebElement> collectionChech() {
		return driver.findElements(By.cssSelector("div.fatable.facet-collection input[type=checkbox]"));
	}

	private static WebElement collectionMore() {
		return driver.findElement(By.cssSelector("div.facet_collection.collapse > a"));
	}

	private static List<WebElement> creatorTypeChech() {
		return driver.findElements(By.cssSelector("div.fatable.facet-creator input[type=checkbox]"));
	}

	private static WebElement creatorMore() {
		return driver.findElement(By.cssSelector("div.facet_creator.collapse > a"));
	}

	private static List<WebElement> languageBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-languageSorter input[type=checkbox]"));
	}

	private static WebElement languageMore() {
		return driver.findElement(By.cssSelector("div.facet_languageSorter.collapse > a"));
	}

	private static WebElement collectionSearch() {
		return driver.findElement(By.name("and[]"));
	}

	private static List<WebElement> playButtons() {
		return driver.findElements(
				By.cssSelector("div.col-xs-1.col-sm-2.welcome-right > a, div.col-xs-1.col-sm-2.welcome-right > span"));
	}

}
