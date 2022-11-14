package pages;

import org.openqa.selenium.WebDriver;

public class GridPage extends BasePage{
    private String Cell = "//*[@id='root']/div/";


    public GridPage() {
        super(driver);
    }
    public void navigateToGrid(){
        navigateTo(" ");
    }

    public String getValueFromGrid(String cell, int row, int column){
    return getValueFromGrid(cell,row,column);
    }
}
