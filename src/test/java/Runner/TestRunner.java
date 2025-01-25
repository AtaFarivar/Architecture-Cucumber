package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        tags = "@Login1",
        features = "src/test/resources/faetures",
        glue = {"StepDefinitions", "Utulities"},
        plugin = {
                "pretty",
                "html:Reports/Cucumber.html"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
                return super.scenarios();
        }

}
