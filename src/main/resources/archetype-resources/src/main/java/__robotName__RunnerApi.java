#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.obs.rapid.utils.RapidContext;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import noraui.utils.Context;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, glue = { "noraui.application.steps", "noraui.browser.steps", "${package}.application.steps" }, plugin = { "html:target/reports/html" },
        features = { "src/test/resources" })
public class ${robotName}RunnerApi {

    /**
     * BeforeClass Read constants file
     */
    @BeforeClass
    public static void setUpClass() {
        ${robotName}Context.getInstance().initializeEnv("${robotName}.properties");
        ${robotName}Context.getInstance().initializeRobot(${robotName}RunnerApi.class.getClassLoader());
    }

    /**
     * AfterClass clear Context
     */
    @AfterClass
    public static void tearDownClass() {
        Context.clear();
    }

}