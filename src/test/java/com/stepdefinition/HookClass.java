package com.stepdefinition;

import java.net.MalformedURLException;

import com.base.LibGlobal;

import cucumber.api.java.Before;

public class HookClass extends LibGlobal {

	@Before
	public void beforeScenario() throws MalformedURLException {
		getDriverCloud();
		loadUrl("http://adactinhotelapp.com/");	

	}
}
