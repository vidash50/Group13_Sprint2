package com.finasystems.step_definitions;

import java.time.*;

import com.finasystems.pages.SeeCalendarDailyWeeklyMonthlyPage;
import com.finasystems.utilities.BrowserUtils;
import com.finasystems.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US03_SeeCalendarDailyWeeklyMonthlyStepDef_Yul {

    SeeCalendarDailyWeeklyMonthlyPage seeCalendarDailyWeeklyMonthlyPage = new SeeCalendarDailyWeeklyMonthlyPage();

    /*
    LocalDate date = LocalDate.now();
    String dayOfTheWeek=date.getDayOfWeek().toString();
    String month=date.getMonth().toString();
    */


    @When("the user select Calendar module from Discuss \\(landing) page")
    public void theUserSelectCalendarModuleFromDiscussLandingPage() {
        BrowserUtils.waitForVisibility(seeCalendarDailyWeeklyMonthlyPage.Calendar,10);
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();
    }


    @When("the user clicks on the Week button")
    public void the_user_clicks_on_the_week_button() {
        BrowserUtils.waitForClickablility(seeCalendarDailyWeeklyMonthlyPage.buttonWeek,10);
        seeCalendarDailyWeeklyMonthlyPage.buttonWeek.click();
    }

    @Then("verify that user see the calendar as weekly")
    public void verify_that_user_see_the_calendar_as_weekly() {
        BrowserUtils.waitForVisibility(seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive, 10);
        //Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.isDisplayed());
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.getAttribute("class").contains("default active"));

        /*
        String WeekActiveOnCalendar= seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.getAttribute("textContent");
        String expectedWeekActiveOnCalendar= "Week";
        Assert.assertEquals("Failed to set Calendar Weekly",expectedWeekActiveOnCalendar,WeekActiveOnCalendar);

         */

    }


    @And("the user clicks on the Day button")
    public void theUserClicksOnTheDayButton() {
        BrowserUtils.waitForClickablility(seeCalendarDailyWeeklyMonthlyPage.buttonDay,10);
        seeCalendarDailyWeeklyMonthlyPage.buttonDay.click();
    }

    @Then("verify that user see the calendar as daily")
    public void verifyThatUserSeeTheCalendarAsDaily() {
        BrowserUtils.waitForClickablility(seeCalendarDailyWeeklyMonthlyPage.buttonDayActive,10);
        //Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonDayActive.isDisplayed());
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonDayActive.getAttribute("class").contains("active"));

        /*
        System.out.println("Expected day of the week: "+ dayOfTheWeek + " - > today :)");
        String actualDayOfTheWeek =seeCalendarDailyWeeklyMonthlyPage.table1.getAttribute("outerText");
        System.out.println("Actual day of the week: " + actualDayOfTheWeek);
        System.out.println(dayOfTheWeek.equalsIgnoreCase(actualDayOfTheWeek));
        Assert.assertTrue("DayOfTheWeek not match with actual Day of the week",dayOfTheWeek.equalsIgnoreCase(actualDayOfTheWeek));

         */

    }


    @And("the user clicks on the Month button")
    public void theUserClicksOnTheMonthButton() {
        BrowserUtils.waitForClickablility(seeCalendarDailyWeeklyMonthlyPage.buttonMonth,10);
        seeCalendarDailyWeeklyMonthlyPage.buttonMonth.click();
    }

    @Then("verify that user see the calendar as monthly")
    public void verifyThatUserSeeTheCalendarAsMonthly() {
        BrowserUtils.waitForClickablility(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive,10);
        //Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed());
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.getAttribute("class").contains("active"));

        /*
        System.out.println("(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed()) = " + (seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed()));

        String MonthActiveOnCalendar= seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.getAttribute("textContent");
        String ExpectedMonthActiveOnCalendar= "Month";
        Assert.assertEquals("Failed to set Calendar Monthly",ExpectedMonthActiveOnCalendar,MonthActiveOnCalendar);

        System.out.println("Expected month: "+ month);
        String actualMonth =seeCalendarDailyWeeklyMonthlyPage.meetings.getAttribute("textContent");
        System.out.println("actualMonth = " + actualMonth);

         */


    }

}

/*
 @When("the user select Calendar module from Discuss (landing) page")
    public void the_user_select_calendar_module_from_discuss_landing_page() {
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();
    }


     //getTime();
    //String currentDateTime= currentDate.toString();

//getAttribute("innerText") textContent

 */
