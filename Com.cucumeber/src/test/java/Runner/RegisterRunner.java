package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature/Register.feature"},
		glue = {"Steps"},
		dryRun = true,
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"pretty","html:reports"}
		

		)
public class RegisterRunner {

}
