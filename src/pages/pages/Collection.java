package pages.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Collection {

	static WebDriver driver;

	public Collection(WebDriver driver) {
	}

	// ELEMENTS

	private static List<WebElement> sorting() {
		return driver.findElements(By.cssSelector("span.big-label blue-pop"));
	}
	private static List<WebElement> listOfResults(){
		return driver.findElements(By.cssSelector("div.results div.item-ia.hov"));
	}
	private static WebElement searchBar() {
		return driver.findElement(By.xpath("//*[@id=\"tabby-collection\"]/div/div[1]/form/input[1]"));
	}
	private static List<WebElement> playButtons(){
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right"));
	}
}
