package com.finasystems.step_definitions;

import com.finasystems.pages.LoginPage;
import com.finasystems.utilities.BrowserUtils;
import com.finasystems.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("posmanager")) {
            BrowserUtils.sleep(3);
            username = com.finasystems.utilities.ConfigurationReader.getProperty("posmanager_username");
            password = com.finasystems.utilities.ConfigurationReader.getProperty("posmanager_password");
        } else if (userType.equalsIgnoreCase("CRM_manager")) {
            BrowserUtils.sleep(3);
            username = com.finasystems.utilities.ConfigurationReader.getProperty("eventsCrmManager_username");
            password = com.finasystems.utilities.ConfigurationReader.getProperty("eventsCrmManager_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = com.finasystems.utilities.ConfigurationReader.getProperty("salesManager_username");
            password = com.finasystems.utilities.ConfigurationReader.getProperty("salesManager_password");
        } else if (userType.equalsIgnoreCase("inventory manager")) {
            username = com.finasystems.utilities.ConfigurationReader.getProperty("inventoryManager_username");
            password = com.finasystems.utilities.ConfigurationReader.getProperty("inventoryManager_password");
        } else if (userType.equalsIgnoreCase("expenses manager")) {
            username = com.finasystems.utilities.ConfigurationReader.getProperty("expensesManager_username");
            password = com.finasystems.utilities.ConfigurationReader.getProperty("expensesManager_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Given("user logged in with incorrect username as {string} and incorrect password as {string}")
    public void userLoggedInWithIncorrectUsernameAsAndIncorrectPasswordAs(String wrongUsername, String wrongPassword) {
        loginPage.login(wrongUsername, wrongPassword);
        BrowserUtils.sleep(3);


    }

    @Then("user should see Wrong login message displayed")
    public void userShouldSeeWrongLoginMessageDisplayed() {
        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//p[@class='alert alert-danger']"));
        String actualMessage = errorMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("errorMessage.isDisplayed() = " + errorMessage.isDisplayed());
    }


    @Given("the user logged without providing  {string} and\\/or {string}")
    public void theUserLoggedWithoutProvidingAndOr(String userName, String password) {
        loginPage.userName.sendKeys(userName, password);
        loginPage.submit.click();
    }

    @Then("the user should see Please fill out this field message displayed")
    public void theUserShouldSeePleaseFillOutThisFieldMessageDisplayed() {
        BrowserUtils.verifyMessage();
    }


}

