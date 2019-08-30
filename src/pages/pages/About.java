package pages.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About {
	static WebDriver driver;

	public About(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> news() {
		List<WebElement> newsList = driver.findElements(By.className("tr.forumRow a"));
		WebElement more = driver.findElement(By.cssSelector(
				"body.navia:nth-child(2) div.container.container-ia div.row:nth-child(1) div.col-md-3.hidden-xs.hidden-sm div.box:nth-child(3) h1:nth-child(1) a:nth-child(1) > font:nth-child(1)"));
		newsList.add(more);
		return newsList;
	}

	public int newsListNumberOfElements() {
		return news().size();
	}

	public void clickOnMoreInList() {
		news().get(news().size() - 1);
	}
}
