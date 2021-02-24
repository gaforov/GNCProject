package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseClass;

import javax.swing.*;

public class AddToCartSteps extends BaseClass {
    WebDriver driver;


    @Given("Navigate to {string}")
    public void navigateTo(String webSiteAddress) {

        driver= BaseClass.setUp();
        driver.get(webSiteAddress);
        driver.manage().window().maximize();


    }


    @And("click on")
    public void clickOn() {


        Actions act = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//li[@class='lvl1-department']"));

        act.moveToElement(element).perform();

        WebElement Bestsellers =  driver.findElement(By.xpath("//li[@class='lvl2-best-sellers']"));

        Bestsellers.click();
    }


}
