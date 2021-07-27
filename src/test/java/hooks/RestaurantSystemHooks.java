package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantSystemHooks {
	
	@Before("@SmokeTest")
	public void beforeDisplayMessage(Scenario sc) {
		System.out.println("Before: " + sc.getName());
	}
	
	@After("@SmokeTest")
	public void afterDisplayMessage(Scenario sc) {
		System.out.println("After: " + sc.getName());
	}

}
