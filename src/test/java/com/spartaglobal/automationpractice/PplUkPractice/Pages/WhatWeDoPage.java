package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatWeDoPage {

    private WebDriver driver;

    private String whatWeDoPageURL = "https://www.ppluk.com/what-we-do/";

    public WhatWeDoPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public WhatWeDoPage goToWhatWeDoPage() {
        driver.navigate().to(whatWeDoPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }


}
