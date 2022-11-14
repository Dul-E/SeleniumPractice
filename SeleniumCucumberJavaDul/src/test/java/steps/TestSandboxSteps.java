package steps;

import io.cucumber.java.en.*;
import pages.SandBoxPage;

public class TestSandboxSteps {
    SandBoxPage sandboxPage = new SandBoxPage();

    @Given("^I navigate to the sandbox page$")
    public void navigateToTheSandboxSite(){
        sandboxPage.navigateToSandbox();
        
    }

    @And("^select a value from the dropdown$")
    public void selectState(){
        sandboxPage.selectCategory("Manual");
    }
    
}
