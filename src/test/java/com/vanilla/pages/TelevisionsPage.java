package com.vanilla.pages;

import com.vanilla.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelevisionsPage {

    public TelevisionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Samsung']")
    public WebElement samsungBrandCheckbox;

    @FindBy(xpath = "//span[.='Sort by:']")
    public WebElement sortByDropdownMenu;

    @FindBy(xpath = "//a[.='Price: High to Low']")
    public WebElement sortByPriceHighToLow;

    @FindBy(xpath = "//div[@data-cel-widget='MAIN-SEARCH_RESULTS-2']")
    public WebElement secondHighestPricedProduct;

}
