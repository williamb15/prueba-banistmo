package co.com.banistmo.certificacion.prueba.stepdefinitions;

import co.com.banistmo.certificacion.prueba.exceptions.InvestmentRequestException;
import co.com.banistmo.certificacion.prueba.questions.ValidateDocument;
import co.com.banistmo.certificacion.prueba.tasks.ProductRequest;
import co.com.banistmo.certificacion.prueba.tasks.ProductSelection;
import co.com.banistmo.certificacion.prueba.tasks.ViewDocument;
import co.com.banistmo.certificacion.prueba.utils.GeneralConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class InvestmentRequestStepDefinitions extends GeneralStepDefinitions {

    @Before
    public void config() {
        SetUp();
    }

    @Given("^the user is in the channel and enters the product request$")
    public void theUserIsInTheChannelAndEntersTheProductRequest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(ProductRequest.inTheChanel());
    }

    @When("^he selects the (.*) option and chooses (.*)$")
    public void heSelectsTheOptionAndChooses(String product, String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductSelection.withTheOptions(product,option),
                ViewDocument.inTheChanel());
    }

    @Then("^he will be able to see the name of the PDF (.*)$")
    public void heWillBeAbleToSeeTheNameOfThePdf(String name) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateDocument.inTheTab(),
                Matchers.equalTo(name)).orComplainWith(InvestmentRequestException.class, GeneralConstants.ERROR));
    }

}
