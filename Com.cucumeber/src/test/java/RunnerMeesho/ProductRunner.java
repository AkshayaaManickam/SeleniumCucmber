package RunnerMeesho;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"src/test/java/FeatureMeesho/AddProduct.feature"},
		glue="StepsMeesho",
	    dryRun = !true,
	    snippets= SnippetType.CAMELCASE
		)
public class ProductRunner extends AbstractTestNGCucumberTests 
{

}
