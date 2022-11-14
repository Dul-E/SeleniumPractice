package pages;


public class SandBoxPage extends BasePage {

    private String categoryDropdown =" ";

    public SandBoxPage(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://w.w.w.testandquiz.com/selenium/testing.html");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown, category);
    }

}
