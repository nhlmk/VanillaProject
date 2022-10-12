package com.vanilla.pages;

import com.vanilla.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondHighestPricedProductPage {

    public SecondHighestPricedProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.=' About this item ']")
    public WebElement aboutThisItemHeader;
    @FindBy(xpath = "//ul[@class='a-unordered-list a-vertical a-spacing-mini']")
    public WebElement textBelowAboutThisItemHeader;

}
