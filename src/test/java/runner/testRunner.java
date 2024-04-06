package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
        }
        ,features = {"src/test/java/feature"}
        ,glue = {"stepdef"}
        ,dryRun=false
        ,monochrome=true
  //      ,tags = "@test"
)
public class testRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
        public void setupClass(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }

        @Test( description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
        public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
                testNGCucumberRunner.runScenario(pickle.getPickle());
        }

        @DataProvider
        public Object[][] scenarios() {
                return testNGCucumberRunner.provideScenarios();
        }

        @AfterClass(alwaysRun = true)
        public void tearDownClass() {

                if(testNGCucumberRunner != null){
                        testNGCucumberRunner.finish();
                }
        }
}
