package Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_d2.03.07\\eclipse-workspace\\ExitTest\\MyFeaturesExit\\exit.feature",glue="stepdefinitions_exit",plugin= {"report","json=target/cucumber.json"})
public class e {

}
