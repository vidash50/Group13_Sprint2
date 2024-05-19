package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement moduleContact;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchContactsBox;

    //@FindBy (xpath = "(//div[@class='oe_kanban_partner_links'])[1]")
    //@FindBy (xpath = "(//strong[.='Karim'])[1]")
    @FindBy(xpath = "(//div[@class='o_kanban_image'])[last()]")
    public WebElement createdContact;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    // locate state box only then choose by text and click
    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[8]")
    public WebElement stateDropdown;

    @FindBy(xpath = "//li[.='Hokkaidō']")
    public WebElement state;

    @FindBy(name = "function")
    public WebElement jobPositionInput;

    @FindBy(name = "mobile")
    public WebElement mobileInput;

    @FindBy(name = "title")
    public WebElement titleDropdown;


   // @FindBy(xpath = "(//*[text()='Search More...'])[1]")
  // @FindBy(xpath = "//li[.='Search More...']")
  //  @FindBy(xpath = "//*[text()='Search More...']")
  // @FindBy(xpath = "//li/a[text()='Search More...']")
    @FindBy(partialLinkText = ("Search More..."))
    public WebElement searchMoreTitleButton;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createTitleButton;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[2]")
    public WebElement titleInput;

    @FindBy(xpath = "(//button[.='Save'])[3]")
    public WebElement saveTitleButton;
}
