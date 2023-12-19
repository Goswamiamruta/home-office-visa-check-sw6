package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConformationsteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickOnStart();

    }

    @Then("Select a Nationality {string}")
    public void selectANationalityAustralia(String nationality) {
        new SelectNationalityPage().selectNationalityName(nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton(String reason) throws InterruptedException {
        new ReasonForTravelPage().selectReason(reason);
    }

    @And("Select reason {string}")
    public void selectReasonTourism() {
      new ReasonForTravelPage().verifyText();
    }

    @And("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK() throws InterruptedException {
        new DurationOfStayPage().selectIntentionToStay();
    }

    @And("Select intended to stay for {string}")
    public void selectIntendedToStayForLongerThanMonths(int arg0) {
        new WorkTypePage().selectPlanningToWork();
    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectPlanningToWork();
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
    }
}
