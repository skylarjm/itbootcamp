package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement searchBar() {
		return driver.findElement(By.xpath("/html/body/div/main/div/div[2]/div[2]/div[2]/div/form/div/div[1]/input"));
	}

	private static WebElement web() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[1]/div/div[1]/span[1]"));
	}

	private static WebElement texts() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[2]/div/div[1]/span[1]"));
	}

	private static WebElement video() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[3]/div/div[1]/span[1]"));
	}

	private static WebElement audio() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[4]/div/div[1]/span[1]"));
	}

	private static WebElement tv() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[5]/div/div[1]/span[1]"));
	}

	private static WebElement software() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[6]/div/div[1]/span[1]"));
	}

	private static WebElement image() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[7]/div/div[1]/span[1]"));
	}

	private static WebElement concerts() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[8]/div/div[1]/span[1]"));
	}

	private static WebElement collections() {
		return driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center/a[9]/div/div[1]/span[1]"));
	}

	private static WebElement goButton() {
		return driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
	}

	private static WebElement advancedSearch() {
		return driver.findElement(By.xpath("//*[@id=\"search_options\"]/a"));
	}

	private static WebElement seeMore() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[3]/div[3]/a"));
	}

	private static List<WebElement> topCollections() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}
	private static WebElement searchOptions() {
		return driver.findElement(By.xpath("//*[@id=\"search_options\"]"));
	}
	private static WebElement resultNumber() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	private static List<WebElement> numberOfItems() {
		return driver.findElements(By.cssSelector("div:not(micro-label).num-items.topinblock"));
	}
	
	public List<WebElement> getNumberOfItems(){
		return numberOfItems();	
	}
	public int getTopCollectionsSize() {
		return topCollections().size();
	}
	public WebElement resultNumbers() {
	 return resultNumber();
	}
	public void clickOnTextsIcon() {
		texts().click();
	}
	public void clickOnSearchBar() {
		searchBar().click();
	}
	public void searchBarShow() {
		searchBar().isDisplayed();
	}
	public Boolean dropDownShow() {
		return searchOptions().isDisplayed();
	}
	public void sendTextToSearch(String SearchTerm) {
		searchBar().sendKeys(SearchTerm);
	}
	public void clickOnGoButton() {
		goButton().click();
	}

	public void clickOnTopCollectionItem(Integer index) {
		topCollections().get(index).click();
	}
	public List<WebElement> getTopCollections() {
        return topCollections();
    }
	public String getChildWindowUrl() {
	       Set<String> window = driver.getWindowHandles();
	       Iterator iterator = window.iterator();
	       String currentWindowId = null;
	       String mainPage = driver.getWindowHandle();
	       while(iterator.hasNext()){
	           currentWindowId = iterator.next().toString();
	           // Takes the url from child window
	           if (!currentWindowId.equals(mainPage)){
	               driver.switchTo().window(currentWindowId);
	           }
	       }
	       return driver.getCurrentUrl();
}
}