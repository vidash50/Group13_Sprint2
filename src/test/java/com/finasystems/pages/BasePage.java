package com.finasystems.pages;

import com.finasystems.utilities.BrowserUtils;
import com.finasystems.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    LogoutPage logoutPage = new LogoutPage();



    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void discussButton(String text) {// created this whiles watching the video. we can inherit it and use it if we have to
        String locator = "//a[@class='"+text+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
    }

    public void moveToProfileName(){
        String profileName ="(//a[@class='dropdown-toggle'])[1]";
        String userProf2 = "//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(profileName),5);
            WebElement profElement = Driver.getDriver().findElement(By.xpath(profileName));

            new Actions(Driver.getDriver()).moveToElement(profElement).pause(200)
                    .clickAndHold(profElement).pause(200).click(profElement).build().perform();

        }catch (Exception e){
            BrowserUtils.clickWithWait(By.xpath(profileName),5);

        }

        try {
            Driver.getDriver().findElement(By.xpath(userProf2)).click();
        }catch (Exception e) {

        }
    }

    public void clickOnDocument() {

        String userProf2 = "//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']";

        Driver.getDriver().findElement(By.xpath(userProf2)).click();
        BrowserUtils.sleep(2);

        BrowserUtils.clickWithWait(By.xpath("//a[@data-menu='documentation']"), 2);

    }
        public void moveToProfileIcon(){
        String userProf2 = "//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']";

        Driver.getDriver().findElement(By.xpath(userProf2)).click();
        BrowserUtils.sleep(2);

        String textOptions= logoutPage.options.getText();
        String expectedTextOptions= "Documentation\nSupport\nPreferences\nMy Odoo.com account\nLog out";
        System.out.println("textOptions = " + textOptions);
        Assert.assertEquals(textOptions, expectedTextOptions);

//        String exp = "Documentation";
//        Assert.assertEquals(exp, logoutPage.support.getText());

    }

    public void clickDocument(){

        String profileName ="(//a[@class='dropdown-toggle'])[1]";
        String userProf2 = "//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(profileName),5);
            WebElement profElement = Driver.getDriver().findElement(By.xpath(profileName));

            new Actions(Driver.getDriver()).moveToElement(profElement).pause(200)
                    .clickAndHold(profElement).pause(200).click(profElement).build().perform();

        }catch (Exception e){
            BrowserUtils.clickWithWait(By.xpath(profileName),5);

        }

        try {

            Driver.getDriver().findElement(By.xpath(userProf2)).click();
            BrowserUtils.waitForClickablility(By.xpath(profileName),5);

        }catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath("//a[@data-menu='documentation']"),5);

        }

    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }
}
