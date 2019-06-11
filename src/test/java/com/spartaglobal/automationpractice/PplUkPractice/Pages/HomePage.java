package com.spartaglobal.automationpractice.PplUkPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;

    private String homePageURL = "https://www.ppluk.com/";

    private By whatWeDoMenuItem                 = By.id("menu-item-378");
    private By membershipMenuItem               = By.id("menu-item-1455");
    private By internationalCollectionsMenuItem = By.id("menu-item-365");
    private By musicLicensingMenuItem           = By.id("menu-item-369");
    private By joinPPLMenuItem                  = By.xpath("//*[@id=\"nav\"]/div/div/a[1]");
    private By myPPLLoginMenuItem               = By.xpath("//*[@id=\"nav\"]/div/div/a[2]");
    private By aboutUsLink                      = By.id("menu-item-357");
    private By newsAndEventsLink                = By.id("menu-item-383");
    private By workAtPPLLink                    = By.id("menu-item-386");
    private By contactUsLink                    = By.id("menu-item-389");
    private By toolsAndResourcesLink            = By.id("menu-item-392");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public HomePage goToHomePage() {
        driver.navigate().to(homePageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickWhatWeDoMenuItem() {
        findElement(whatWeDoMenuItem).click();
    }

    public void clickMembershipMenuItem() {
        findElement(membershipMenuItem).click();
    }

    public void clickInternationalCollectionsMenuItem() {
        findElement(internationalCollectionsMenuItem).click();
    }

    public void clickMusicLicensingMenuItem() {
        findElement(musicLicensingMenuItem).click();
    }

    public void clickJoinPPLMenuItem() {
        findElement(joinPPLMenuItem).click();
    }

    public void clickMyPPLLoginMenuItem() {
        findElement(myPPLLoginMenuItem).click();
    }

    public void clickAboutUsLink() {
        Actions action = new Actions(driver);

        action.moveToElement((WebElement) By.linkText("About us")).build().perform();

        //driver.findElement(By.linkText("iPads")).click();

        findElement(aboutUsLink).click();
    }

    public void clickNewsAndEventsLink() {
        findElement(newsAndEventsLink).click();
    }

    public void clickWorkAtPPLLink() {
        findElement(workAtPPLLink).click();
    }

    public void clickContactUsLink() {
        findElement(contactUsLink).click();
    }

    public void clickToolsAndResourcesLink() {
        findElement(toolsAndResourcesLink).click();
    }

}
