package pages.Header;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu1 {
	static WebDriver driver;

	public NavigationMenu1(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement wayBackMachineLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[1]/div/div[2]/div/div[1]/a"));
	}
	private static WebElement wayBackMachineSearch() {
		return driver.findElement(By.xpath("//*[@id=\"nav-wb-url\"]"));
	}
	private static WebElement webPagesButton() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[1]/div/div[1]/a"));
	}
	private static WebElement booksToBorrowLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[2]/div/center/div/a"));
	}
	private static WebElement booksToBorrowText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[2]/div/center/a"));
	}
	private static WebElement openLibraryLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[4]/div/center/div/a"));
	}
	private static WebElement openLibraryText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[4]/div/center/a"));			
	}
	private static List<WebElement> textsFeaturedElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	} 
	private static List<WebElement> textsTopElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2 col-xs-7.col-sm-push-2 div.linx a"));
	}
	private static List<WebElement> textsTopRightElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	private static WebElement tvNewsLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[2]/div/center/div/a"));
	}
	private static WebElement tvNewsText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[2]/div/center/a"));
	}
	private static WebElement understandingLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[4]/div/center/div/a"));
	}
	private static WebElement understandingText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[4]/div/center/a"));
	}
	private static List<WebElement> videoFeaturedElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> videoTopElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private static List<WebElement> videoTopRightElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	private static WebElement liveMusicArchiveLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[2]/div/center/div/a"));
	} 
	private static WebElement liveMusicArchiveText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[2]/div/center/a"));
	}
	private static WebElement librivoxFreeAudiobookLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[4]/div/center/div/a"));
	}
	private static WebElement librivoxFreeAudiobookText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[4]/div/center/a"));
	}
	private static List<WebElement> audioFeaturedElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> audioTopElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private static List<WebElement> audioTopRightElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	private static WebElement internetArcadeLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[2]/div/center/div/a"));
	}
	private static WebElement internetArcadeText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[2]/div/center/a"));
	}
	private static WebElement consoleLivingRoomLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[4]/div/center/div/a"));
	}
	private static WebElement consoleLivingRoomText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[4]/div/center/a"));		
	}
	private static List<WebElement> softwareFeaturedElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> softwareTopElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private static List<WebElement> softwareTopRightElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	private static WebElement metropolitanMuseumLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/div/a"));
	}
	private static WebElement metropolitanMuseumText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/a"));
	}
	private static WebElement brooklynMuseumLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/div/a"));
	}
	private static WebElement brooklynMuseumText() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/a"));
	}
	private static List<WebElement> imageFeaturedElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> imageTopElements(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	public void clickOnWayBackMachineLogo() {
		wayBackMachineLogo().click();
	}
	public void sendTextToWayBackSearch(String searchTerm) {
		wayBackMachineSearch().sendKeys(searchTerm);
	}
	public void searchWayToBack() {
		wayBackMachineSearch().submit();
	}
	public void clickOnWebPagesButton() {
		webPagesButton().click();
	}
	public void clickOnBooksToBorrowLogo() {
		booksToBorrowLogo().click();
	}
	public void clickOnBooksToBorrowText() {
		booksToBorrowText().click();
	}
	public void clickOnOpenLibraryLogo() {
		openLibraryLogo().click();
	}
	public void clickOnOpenLibraryText() {
		openLibraryText().click();
	}
	public void clickOnTextsFeaturedElements(Integer index) {
		textsFeaturedElements().get(index).click();	
	}
	public void clickOnTextsTopElements(Integer index) {
		textsTopElements().get(index).click();	
	}
	public void clickOnTextsTopRightElements(Integer index) {
		textsTopRightElements().get(index).click();	
	}
	public void clickOnTvNewsLogo() {
		tvNewsLogo().click();
	}
	public void clickOnTvNewsText() {
		tvNewsText().click();
	}
	public void clickOnUnderstandingLogo() {
		understandingLogo().click();
	}
	public void clickOnUnderstandingText() {
		understandingText().click();
	}
	public void clickOnVideoFeaturedElements(Integer index) {
		videoFeaturedElements().get(index).click();	
	}
	public void clickOnVideoTopElements(Integer index) {
		videoTopElements().get(index).click();	
	}
	public void clickOnVideoTopRightElements(Integer index) {
		videoTopRightElements().get(index).click();	
	}
	public void clickOnLiveMusicArchiveLogo() {
		liveMusicArchiveLogo().click();
	}
	public void clickOnLiveMusicArchiveText() {
		liveMusicArchiveText().click();
	}
	public void clickOnLibrivoxFreeAudiobookLogo() {
		librivoxFreeAudiobookLogo().click();
	}
	public void clickOnLibrivoxFreeAudiobookText() {
		librivoxFreeAudiobookText().click();
	}
	public void clickOnAudioFeaturedElements(Integer index) {
		audioFeaturedElements().get(index).click();	
	}
	public void clickOnAudioTopElements(Integer index) {
		audioTopElements().get(index).click();	
	}
	public void clickOnAudioTopRightElements(Integer index) {
		audioTopRightElements().get(index).click();	
	}
	public void clickOnInternetArcadeLogo() {
		internetArcadeLogo().click();
	}
	public void clickOnInternetArcadeText() {
		internetArcadeText().click();
	}
	
	
	
}
