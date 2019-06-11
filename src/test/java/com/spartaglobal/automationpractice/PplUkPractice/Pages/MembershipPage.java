package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembershipPage {

    private WebDriver driver;

    private String membershipPageURL = "https://www.ppluk.com/membership/";

    public MembershipPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public MembershipPage goToMembershipPage() {
        driver.navigate().to(membershipPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

}
