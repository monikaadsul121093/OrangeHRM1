package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
	
	
	public void setup()
	{
		BaseClass.initialization();
	}
	
	public void validateRegisterPage()
	{
		RegisterPage registerPage=new RegisterPage();
		registerPage.registerPageFunctionality();
		
	}

}
