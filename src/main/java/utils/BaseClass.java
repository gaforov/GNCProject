package utils;

import org.openqa.selenium.WebDriver;
import pages.Page;

import java.util.ArrayList;
import java.util.List;

public class BaseClass {

    // in this class I am able to create different browser for the parallel testing

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();

//    private static List<Page> list = new ArrayList<>();


    // With setUp method I am creating a Web-driver
    public static WebDriver setUp(){
        if(threadDriver.get()==null){
            setWebDriver(DriverFactory.createInstance(browserName.get()));
//            initPageList();
        }
        return threadDriver.get();
    }
    public static void setWebDriver(WebDriver driver){
        threadDriver.set(driver);
    }


    // By tearDown method I am Quiting the driver
    public static void tearDown() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }


}
