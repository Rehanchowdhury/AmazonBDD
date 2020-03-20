package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.annotations.DataProvider;

@CucumberOptions(
            features = {"src/test/java/feature"},
            glue={"stepdefinations"},
            plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
            strict = true,

            monochrome=true,
        tags={}
       // tags={"@Test1,@Test2"}

            )




    public class CucumberRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

    }

