package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utils.BaseClass;

@CucumberOptions(

        features = {"src/test/java/featureFiles/AddItemToCart.feature"},
        glue = {"steps"},
        dryRun = false,
        plugin = {"pretty", "html:target/report/index.html"}

)

public class ParallelRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters ("browser")
    public void beforeMethod (@Optional("chrome") String browser){

        BaseClass.browserName.set(browser);

    }



}
