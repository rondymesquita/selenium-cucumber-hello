package br.com.example.config;


import br.com.example.Calculator;
//import org.junit.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculatorSteps  extends BaseStep{
	
	Calculator calculator;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after() throws Exception{
    	
	}
	
	@Given("^I have a calculator$")
	public void iHaveACalculator() throws Throwable{
		calculator = new Calculator();	
	}
	
	@When("^I add (\\d+) and (\\d+)$")
	public void iAdd(int value1, int value2) throws Throwable{
		calculator.add(value1, value2);
	}
	
	@Then("the result should be (\\d+)$")
	public void theResultShouldBe(int result) throws Throwable{
		Assert.assertEquals(calculator.getResult(), result);
	}
}
