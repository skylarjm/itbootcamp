package pages.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu2 {
	static WebDriver driver;

	public NavigationMenu2(WebDriver driver) {
		this.driver = driver;
}
	//ELEMENTS
	
	private static WebElement webIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[1]/a"));
	}
	private static WebElement textIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[2]/a"));
	}
	private static WebElement videoIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[3]/a"));
	}
	private static WebElement audioIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[4]/a"));
	}
	private static WebElement softwareIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[5]/a"));
	}
	private static WebElement imageIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[6]/a"));
	}
	private static WebElement logoIA() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[7]/a"));
	}
	private static WebElement signIn() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[10]/a/span[3]"));
	}
	private static WebElement upload() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[9]/a/span[3]"));
	}
	private static WebElement searchBar() {
		return driver.findElement(By.xpath("//*[@id=\"search-bar-2\"]"));
	}
	private static WebElement user() {
		return driver.findElement(By.xpath("//*[@id=\"user-menu\"]/span"));
	}
	
	
	//ACTIONS
	
	public void clickOnWebIcon() {
		webIcon().click();
	}
	public void clickOnTextIcon() {
		textIcon().click();
	}
	public void clickOnVideoIcon() {
		videoIcon().click();
	}
	public void clickOnAudioIcon() {
		audioIcon().click();
	}
	public void clickOnSoftwareIcon() {
		softwareIcon().click();
	}
	public void clickOnImageIcon() {
		imageIcon().click();
	}
	public void clickOnLogoIA() {
		logoIA().click();
	}
	public void clickOnSignIn() {
		signIn().click();
	}
	public void clickOnUpload() {
		upload().click();
	}
	public void clickOnSearchBar() {
		searchBar().click();
	}
	public void sendTextToSearch(String SearchTerm) {
		searchBar().sendKeys(SearchTerm);
	}
	public void clickOnUserIcon() {
		user().click();
	}
	
}
