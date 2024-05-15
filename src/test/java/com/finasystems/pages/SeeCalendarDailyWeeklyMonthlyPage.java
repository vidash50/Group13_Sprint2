package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeCalendarDailyWeeklyMonthlyPage {

    public SeeCalendarDailyWeeklyMonthlyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu='115']")
    public WebElement Discuss;


    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement Calendar;


    @FindBy(xpath = "//button[.='Week']")
    public WebElement buttonWeek;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement buttonDay;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement buttonMonth;
    //o_calendar_button_month btn btn-sm btn-default active

    @FindBy(xpath = "//button[@class='o_calendar_button_week btn btn-sm btn-default active']")
    public WebElement buttonWeekActive;

    @FindBy(xpath = "//button[@class='o_calendar_button_day btn btn-sm btn-default active']")
    public WebElement buttonDayActive;

    @FindBy(xpath = "//button[@class='o_calendar_button_month btn btn-sm btn-default active']")
    public WebElement buttonMonthActive;


    // add - for testing with Local time
    @FindBy(xpath = "//table//th[2]")
    public WebElement table1;

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement meetings;


}
