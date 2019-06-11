@HomePageTest
Feature: Home Page Activities

    Scenario: If I click on the What We Do menu item, I will be directed to the what we do page
        Given I am on the homepage
        When I click the what we do menu item link
        Then I will go to the what we do page

    Scenario: If I click on the Membership menu item, I will be directed to the membership page
        Given I am on the homepage
        When I click the membership menu item link
        Then I will go to the membership page

    Scenario: If I click on the International Collections menu item, I will be directed to the international collections page
        Given I am on the homepage
        When I click the international collections menu item link
        Then I will go to the international collections page

    Scenario: If I click on the Music Licensing menu item, I will be directed to the music licensing page
        Given I am on the homepage
        When I click the music licensing menu item link
        Then I will go to the music licensing page
