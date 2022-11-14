package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        /* google.navigateToGoogle(); */
      google.navigateToGoogle("https://www.google.com.mx/");

    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        String Googlee ="Que es google";
        google.enterSearchCText(Googlee);
    }

    @And("^I click on the search button$")
    public void clickSearchButton(){
       google.clickGoogleSearch();
    }
    
}

    