package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='o_user_menu open']")
    public WebElement profileMenu;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]")
    public WebElement options;

    @FindBy(xpath = "//a[text()='Documentation']")
    public WebElement documentation;
    @FindBy(xpath = "//a[text()='Support']")
    public WebElement support;

    @FindBy(xpath = "//a[text()='Preferences']")
    public WebElement preferences;

    @FindBy(xpath = "//a[text()='My Odoo.com account']")
    public WebElement myOdooAccount;


}
