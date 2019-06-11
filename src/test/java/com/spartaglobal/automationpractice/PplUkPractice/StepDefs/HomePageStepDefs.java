package com.spartaglobal.automationpractice.PplUkPractice.StepDefs;

import com.spartaglobal.automationpractice.PplUkPractice.Pages.*;
import com.spartaglobal.automationpractice.PplUkPractice.SeleniumConfig.SeleniumConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStepDefs {

    private static HomePage homePage;
    private static WhatWeDoPage whatWeDoPage;
    private static MembershipPage membershipPage;
    private static InternationalCollectionsPage internationalCollectionsPage;
    private static MusicLicensingPage musicLicensingPage;
    private static AboutUsPage aboutUsPage;
    private static SeleniumConfig driver;

    @Before("@HomePageTest")
    public void setUp() {
        driver = new SeleniumConfig("chrome");
        homePage = new HomePage(driver.getDriver());
        homePage.goToHomePage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Assert.assertEquals(homePage.getCurrentURL(), "https://www.ppluk.com/");
    }

    @When("I click the what we do menu item link")
    public void i_click_the_what_we_do_menu_item_link() {
        homePage.clickWhatWeDoMenuItem();
    }

    @Then("I will go to the what we do page")
    public void i_will_go_to_the_what_we_do_page() {
        whatWeDoPage = new WhatWeDoPage(driver.getDriver());
        Assert.assertEquals(whatWeDoPage.getCurrentURL(), "https://www.ppluk.com/what-we-do/");
    }

    @When("I click the membership menu item link")
    public void i_click_the_membership_menu_item_link() {
        homePage.clickMembershipMenuItem();
    }

    @Then("I will go to the membership page")
    public void i_will_go_to_the_membership_page() {
        membershipPage = new MembershipPage(driver.getDriver());
        Assert.assertEquals(membershipPage.getCurrentURL(), "https://www.ppluk.com/membership/");
    }

    @When("I click the international collections menu item link")
    public void i_click_the_international_collections_menu_item_link() {
        homePage.clickInternationalCollectionsMenuItem();
    }

    @Then("I will go to the international collections page")
    public void i_will_go_to_the_international_collections_page() {
        internationalCollectionsPage = new InternationalCollectionsPage(driver.getDriver());
        Assert.assertEquals(internationalCollectionsPage.getCurrentURL(), "https://www.ppluk.com/international-collections/");
    }

    @When("I click the music licensing menu item link")
    public void i_click_the_music_licensing_menu_item_link() {
        homePage.clickMusicLicensingMenuItem();
    }

    @Then("I will go to the music licensing page")
    public void i_will_go_to_the_music_licensing_page() {
        musicLicensingPage = new MusicLicensingPage(driver.getDriver());
        Assert.assertEquals(musicLicensingPage.getCurrentURL(), "https://www.ppluk.com/music-licensing/");
    }

    @When("I click the about us link")
    public void i_click_the_about_us_link() {
        homePage.clickAboutUsLink();
    }

    @Then("I will go to the about us page")
    public void i_will_go_to_the_about_us_page() {
        aboutUsPage = new AboutUsPage(driver.getDriver());
        Assert.assertEquals(aboutUsPage.getCurrentURL(), "https://www.ppluk.com/about-us/");
    }

    @After("@HomePageTest")
    public void quitDriver(){
        driver.quitDriver();
    }

}
