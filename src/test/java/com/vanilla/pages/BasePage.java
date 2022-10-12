package com.vanilla.pages;

import com.vanilla.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[.='TV, Appliances, Electronics']")
    public WebElement TvApplianceElectronicsButtonUnderShopByCategories;

    @FindBy(xpath = "//a[.='Televisions']")
    public WebElement TelevisionsButtonUnderTvApplianceElectronics;


}
