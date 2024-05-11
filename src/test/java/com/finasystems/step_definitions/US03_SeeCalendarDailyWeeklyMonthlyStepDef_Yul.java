package com.finasystems.step_definitions;

import com.finasystems.pages.SeeCalendarDailyWeeklyMonthlyPage;
import com.finasystems.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US03_SeeCalendarDailyWeeklyMonthlyStepDef_Yul {


    SeeCalendarDailyWeeklyMonthlyPage seeCalendarDailyWeeklyMonthlyPage = new SeeCalendarDailyWeeklyMonthlyPage();


    @When("the user select Calendar module from Discuss \\(landing) page")
    public void theUserSelectCalendarModuleFromDiscussLandingPage() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();

    }


    @When("the user clicks on the Week button")
    public void the_user_clicks_on_the_week_button() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonWeek.click();

    }

    @Then("verify that user see the calendar as weekly")
    public void verify_that_user_see_the_calendar_as_weekly() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonWeekActive.isDisplayed();
        System.out.println("User see the calendar as weekly");

    }


    @And("the user clicks on the Day button")
    public void theUserClicksOnTheDayButton() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonDay.click();

    }

    @Then("verify that user see the calendar as daily")
    public void verifyThatUserSeeTheCalendarAsDaily() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonDayActive.isDisplayed();
        System.out.println("User see the calendar as daily");

    }




    @And("the user clicks on the Month button")
    public void theUserClicksOnTheMonthButton() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonMonth.click();
    }

    @Then("verify that user see the calendar as monthly")
    public void verifyThatUserSeeTheCalendarAsMonthly() {
        BrowserUtils.waitFor(10);
        seeCalendarDailyWeeklyMonthlyPage.buttonMonthActive.isDisplayed();
        System.out.println("User see the calendar as monthly");
    }


}

/*
 @When("the user select Calendar module from Discuss (landing) page")
    public void the_user_select_calendar_module_from_discuss_landing_page() {
        seeCalendarDailyWeeklyMonthlyPage.Calendar.click();
    }
 */
