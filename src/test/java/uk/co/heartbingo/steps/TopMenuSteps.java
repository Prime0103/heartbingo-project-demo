package uk.co.heartbingo.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.heartbingo.pages.BingoPage;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.SlotsPage;

public class TopMenuSteps
{
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
        new HomePage().clickOnAcceptAllCookies();
    }

    @When("^I click on Bingo link$")
    public void iClickOnBingoLink() {

        new HomePage().clickOnBingoTab();
    }


    @Then("^I should navigate to Bingo Page successfully$")
    public void iShouldNavigateToBingoPageSuccessfully() {
        String expectedText= "All Rooms";
        String actualText= new BingoPage().verifyTheText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("^I click on Slots link$")
    public void iClickOnSlotsLink() {
        new HomePage().clickOnSlotsTab();
    }

    @Then("^I should navigate to Slots Page successfully$")
    public void iShouldNavigateToSlotsPageSuccessfully() {

    }

    @And("^I click on  \"([^\"]*)\" slot$")
    public void iClickOnSlot(String arg0) {
        new SlotsPage().clickOnMagicJokersTab();
    }

    @Then("^i should click to Magic Jokers page$")
    public void iShouldClickToMagicJokersPage() {
        String expectedText="Magic Jokers";
        String actualText = new SlotsPage().verifyMagicJokerText();
        Assert.assertEquals(expectedText,actualText);

    }

    @When("^I click on Casino link$")
    public void iClickOnCasinoLink() {
        new HomePage().clickOnCasinoTab();
    }

    @Then("^I should navigate to Casino Page successfully$")
    public void iShouldNavigateToCasinoPageSuccessfully() {
    }
}
