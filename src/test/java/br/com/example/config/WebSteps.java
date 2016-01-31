package br.com.example.config;

import br.com.example.page.DuckDuckGoPage;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebSteps extends BaseStep{

	private DuckDuckGoPage duckDuckGoPage;

	@Before
	public void before(){
		driver = Driver.getInstance();
		duckDuckGoPage = new DuckDuckGoPage(driver);
	}
	
	@After
	public void after(){
		Driver.quit();
	}

	@Given("^I open DuckDuckGo$")
	public void iOpenDuckDuckGo() throws Throwable{
		duckDuckGoPage.open();
	}
	
	@And("^I enter \"([^\"]*)\" in search field$")
	public void iEnter(String text) throws Throwable{
		duckDuckGoPage.setSearchField(text);
	}

	@When("^I click on search button$")
	public void iClickOnSearchButton(){
		assertTrue(exists(duckDuckGoPage.searchButtonSelectorBy));
		duckDuckGoPage.clickOnSearchButton();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void iShouldSee(String text){
		driver.getPageSource().contains(text);
	}
	
	@And("^I wait for (\\d+)$")
	public void iEnter(int time) throws Throwable{
		Thread.sleep(time);
	}
}
