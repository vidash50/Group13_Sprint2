package com.finasystems.step_definitions;

import com.finasystems.pages.LoginPage;
import com.finasystems.pages.SalesManagerDashboardPage;

import com.finasystems.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US17_SalesManagerDashboard {

    SalesManagerDashboardPage salesManagerDashboardPage = new SalesManagerDashboardPage();
    LoginPage loginPage = new LoginPage();
    @Given("user is on sales manager profile")
    public void user_is_on_sales_manager_profile() {

    }


    @Then("user sees all modules on the dashboard")

    public void userSeesAllModulesOnTheDashboard(List<String> expectedModules) {


//        for (String each : expectedModules) {
//            System.out.println("actualModules = " + expectedModules);
//        }
        List<String> expectedModuleNames = Arrays.asList(
                "Discuss",
                "Calendar",
                "Notes",
                "Contacts",
                "CRM",
                "Sales",
                "Website",
                "Point of Sale",
                "Purchases",
                "Inventory",
                "Repairs",
                "Invoicing",
                "Email Marketing",
                "Events",
                "Employees",
                "Leaves",
                "Expenses",
                "Maintenance",
                "Dashboards"
        );
        List<String> actualModules = BrowserUtils.getElementsText(salesManagerDashboardPage.dashboardModule);
        Assert.assertTrue(actualModules.equals(expectedModules));



    }
//    @Then("user sees all {int} modules on the dashboard")
//    public void user_sees_all_modules_on_the_dashboard(Integer int1) {


}
