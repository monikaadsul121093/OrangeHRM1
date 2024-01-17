package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.CreateAccountPage;

public class CreateAccountPageTest extends BaseClass {
	
	
	
	public void setup()
	{
		BaseClass.initialization();
	}
	
	public void validateCreateAccount()
	{
		CreateAccountPage create=new CreateAccountPage();
		create.createAccountFunctionality();
	}

}
