package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountryDropDownSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStart();
    }

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(String country1) {
        new SelectNationalityPage().checkCountryAvailable(country1);
    }

    }


