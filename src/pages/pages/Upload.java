package pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Upload {
	
	static WebDriver driver;
	public Upload(WebDriver driver) {
	}
	//ELEMENTS
	private static WebElement uploadFiles() {
		return driver.findElement(By.xpath("//*[@id=\"createhelp\"]/center[2]/a"));
	}
	private static WebElement archiveUploader() {
		return driver.findElement(By.xpath("//*[@id=\"createhelp\"]/center[3]/a"));
	}
	private static WebElement questionMark() {
		return driver.findElement(By.xpath("//*[@id=\"createhelp\"]/h3/small/a/span[1]"));
	}

}
