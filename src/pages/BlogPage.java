package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
	
	static WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement blog() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-7707\"]/a"));
	}
	private static WebElement announcements() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-3417\"]/a"));
	}
	private static WebElement internetArchiveStore() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-7359\"]/a"));
	}
	private static WebElement archiveDotOrg(){
		return driver.findElement(By.xpath("//*[@id=\"menu-item-3422\"]/a"));
	}
	private static WebElement about() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-3421\"]/a"));
	}
	private static WebElement events() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-15173\"]/a"));
	}
	private static WebElement developers() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-8100\"]/a"));
	}
	private static WebElement donate() {
		return driver.findElement(By.xpath("//*[@id=\"menu-item-15172\"]/a"));
	}
	private static WebElement facebook() {
		return driver.findElement(By.xpath("//*[@id=\"archive_sharing_widget-4\"]/div/a[1]/img"));
	}
	private static WebElement twitter() {
		return driver.findElement(By.xpath("//*[@id=\"archive_sharing_widget-4\"]/div/a[2]/img"));
	}
	private static WebElement archivesDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"archives-dropdown-2\"]"));
	}
	private static WebElement searchBar() {
		return driver.findElement(By.xpath("//*[@id=\"s\"]"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]"));
	}
	public void clickOnFBIcon() {
		facebook().click();
	}
	public void clickOnTwitterIcon() {
		twitter().click();
	}
	public void sendTextToSearch(String SearchTerm) {
		searchBar().sendKeys(SearchTerm);
	}
	public void ClickOnSearchButton() {
		searchButton().click();
	}
	public void selectFromDropdown(Integer index) {
	Select dropdown = new Select(archivesDropdown());
	dropdown.selectByIndex(index);
	}

}
