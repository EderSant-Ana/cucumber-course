package stepdefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import learning.cucumbercourse.BillCalculationHelper;

public class ScenarioOutlineSteps {
	
	int initialBillAmount;
	double taxRate;
	
	
	
	@Given("I have a Customer")
	public void i_have_a_Customer() {
		
	}

	@And("user enters initial bill amount as {int}")
	public void user_enters_initial_bill_amount_as(int initialBillAmount) {
	    this.initialBillAmount = initialBillAmount;
	    System.out.println("InitialBillAmount: " + initialBillAmount);
	}

	@And("Sales Tax Rate is {int} Percent")
	public void sales_Tax_Rate_is_Percent(int taxRate) {
	    // Write code here that turns the phrase above into concrete actions
	   this.taxRate = taxRate;
	   System.out.println("Tax Rate: " + taxRate);
	}

	@Then("final bill amount calculated is {int}")
	public void final_bill_amount_calculate_is(int expectedValue) {
		double SystemCalcValue = 
				  BillCalculationHelper.CalculateBillForCustomer(this.initialBillAmount, this.taxRate);
		  System.out.println("Expected Value: " + expectedValue);
		  System.out.println("Calculated Value: " + SystemCalcValue);
		  assertTrue(expectedValue == SystemCalcValue);

	}

	@And("^Sales Tax Rate is (\\d+.\\d+) Percent")
	public void sales_Tax_Rate_is_Percent(double taxRate) {
	    this.taxRate = taxRate;
	    System.out.println("Tax Rate: " + taxRate);
	}
	

	
	@Then("^final bill amount calculated is (\\d+\\.\\d{1,2})")
	public void final_bill_amount_calculate_is(double expectedValue) {
	  double SystemCalcValue = 
			  BillCalculationHelper.CalculateBillForCustomer(this.initialBillAmount, this.taxRate);
	  System.out.println("Expected Value: " + expectedValue);
	  System.out.println("Calculated Value: " + SystemCalcValue);
	  assertTrue(expectedValue == SystemCalcValue);	
	
	}
	




}
