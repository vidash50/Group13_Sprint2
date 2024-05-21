package com.finasystems.step_definitions;

import com.finasystems.pages.BasePage;
import com.finasystems.pages.LoginPage;
import com.finasystems.pages.LogoutPage;
import com.finasystems.utilities.BrowserUtils;
import com.finasystems.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class LogoutStepDef extends BasePage {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("the user logged in with username as {string} and {string}")
    public void theUserLoggedInWithUsernameAsAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user click on profile menu")
    public void theUserClickOnProfileMenu() {

        moveToProfileIcon();


    }

    @Then("the user should see the logout button and click")
    public void theUserShouldSeeTheLogoutButtonClick() {
        BrowserUtils.sleep(2);
        logoutPage.logoutButton.click();
        BrowserUtils.sleep(2);

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String handle : windowHandles) {
            Driver.getDriver().switchTo().window(handle);
        }

        String expectedURL = "https://qa.finasystems.net/web/login";
        String actualURL = Driver.getDriver().getCurrentUrl();


        Assert.assertEquals(expectedURL, actualURL);
        System.out.println("actualURL = " + actualURL);


    }
}
