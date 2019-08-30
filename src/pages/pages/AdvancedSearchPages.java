package pages.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchPages {

	static WebDriver driver;

	public AdvancedSearchPages(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement anyFieldMenu() {
		return driver.findElement(By.name("any_type"));
	}

	private static WebElement anyFieldField() {
		return driver.findElement(By.cssSelector("#searchForm > div:nth-child(1) > div.col-sm-7 > input"));
	}

	private static WebElement titleMenu() {
		return driver.findElement(By.name("title_type"));
	}

	private static WebElement titleField() {
		return driver.findElement(By.name("title_query"));
	}

	private static WebElement creatorMenu() {
		return driver.findElement(By.name("creator_type"));
	}

	private static WebElement creatorField() {
		return driver.findElement(By.name("creator_query"));
	}

	private static WebElement descriptionMenu() {
		return driver.findElement(By.name("description_type"));
	}

	private static WebElement descriptionField() {
		return driver.findElement(By.name("description_query"));
	}

	private static WebElement collectionMenu() {
		return driver.findElement(By.name("collection_type"));
	}

	private static WebElement collectionField() {
		return driver.findElement(By.name("collection_query"));
	}

	private static WebElement mediatypeMenu() {
		return driver.findElement(By.name("mediatype_type"));
	}

	private static WebElement AllmediatypesMenu() {
		return driver.findElement(By.name("mediatype_query"));
	}

	private static WebElement customMenu1() {
		return driver.findElement(By.name("optional_field1_type"));
	}

	private static WebElement customMenu2() {
		return driver.findElement(By.name("optional_field2_type"));
	}

	private static WebElement customMenu3() {
		return driver.findElement(By.name("optional_field3_type"));
	}

	private static WebElement customFieldLeft1() {
		return driver.findElement(By.name("optional_field1"));
	}

	private static WebElement customFieldLeft2() {
		return driver.findElement(By.name("optional_field2"));
	}

	private static WebElement customFieldLeft3() {
		return driver.findElement(By.name("optional_field3"));
	}

	private static WebElement customFieldRight1() {
		return driver.findElement(By.name("optional_field1_q"));
	}

	private static WebElement customFieldRight2() {
		return driver.findElement(By.name("optional_field2_q"));
	}

	private static WebElement custom3FieldRight3() {
		return driver.findElement(By.name("optional_field3_q"));
	}

	private static WebElement year() {
		return driver.findElement(By.name("date_year"));
	}

	private static WebElement month() {
		return driver.findElement(By.name("date_year"));
	}

	private static WebElement day() {
		return driver.findElement(By.name("date_year"));
	}

	private static WebElement yearFrom() {
		return driver.findElement(By.name("date_from_year"));
	}

	private static WebElement monthFrom() {
		return driver.findElement(By.name("date_from_month"));
	}

	private static WebElement dayFrom() {
		return driver.findElement(By.name("date_from_day"));
	}

	private static WebElement yearTo() {
		return driver.findElement(By.name("date_to_year"));
	}

	private static WebElement monthTo() {
		return driver.findElement(By.name("date_to_month"));
	}

	private static WebElement dayTo() {
		return driver.findElement(By.name("date_to_day"));
	}

	private static WebElement searchButton1() {
		return driver.findElement(By.cssSelector("#searchForm > center > input.btn.btn-primary"));
	}

	private static WebElement searchQuery() {
		return driver.findElement(By.name("q"));
	}

	private static WebElement fieldsToReturn() {
		return driver.findElement(By.name("fl[]"));
	}

	private static WebElement sortResults1() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(2)"));
	}

	private static WebElement sortResults2() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(4)"));
	}

	private static WebElement sortResults3() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(6)"));
	}

	private static WebElement numbOfResults() {
		return driver.findElement(By.name("rows"));
	}

	private static WebElement numbOfPages() {
		return driver.findElement(By.name("page"));
	}

	private static WebElement jsonFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
	}

	private static WebElement xmlFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=radio]"));
	}

	private static WebElement xmlFormatSave() {
		return driver.findElement(By.name("save"));
	}

	private static WebElement htmlTable() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=radio]"));
	}

	private static WebElement csvFormat() {
		return driver.findElement(By.cssSelector("#csvpick"));
	}

	private static WebElement csvFormatLink() {
		return driver.findElement(
				By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(4) > td:nth-child(1) > a"));
	}

	private static WebElement rssFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]"));
	}

	private static WebElement searchButton2() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > input.btn.btn-primary"));
	}

}
