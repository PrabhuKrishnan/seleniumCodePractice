package com.pom.methodChaining;

public class ProfilePageTest {

	
	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage();
		loginPage.Login("prabhu", "prabhu");
		
		ProfilePage profile = new ProfilePage();
		
		profile.verifyProfilePageTest()
		.setNickName()
		.setProfileName()
		.uploadProfileImage();
		 
		
	}
	
	
}
