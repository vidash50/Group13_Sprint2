package com.finasystems.pages;

import com.finasystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeCalendarDailyWeeklyMonthlyPage {

    public SeeCalendarDailyWeeklyMonthlyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Calendar")
    public WebElement calendarLink;
    //       //span[contains(text(),'Calendar')]

    @FindBy(css = "a[data-menu='120'] span")
    public WebElement spanCalendar;

    @FindBy(xpath = "//button[contains(@class, 'week')]")
    public WebElement buttonWeek;

    @FindBy(xpath = "//button[contains(@class, 'o_calendar_button_day')]")
    public WebElement buttonDay;

    @FindBy(xpath = "//button[contains(@class, 'o_calendar_button_month')]")
    public WebElement buttonMonth;
    //o_calendar_button_month btn btn-sm btn-default active

    @FindBy(xpath = "//button[@class='o_calendar_button_week btn btn-sm btn-default active']")
    public WebElement buttonWeekActive;

    //-DAY //span[contains(text(),'Thursday')]   --> current day of the week
    //-Week //span[contains(text(),'Thu 05/09/2024')]




}
