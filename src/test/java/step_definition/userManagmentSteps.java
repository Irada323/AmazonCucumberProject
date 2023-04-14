package step_definition;


import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPages;
import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;

public class userManagmentSteps {

	AmazonPages ap=new AmazonPages();
	BrowserUtils utils= new BrowserUtils();
	WebElement btn=ap.dropdownBtn;
	Select select=new Select(btn);
	
	
	@Given("I am on the Amazon home page")
	public void i_am_on_the_amazon_home_page() {
	    Driver.getDriver().get(DataReader.getProperty("appUrl"));
	    
	}
	@And("I should be able to see the title")
	public void i_should_be_able_to_see_the_title() {
		String expectedTitle=Driver.getDriver().getTitle();
		Assert.assertEquals(expectedTitle,"Amazon.com. Spend less. Smile more.");
	  
	}
	@When("I click on the dropdown button")
	public void i_click_on_the_dropdown_button() {
		
		btn.click();
	}
	
	@And("I should see All department as a default")
	public void i_shoud_see_all_department_as_a_default() {
		
		String firstOption=select.getFirstSelectedOption().getText();
		Assert.assertEquals(firstOption,"All Departments");
		
	    
	}
	@When("I select Home & Kitchen department")
	public void i_select_home_kitchen_department() {
		select.selectByVisibleText("Home & Kitchen");
		
	   
	}
	@When("I search for Coffee Mug")
	public void i_search_for_coffee_mug() {
		utils.actionsSendKeys(ap.searchField,"Coffee Mug");
		
	}
	@Then("I validate I am on coffee mug search results page")
	public void i_validate_i_am_on_coffee_mug_search_results_page() {
		System.out.println(Driver.getDriver().getTitle());
	    
	}
	@And("I verify I am on the Home & Kitchen department")
	public void i_verify_i_am_on_the_home_kitchen_department() {
	    System.out.println(select.getFirstSelectedOption());
	}

	
}
