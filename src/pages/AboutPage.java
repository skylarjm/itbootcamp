package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	
	static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	private static List<WebElement> news(){
        List<WebElement> newsList = driver.findElements(By.cssSelector("tr.forumRow a"));
        WebElement more = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[1]/div[2]/h1/a"));
        newsList.add(more);
        return newsList;
    }
	public int newsListNumberOfElements() {
        return news().size();
    }
    
    public void clickOnMoreButton() {
        news().get(news().size()-1).click();;
    }
}
