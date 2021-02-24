package pages;

public interface Page {

    // In this page I will declare all methods to be used in POM pages

    void findElementAndClickFunction(String element);

    void findElementAndSendKeyFunction(String element, String text);

    void selectFromDropDown(String element);

    void hoverOverTheElement(String element);

    public void initMap();

}
