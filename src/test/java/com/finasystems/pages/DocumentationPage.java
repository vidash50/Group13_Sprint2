package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage {
    public DocumentationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[.='User Docs'])[2]")
    public WebElement userDocs;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]//li//a")
    public WebElement documentVisible;

    @FindBy(xpath = "//a[.='Install and Maintain']")
    public WebElement installAndMaintain;

    @FindBy(xpath = "(//a[.='Developer'])[2]")
    public WebElement developer;

    @FindBy(xpath = "(//a[.='Contributing'])[2]")
    public WebElement contributing;
}
