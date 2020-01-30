package com.sis.steps;

import com.sis.testbase.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("Started -> " + scenario.getName());
		setUp();
	}
	
	@After
	public void end(Scenario scenario) throws InterruptedException {
		System.out.println("Ended -> " + scenario.getName());
		Thread.sleep(1000);
		tearDown();
	}

}
