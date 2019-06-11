package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MusicLicensingPage {

    private WebDriver driver;

    private String musicLicensingPageURL = "https://www.ppluk.com/music-licensing/";

    public MusicLicensingPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public MusicLicensingPage goToMusicLicensingPage() {
        driver.navigate().to(musicLicensingPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

}
