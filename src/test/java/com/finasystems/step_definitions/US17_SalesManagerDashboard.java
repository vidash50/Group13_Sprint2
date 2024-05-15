package com.finasystems.step_definitions;

import com.finasystems.pages.LoginPage;
import com.finasystems.pages.SalesManagerDashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class US17_SalesManagerDashboard {

    SalesManagerDashboardPage salesManagerDashboardPage = new SalesManagerDashboardPage();
    LoginPage loginPage = new LoginPage();
    @Given("user is on sales manager profile")
    public void user_is_on_sales_manager_profile() {

    }


    @Then("user sees all modules on the dashboard")
    public void userSeesAllModulesOnTheDashboard(List<String> actualModules) {


        for (String each : actualModules) {
            System.out.println("actualModules = " + actualModules);
        }



    }
//    @Then("user sees all {int} modules on the dashboard")
//    public void user_sees_all_modules_on_the_dashboard(Integer int1) {


}
