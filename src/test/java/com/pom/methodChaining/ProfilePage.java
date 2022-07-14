package com.pom.methodChaining;

public class ProfilePage {

	
	  ProfilePage()
	{
		
		
	}
	
	public ProfilePage verifyProfilePageTest()
	{
		System.out.println("Profile profile page test");
		return this;
	}
	
	public ProfilePage setProfileName()
	{
		System.out.println("verify profile name");
		return this;
	}
	
	public ProfilePage setNickName()
	{
		System.out.println("update nickname");
		return this;
	}
	
	public ProfilePage uploadProfileImage()
	{
		System.out.println("update profileImage");
		return this;
	}
	
	public HomePage navigateToHomePage()
	{
		System.out.println("Navigate to Home Page...");
		return new HomePage();
	}
	
	public static ProfilePage performPage()
	{
		return new ProfilePage();
	}
	
}


