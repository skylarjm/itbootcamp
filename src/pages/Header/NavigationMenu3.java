package pages.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu3 {
	
	static WebDriver driver;

	public NavigationMenu3(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement about() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[1]/a"));
	}
	private static WebElement contact() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[2]/a"));
	}
	private static WebElement blog() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[3]/a"));
	}
	private static WebElement projects() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[4]/a"));
	}
	private static WebElement help() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[5]/a"));
	}
	private static WebElement donate() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[6]/a"));
	}
	private static WebElement jobs() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[7]/a"));
	}
	private static WebElement volunteer() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[8]/a"));
	}
	private static WebElement people() {
		return driver.findElement(By.xpath("//*[@id=\"nav-abouts\"]/li[9]/a"));
	}
	
}
