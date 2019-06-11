package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage {

    private WebDriver driver;

    private String aboutUsPageURL = "https://www.ppluk.com/about-us/";

    private By ourHistoryLink = By.xpath("//*[@id=\"sidebar\"]/div/ul/li/ul/li[2]/a");

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public AboutUsPage goToAboutUsPage() {
        driver.navigate().to(aboutUsPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickOurHistoryLink() {
        findElement(ourHistoryLink).click();
    }

}
