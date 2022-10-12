package com.vanilla.stepDefinitions;

import com.vanilla.pages.BasePage;
import com.vanilla.pages.SecondHighestPricedProductPage;
import com.vanilla.pages.TelevisionsPage;
import com.vanilla.utilities.BrowserUtilities;
import com.vanilla.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.javadoc.doclet.Reporter;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class AboutThisItemStepDefinitions {

    BasePage basePage = new BasePage();
    SecondHighestPricedProductPage secondHighestPricedProductPage = new SecondHighestPricedProductPage();
    TelevisionsPage televisionsPage = new TelevisionsPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    @Given("user is on the homepage of the application")
    public void userIsOnTheHomepageOfTheApplication() {
        Assert.assertTrue(basePage.hamburgerMenu.isDisplayed());
    }

    @When("user clicks the hamburger menu in the top left corner")
    public void userClicksTheHamburgerMenuInTheTopLeftCorner() {
        basePage.hamburgerMenu.click();
    }

    @And("user scrolls down and then Click on the TV, Appliances and Electronics link under Shop by Department section")
    public void userScrollsDownAndThenClickOnTheTVAppliancesAndElectronicsLinkUnderShopByDepartmentSection() {
        jse.executeScript("window.scrollBy(0,750)");
        BrowserUtilities.waitFor(2);
        basePage.TvApplianceElectronicsButtonUnderShopByCategories.click();

    }

    @And("user clicks on Televisions under Tv, Audio & Cameras sub section")
    public void userClicksOnTelevisionsUnderTvAudioCamerasSubSection() {
        basePage.TelevisionsButtonUnderTvApplianceElectronics.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user scrolls down and filter the results by Brand Samsung")
    public void userScrollsDownAndFilterTheResultsByBrandSamsung() {
        jse.executeScript("window.scrollBy(0,750)");
        televisionsPage.samsungBrandCheckbox.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user sorts the Samsung results with price High to Low")
    public void userSortTheSamsungResultsWithPriceHighToLow() {
        televisionsPage.sortByDropdownMenu.click();
        televisionsPage.sortByPriceHighToLow.click();
        BrowserUtilities.waitFor(2);

    }

    @And("user clicks on the second highest priced item and window switches")
    public void userClicksOnTheSecondHighestPricedItemAndWindowSwitches() {
        televisionsPage.secondHighestPricedProduct.click();
        BrowserUtilities.waitFor(2);
        Set<String> allHandles = Driver.getDriver().getWindowHandles();
        for (String eachHandle : allHandles) {
            Driver.getDriver().switchTo().window(eachHandle);
        }

    }

    @Then("user should be able to see that About this item section present logs this section text to console-report")
    public void userShouldBeAbleToSeeThatAboutThisItemSectionPresentLogsThisSectionTextToConsoleReport() {
        jse.executeScript("window.scrollBy(0,750)");
        Assert.assertTrue(secondHighestPricedProductPage.aboutThisItemHeader.isDisplayed());
        secondHighestPricedProductPage.textBelowAboutThisItemHeader.getText();


    }
}
