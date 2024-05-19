package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;



public class SalesManagerDashboardPage {

    public SalesManagerDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
// public void dashboardModule(String text) {
//     String locator = "//a[contains(.,'" + text + "')]";
//     WebElement element = Driver.getDriver().findElement(By.xpath(locator));
//     element.click();


    //@FindAll({@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']")})
   // public List<WebElement> dashboardModules;

    @FindBy(xpath = "//a[@data-action-id='120']")
    public WebElement discussBtn;
    @FindBy(xpath = "//a[@data-action-id='136']")
    public WebElement calendarBtn;
    @FindBy(xpath = "//a[@data-action-id='220']")
    public WebElement notesBtn;
    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement contactBtn;

    @FindBy(xpath = "//a[@data-menu='261']")
    public WebElement crmBtn;

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesBtn;
    @FindBy(xpath = "//a[@data-menu='382']")
    public WebElement websiteBtn;
    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement pointOfSaleBtn;
    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement purchaseBtn;
    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventoryBtn;
    @FindBy(xpath = "//a[@data-menu='535']")
    public WebElement repairsBtn;
    @FindBy(xpath = "//a[@data-menu='199']")
    public WebElement invoicingBtn;
    @FindBy(xpath = "//a[@data-menu='180']")
    public WebElement emailMarketingBtn;
    @FindBy(xpath = "//a[@data-menu='124']")
    public WebElement eventsBtn;
    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeesBtn;
    @FindBy(xpath = "//a[@data-menu='295']")
    public WebElement leavesBtn;
    @FindBy(xpath = "//a[.='More ']")
    public WebElement moreBtn;

    @FindBy(xpath = "//a[@data-menu='388']")
    public WebElement expensesBtn;
    @FindBy(xpath = "//a[@data-menu='165']")
    public WebElement maintenanceBtn;
    @FindBy(xpath = "//a[@data-menu='1']")
    public WebElement dashboardsBtn;

}

