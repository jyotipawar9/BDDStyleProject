package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@Before("@SpecificHook")
	public void specificHook() {
		System.out.println("This hook is specific for as list scenario");
	}

	@Before(order = 1)
	public void firstBeforeHook() {
		System.out.println("this is first before hook");
	}

	@Before(order = 2)
	public void secondBeforeHook() {
		System.out.println("this is second before hook");
	}

	@Before(order = 3)
	public void thirdBeforeHook() {
		System.out.println("this is third before hook");
	}

//	for after hook order of execution will be from higher number to lower number
	@After(order = 3)
	public void firstAfterHook() {
		System.out.println("this is first after hook");
	}

	@After(order = 2)
	public void secondAfterHook() {
		System.out.println("this is second after hook");
	}

	@After(order = 1)
	public void thirdAfterHook() {
		System.out.println("this is third after hook");
	}

	@BeforeStep
	public void beforeStepHook() {
		System.out.println("Before step hook");
	}

	@AfterStep
	public void afterStepHook() {
		System.out.println("After step hook");
	}
}
