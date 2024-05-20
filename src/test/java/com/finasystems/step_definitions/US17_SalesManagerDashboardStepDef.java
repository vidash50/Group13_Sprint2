package com.finasystems.step_definitions;

import com.finasystems.pages.LoginPage;
import com.finasystems.pages.SalesManagerDashboardPage;

import com.finasystems.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US17_SalesManagerDashboardStepDef {

    SalesManagerDashboardPage salesManagerDashboardPage = new SalesManagerDashboardPage();
    LoginPage loginPage = new LoginPage();
    @Given("user is on sales manager profile")
    public void user_is_on_sales_manager_profile() {

   }


//    @When("user sees all modules on the dashboard")
//    public void userSeesAllModulesOnTheDashboard() {
//       //salesManagerDashboardPage.dashboardModules.size();
//    }

    @Then("user clicks on each module on the dashboard")
    public void userClicksOnEachModuleOnTheDashboard() {

        salesManagerDashboardPage.discussBtn.click();
        salesManagerDashboardPage.calendarBtn.click();
        salesManagerDashboardPage.notesBtn.click();
        salesManagerDashboardPage.contactBtn.click();
        salesManagerDashboardPage.crmBtn.click();
        salesManagerDashboardPage.salesBtn.click();
        salesManagerDashboardPage.websiteBtn.click();
        salesManagerDashboardPage.pointOfSaleBtn.click();
        salesManagerDashboardPage.purchaseBtn.click();
        salesManagerDashboardPage.inventoryBtn.click();
        salesManagerDashboardPage.repairsBtn.click();
        salesManagerDashboardPage.invoicingBtn.click();
        salesManagerDashboardPage.emailMarketingBtn.click();
        salesManagerDashboardPage.eventsBtn.click();
        salesManagerDashboardPage.employeesBtn.click();
        salesManagerDashboardPage.leavesBtn.click();
        salesManagerDashboardPage.moreBtn.click();
        BrowserUtils.waitFor(2);
        salesManagerDashboardPage.expensesBtn.click();
        BrowserUtils.waitFor(2);
        salesManagerDashboardPage.moreBtn.click();
        BrowserUtils.waitFor(2);
        salesManagerDashboardPage.maintenanceBtn.click();
        BrowserUtils.waitFor(2);
        salesManagerDashboardPage.moreBtn.click();
        BrowserUtils.waitFor(2);
        salesManagerDashboardPage.dashboardsBtn.click();
    }
}

//    public void userSeesAllModulesOnTheDashboard(List<String> expectedModules) {
//List<String> actualModuleNames =new ArrayList<String>();
//
//        for (WebElement each : salesManagerDashboardPage.dashboardModule) {
//            actualModuleNames.add(each.getText());
//        }
//        System.out.println("actualModuleNames = " + actualModuleNames);

     //   Assert.assertTrue(actualModuleNames.equals(expectedModules));

//    @Then("user sees all {int} modules on the dashboard")
//    public void user_sees_all_modules_on_the_dashboard(Integer int1) {



