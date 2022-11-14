package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.lang.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    //wait=new WebDriverWait(driver,10);
    private static Actions action;

    private static Duration seg= Duration.ofSeconds(10);
    static {

        System.setProperty("webdriver.chrome.driver",
                "/Users/idscomercial/Documents/Importantes/WebDriver/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    //
    private WebElement Find(String locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void clickElement1(By locator) {

        driver.findElement(locator).click();
    }

    public void write(String locator, String textToWrite) {
        Find(locator).click();
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void write1(By locator, String textToWrite) {

        driver.findElement(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByTest(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }

    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"table/tbody/tr["+row+"]/td["+column+"]";
        return Find(cellINeed).getText();
    }

    public void setValueOnTable(String locator, int row, int column, String stringToSend){
        String cellToFill = locator+"table/tbody/tr["+row+"]/td["+column+"]";
        Find(cellToFill).sendKeys((stringToSend));
    }
}
