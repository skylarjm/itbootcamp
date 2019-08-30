package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {
	
	static WebDriver driver;
	public ProjectsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> projects(){
		return driver.findElements(By.cssSelector("div.col-sm-3"));
	}
	public int listOfProjects() {
		return projects().size();
	}

}
