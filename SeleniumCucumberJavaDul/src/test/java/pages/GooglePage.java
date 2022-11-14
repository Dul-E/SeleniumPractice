package pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {
    private final By searchButton = By.xpath("//input[@value='Buscar con Google']");
    //private final String searchButton1 ="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]";
    private final String searchButton1= "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    //private final String searchTextField = "//input[@title='Buscar']";
    private final String searchTextField ="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";

    private final By searchTextField1 = By.xpath("//input[@title='Buscar']");

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(String url){
        navigateTo(url);
    }

    public void enterSearchCText(String criteria){

        write1(searchTextField1, criteria);

    }
    public void clickGoogleSearch() {

        clickElement1(searchButton);


    }



}
    

