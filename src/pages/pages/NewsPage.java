package pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
	
	static WebDriver driver;
	public NewsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement listOfNews() {
		return driver.findElement(By.cssSelector("table.forumTable.table.table-striped.table-condensed.table-hover tr"));
	}
	private static WebElement mailIcon() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/h1/a[1]"));
	}

}
