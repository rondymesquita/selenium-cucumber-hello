package br.com.example.config;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { 
		"pretty",
		"html:target/reports/report",
		"json:target/reports/report.json",
		}
,
//		glue = {"br.com.example.step"},
		features = {"src/test/resources"},
		dryRun = false,
		strict = true
		)
public class TestRunner {
	
	public final static String REPORT_FOLDER = "./target/reports/";
	
	@BeforeClass
	public static void beforeClass() {
		Logger.logInfo("Before all...");
	}
	
	@AfterClass
	public static void afterClass() throws IOException {
		Logger.logInfo("After all...");
	}
	
}
