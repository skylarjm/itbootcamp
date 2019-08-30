package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class HelpPage extends BaseClass{
	
	static WebDriver driver;
	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement searchBar() {
		return driver.findElement(By.xpath("//*[@id=\"query\"]"));
	}
	private static List<WebElement> buttons(){
		return driver.findElements(By.cssSelector("ul.blocks-list li.blocks-item"));
	}
	private static WebElement signIn() {
		return driver.findElement(By.xpath("/html/body/header/div[2]/a[2]"));
	}
	public void clickOnButtons(Integer index) {
		buttons().get(index).click();
	}
	public void sendTextToSearch(String SearchTerm) {
		searchBar().sendKeys(SearchTerm);
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
	}
	public void clickOnSignIn() {
		signIn().click();
	}

}
