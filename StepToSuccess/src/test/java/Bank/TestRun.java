package Bank;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources/myprac.feature",  //Help to locate feature file
plugin={"pretty","html:cucumberReports/Reports.html"}, //which type of report to generate .html in this case
tags="@Smoke or @Regression or @Important", //which Test case to execute
glue= {"Bank"})  //glue help to locate stepdefinition file
public class TestRun 
{
   System.out.println("UPdated feature");
	////Ispe bahoot practice kar bhai........

}
