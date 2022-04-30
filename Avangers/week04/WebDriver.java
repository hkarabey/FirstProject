package week04;

public class WebDriver {

    String browserType;
    public WebDriver(String browserType){
        this.browserType=browserType;
    }

    public String findElelemnt(Locators.ID id){
        return id.locator;
    }

}
