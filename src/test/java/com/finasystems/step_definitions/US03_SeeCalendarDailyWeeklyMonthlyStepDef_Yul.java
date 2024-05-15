package com.finasystems.step_definitions;

import java.time.*;

import com.finasystems.pages.SeeCalendarDailyWeeklyMonthlyPage;
import com.finasystems.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_SeeCalendarDailyWeeklyMonthlyStepDef_Yul {


    SeeCalendarDailyWeeklyMonthlyPage seeCalendarDailyWeeklyMonthlyPage = new SeeCalendarDailyWeeklyMonthlyPage();
    LocalDate date = LocalDate.now();
    String dayOfTheWeek=date.getDayOfWeek().toString();
    String month=date.getMonth().toString();


    @When("the user select Calendar module from Discuss \\(landing) page")
    public void theUserSelectCalendarModuleFromDiscussLandingPage() {
        BrowserUtils.waitFor(8);
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();
    }


    @When("the user clicks on the Week button")
    public void the_user_clicks_on_the_week_button() {
        BrowserUtils.waitFor(7);
        seeCalendarDailyWeeklyMonthlyPage.buttonWeek.click();
    }

    @Then("verify that user see the calendar as weekly")
    public void verify_that_user_see_the_calendar_as_weekly() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.isDisplayed());
        System.out.println("(seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.isDisplayed()) = " + (seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.isDisplayed()));
        System.out.println("User see the calendar as weekly");
    }


    @And("the user clicks on the Day button")
    public void theUserClicksOnTheDayButton() {
        BrowserUtils.waitFor(7);
        seeCalendarDailyWeeklyMonthlyPage.buttonDay.click();
    }

    @Then("verify that user see the calendar as daily")
    public void verifyThatUserSeeTheCalendarAsDaily() {
        BrowserUtils.waitFor(5);
        System.out.println("----------DAILY------");
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonDayActive.isDisplayed());
        System.out.println("Expected day of the week: "+ dayOfTheWeek + " - > today :)");
//   String actualDayOfTheWeek =seeCalendarDailyWeeklyMonthlyPage.table1.getAttribute("_outerText");//error message
        String actualDayOfTheWeek =seeCalendarDailyWeeklyMonthlyPage.table1.getAttribute("outerText");
        System.out.println("Actual day of the week: " + actualDayOfTheWeek);
        System.out.println(dayOfTheWeek.equalsIgnoreCase(actualDayOfTheWeek));

        Assert.assertTrue("Day of the week not match with actual Day",dayOfTheWeek.equalsIgnoreCase(actualDayOfTheWeek));

    }


    @And("the user clicks on the Month button")
    public void theUserClicksOnTheMonthButton() {
        BrowserUtils.waitFor(7);
        seeCalendarDailyWeeklyMonthlyPage.buttonMonth.click();
    }

    @Then("verify that user see the calendar as monthly")
    public void verifyThatUserSeeTheCalendarAsMonthly() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed());
        System.out.println("(seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed()) = " + (seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed()));

        System.out.println("Expected month: "+ month);
        String actualMonth =seeCalendarDailyWeeklyMonthlyPage.meetings.getAttribute("textContent");
        System.out.println("actualMonth = " + actualMonth);

        //getAttribute("innerText") textContent
    }


}

/*
 @When("the user select Calendar module from Discuss (landing) page")
    public void the_user_select_calendar_module_from_discuss_landing_page() {
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();
    }


     //getTime();
    //String currentDateTime= currentDate.toString();



 */
