package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class SubCategoryPage extends BasePage implements Page {

    private HashMap<String, WebElement> map = new HashMap<>();
    public SubCategoryPage() {
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy (xpath = "//li[@class='lvl2-best-sellers']")
    private WebElement Bestsellers;

    @FindBy (id = "grid-sort-header")
    private WebElement SortBySelector;

    @FindBy (id ="grid-paging-header")
    private WebElement ItemsPerPageSelector;


    @Override
    public void initMap() {
        map.put("Bestsellers", Bestsellers);
        map.put("SortBySelector", SortBySelector);
        map.put("ItemsPerPageSelector", ItemsPerPageSelector);

    }

    @Override
    public void findElementAndClickFunction(String element) {
        clickFunction(getWebElement(map, element ));
    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {

    }

    @Override
    public void selectFromDropDown(String element) {

    selectDropDown(getWebElement(map, element ));

    }

    @Override
    public void hoverOverTheElement(String element) {


    }
}
