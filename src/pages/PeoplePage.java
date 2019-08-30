package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {

	static WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
	}
	// ELEMENTS

	private static List<WebElement> peopleBios() {
		return driver.findElements(By.cssSelector("div.bio div"));
	}

	// ACTIONS

	public List<WebElement> getPeopleBios() {
		return peopleBios();
	}

	public void sizePeopleBios() {
		getPeopleBios().size();
	}

	public List<String> infoBios() {
		List<WebElement> bios = getPeopleBios();
		List<String> name_title = new ArrayList<String>();

		for (int i = 0; i < bios.size(); i++) {
			WebElement names = bios.get(i).findElement(By.cssSelector("b"));
			WebElement titles = bios.get(i).findElement(By.cssSelector("i"));
			name_title.add(names.getText() + ' ' + titles.getText());
		}
		return name_title;

	}

}
