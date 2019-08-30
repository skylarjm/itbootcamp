package pages.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
	}

// ELEMENTS
    
    
    private static WebElement signUp() {
        return driver.findElement(By.cssSelector("section.login-header.text-center > p > a"));
    }
    private static WebElement password() {
        return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[2]/div/input"));
    }
    private static WebElement email() {
        return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/label[1]/input"));
    }
    private static WebElement showPassword() {
        return driver.findElement(By.cssSelector("label:nth-child(4) > div > img"));
    }
    private static WebElement keepLoggedIn() {
        return driver.findElement(By.name("remember"));
    }
    private static WebElement forgotPassword() {
        return driver.findElement(By.cssSelector("span.reset-password > a"));
    }
    private static WebElement loginButton() {
        return driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/section[2]/form/input[3]"));
    }
    private static WebElement errorMessage() {
        return driver.findElement(By.cssSelector(
                "body.navia:nth-child(2) div.container.container-ia div.box.row div.iaform.col-md-8.login-form-section:nth-child(2) section.login-form-element form.iaform.login-form div.password-message:nth-child(5) > span.login-error.password-error"));
    }
    private static WebElement signUpTermsOfConditions() {
        return driver.findElement(By.cssSelector(
                "body.navia:nth-child(2) div.container.container-ia div.box.row div.iaform.col-md-8.signup-form-section:nth-child(2) section.signup-form-element form.iaform.signup-form:nth-child(2) fieldset:nth-child(8) div.terms > a:nth-child(1)"));
    }
    
    // ACTIONS
    
    public void clickOnTermOfConditions() {
        signUpTermsOfConditions().click();
    }
    public WebElement getErrorMessage() {
        return errorMessage();
    }
    public WebElement getForgotPassword() {
        return forgotPassword();
    }
    public WebElement getLoginButton() {
        return loginButton();
    }
    public void clickOnSignUp() {
        signUp().click();
    }
    public void inputEmail(String email) {
        email().sendKeys(email);
    }
    public void inputPassword(String password) {
        password().sendKeys(password);
    }
    public void clickOnLogin() {
        loginButton().click();
    }
    public void switchToNextWindow() {
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> window = windows.iterator();
        while (window.hasNext()) {
            driver.switchTo().window(window.next());
        }
    }
}
