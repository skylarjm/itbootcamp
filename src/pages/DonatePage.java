package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {
	
	static WebDriver driver;
	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}
	private static List<WebElement> donationAmount() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	}
	private static WebElement customAmountBox() {
		return driver.findElement(By.xpath("//*[@id=\"amount_custom\"]"));
	}
	public void clickOnAmount(Integer index) {
		donationAmount().get(index).click();
		
	}
	public void customAmount(String AMOUNT) {
		customAmountBox().sendKeys(AMOUNT);
	}

	

}
