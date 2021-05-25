package com.Pages;

import Generic.Class.Launch_Browser;

public class HomePage extends Launch_Browser{
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}

}
