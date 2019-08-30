package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
	static WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement map1() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/a[1]/img"));
	}
	private static WebElement map2() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/font/font/font/font/font/a[1]/img"));
	}
	public void clickOnMap1() {
		map1().click();
	}
	public void clickOnMap2() {
		map2().click();
	}
	
	

}
