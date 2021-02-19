package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class AddToCartSteps extends BaseClass {
    WebDriver driver;


    @Given("Navigate to {string}")
    public void navigateTo(String webSiteAddress) {

        driver= BaseClass.setUp();
        driver.get(webSiteAddress);
        driver.manage().window().maximize();


    }


}
