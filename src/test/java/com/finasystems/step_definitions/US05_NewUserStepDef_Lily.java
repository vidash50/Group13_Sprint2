package com.finasystems.step_definitions;

import com.finasystems.pages.ContactsPage;
import com.finasystems.pages.LoginPage;
import com.finasystems.utilities.BrowserUtils;
import com.finasystems.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US05_NewUserStepDef_Lily {
    ContactsPage contactsPage = new ContactsPage();
    LoginPage loginPage = new LoginPage();

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("{string} can create a new customer")
    public void can_create_a_new_customer(String string) {
        BrowserUtils.waitFor(5);
       contactsPage.moduleContact.click();
       contactsPage.createButton.click();

    }
    @When("filling only the Name input box")
    public void filling_only_the_name_input_box() {
        BrowserUtils.waitFor(5);
        contactsPage.nameInput.sendKeys("Karim");
    }
    @When("click the save button")
    public void click_the_save_button() {
       contactsPage.saveButton.click();
    }
    @Then("user sees information of the customer is displayed.")
    public void user_sees_information_of_the_customer_is_displayed() {
       String expectedResult = "Karim";
       String actualResult = contactsPage.nameInput.getAttribute("value");
       Assert.assertEquals(expectedResult,actualResult);
    }


    @Given("user clicks contacts")
    public void userClicksContacts() {
        webDriverWait.until(ExpectedConditions.visibilityOf(contactsPage.moduleContact));
        contactsPage.moduleContact.click();
    }

    @Then("user searches for recent added contact by name")
    public void userSearchesForRecentAddedContactByName() {
        webDriverWait.until(ExpectedConditions.visibilityOf(contactsPage.createButton));
        contactsPage.searchContactsBox.sendKeys("Karim"+Keys.ENTER);
        //contactsPage.searchContactsBox.sendKeys(Keys.ENTER);
//        BrowserUtils.waitForVisibility(contactsPage.createdContact, 15);
//        BrowserUtils.clickWithJS(contactsPage.createdContact);
        BrowserUtils.sleep(3);
        webDriverWait.until(ExpectedConditions.visibilityOf(contactsPage.createdContact));
            contactsPage.createdContact.click();

    }

    @And("user clicks on edit")
    public void userClicksOnEdit() {
        webDriverWait.until(ExpectedConditions.visibilityOf(contactsPage.editButton));
        contactsPage.editButton.click();
    }

    @Then("user fills out all the empty input boxes")
    public void userFillsOutAllTheEmptyInputBoxes() {
        contactsPage.streetInput.clear();
        contactsPage.streetInput.sendKeys("Wales Blvd");
        contactsPage.cityInput.clear();
        contactsPage.cityInput.sendKeys("Dallas");
        contactsPage.stateDropdown.click();
        contactsPage.state.click();
        contactsPage.zipInput.clear();
        contactsPage.zipInput.sendKeys("77777");
        contactsPage.jobPositionInput.clear();
        contactsPage.jobPositionInput.sendKeys("Sales Associates");
        contactsPage.mobileInput.sendKeys("1234567890");
        contactsPage.titleDropdown.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(contactsPage.searchMoreTitleButton));
        contactsPage.searchMoreTitleButton.click();
        contactsPage.createTitleButton.click();
        contactsPage.titleInput.sendKeys("Sales associate");
        contactsPage.saveTitleButton.click();


    }

    @Then("user clicks save button")
    public void userClicksSaveButton() {
        contactsPage.saveButton.click();
    }




}
