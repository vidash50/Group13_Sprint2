package com.finasystems.step_definitions;

import com.finasystems.pages.BasePage;
import com.finasystems.pages.DashboardProfilePage;
import com.finasystems.pages.DocumentationPage;
import com.finasystems.pages.LoginPage;
import com.finasystems.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Set;

public class OdooDocStepDefs extends BasePage {
    LoginPage loginPage=new LoginPage();
    DashboardProfilePage dashboardPage = new DashboardProfilePage();
    DocumentationPage documentationPage=new DocumentationPage();

    @Given("Given the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

        loginPage.login(username,password);
    }

    @And("user click the profile menu")
    public void userClickTheProfileMenu() {
        moveToProfileName();

    }

    @Then("user should see the “Documentation” button on the profile menu")
    public void userShouldSeeTheDocumentationButtonOnTheProfileMenu() {
        String expected = "Documentation";
        //String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expected, dashboardPage.documentVisible.getText());

    }

    @And("the user click the documentation button")
    public void theUserClickTheDocumentationButton() {
        clickDocument();
    }

    @Then("the user should be on the documentation page and see User Docs, Install and Maintain, Developer, Contributing")
    public void theUserShouldBeOnTheDocumentationPageAndSeeUserDocsInstallAndMaintainDeveloperContributing() {
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String handle : windowHandles) {
            Driver.getDriver().switchTo().window(handle);
        }

        String expectedURL = "https://www.odoo.com/documentation/17.0/";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        Assert.assertEquals(documentationPage.userDocs.getText(), "User Docs");
        Assert.assertEquals(documentationPage.installAndMaintain.getText(), "Install and Maintain");
        Assert.assertEquals(documentationPage.developer.getText(), "Developer");
        Assert.assertEquals(documentationPage.contributing.getText(), "Contributing");


    }
}
