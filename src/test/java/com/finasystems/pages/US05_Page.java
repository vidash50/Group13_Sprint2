package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_Page {

    public US05_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement createContact;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(xpath = "//td[.='Tochigi']")
    //id ="o_field_input_39"
    public WebElement stateInput;

    @FindBy(name = "function")
    public WebElement jobPositionInput;

    @FindBy(name = "mobile")
    public WebElement mobileInput;

    @FindBy(name = "title")
    public WebElement titleDropdown;
}
