package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@SmokeTest")
	public void beforeValidation() {
		System.out.println("Before smoke hook validation");
	}
	
	@After("@SmokeTest")
	public void afterValidation() {
		System.out.println("After smoke hook validation");
		}

	@Before("@WebTest")
		public void beforewebValidation() {
			System.out.println("Before  web hook validation");
		}
		
	@After("@WebTest")
		public void afterwebValidation() {
			System.out.println("After web hook validation");
		}
	
}
