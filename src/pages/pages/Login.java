package pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	static WebDriver driver;
	public Login(WebDriver driver) {
	}
	//ELEMENTS
	private static WebElement email() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[1]/input"));
	}
	private static WebElement password() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[2]/div/input"));
	}
	private static WebElement forgotPassword() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/div[2]/span[1]/a"));
	}
	private static WebElement checkBox() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[3]/input"));
	}
	private static WebElement logInButton() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/input[3]"));
	}
	private static WebElement viewPasswordIcon() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[2]/div/img"));	
	}
	private static WebElement signUp() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[1]/p/a"));
	}
	//ACTIONS
	
	public void inputEmail(String EMAIL) {
		email().sendKeys(EMAIL);
	}
	public void inputPassword(String PASSWORD) {
		password().sendKeys(PASSWORD);
	}
	public void clickOnLoginButton() {
		logInButton().click();
	}
	

}
