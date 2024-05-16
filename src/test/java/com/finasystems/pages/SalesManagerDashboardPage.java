package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;



public class SalesManagerDashboardPage {

    public SalesManagerDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
// public void dashboardModule(String text) {
//     String locator = "//a[contains(.,'" + text + "')]";
//     WebElement element = Driver.getDriver().findElement(By.xpath(locator));
//     element.click();


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']")
    public List<WebElement> dashboardModule;

}

