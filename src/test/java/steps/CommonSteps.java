package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseClass;

import java.util.List;

public class CommonSteps extends BaseClass {

    // Here I will create the steps which are common for the feature files.
    @And("Hover over in {string}")
    public void hoverOverIn(String page, DataTable dataTable ) {

        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

        getPage(page).hoverOverTheElement(AllElementsInTheList.get(i));

        }

    }

    @And("User clicks in {string}")
    public void userClicksIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).findElementAndClickFunction(AllElementsInTheList.get(i));

        }
    }

    @And("User selects random element from dropdown in {string}")
    public void userSelectsRandomElementFromDropdownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).selectFromDropDown(AllElementsInTheList.get(i));


        }
    }

    @And("User scrolls down in {string}")
    public void userScrollsDownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).scrollToElement(AllElementsInTheList.get(i));

        }
    }

    @And("User randomly click on products in {string}")
    public void userRandomlyClickOnProductsIn(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            getPage(page).randomClickOnElementInsideListOfWebElement(AllElementsInTheList.get(i));
        }

    }


}
