package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternationalCollectionsPage {

    private WebDriver driver;

    private String internationalCollectionsPageURL = "https://www.ppluk.com/international-collections/";

    public InternationalCollectionsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public InternationalCollectionsPage goToInternationalCollectionsPage() {
        driver.navigate().to(internationalCollectionsPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

}
