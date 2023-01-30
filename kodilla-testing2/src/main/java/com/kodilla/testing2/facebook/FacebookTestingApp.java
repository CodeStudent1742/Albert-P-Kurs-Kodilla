package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//button[contains(@class, \"_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy\")]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY = "//select[contains(@id, \"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static final String XPATH_WAIT = "//div[contains(@class, \"large_form\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();

        WebElement accountCreation = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        accountCreation.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_WAIT)));

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select dayExactly = new Select(selectDay);
        dayExactly.selectByIndex(2);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthExactly = new Select(selectMonth);
        monthExactly.selectByIndex(8);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearExactly = new Select(selectYear);
        yearExactly.selectByValue("1994");
    }
}
