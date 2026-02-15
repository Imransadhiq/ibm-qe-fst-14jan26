package TestRunner;



import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(
    key = Constants.GLUE_PROPERTY_NAME, value = "stepDefinitions"
)
@IncludeTags("activity5")
@ConfigurationParameter(
//key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity5"
    key=Constants.PLUGIN_PROPERTY_NAME,
    value="html:test-output/cucumber-report/cucumber.html"

)

public class ActivitiesRunner2
{

}