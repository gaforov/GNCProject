package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseClass;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AddToCartSteps extends BaseClass {
    WebDriver driver;


    @Given("Navigate to {string}")
    public void navigateTo(String webSiteAddress) {

        driver= BaseClass.setUp();
        driver.get(webSiteAddress);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


    }


    @And("click on")
    public void clickOn() {


        Actions act = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//li[@class='lvl1-department']"));

        act.moveToElement(element).perform();

        WebElement Bestsellers =  driver.findElement(By.xpath("//li[@class='lvl2-best-sellers']"));

        Bestsellers.click();
    }




    @And("User randomly click on products in to test {string}")
    public void userRandomlyClickOnProductsInToTest(String arg0) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='product-name']"));

        int size = webElementList.size();

        System.out.println(size);

        Random random = new Random();
        int randomIndex = random.nextInt(webElementList.size());

        WebElement product =  webElementList.get(randomIndex);

        System.out.println("-------->>>>>> Product Name ------ >>>>>>" + product.getText());

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", product);

//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        product.click();

    }
}
