package unknow;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class SpikeTestStep extends Steps {
	private Spike spike = new Spike();
	private String result;
	private String expected;
	
	@Given("Enter data $text")
	public void initData(String text){
		this.expected = text;
		spike.setData(text);
	}
	
	@When("Invoke getData")
	public void invokeGetData(){
		result = spike.getData();
	}
	
	@Then("Get result what I enter")
	public void getResultData(){
		Assert.assertEquals(expected, result);
	}
}
