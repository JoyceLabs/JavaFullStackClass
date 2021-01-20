package com.LockedMe;

public class Menus {

	public static void welcomeScreen() {   
		System.out.println("******************WELCOME****************");
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Joyce Chatten");
		System.out.println("*****************************************");
	} 

	public static void mainmenuScreen() {   
		System.out.println("Please select an item number from the menu below");
		System.out.println("******************MAIN MENU****************");
		System.out.println("1. Return file names in ascending order ");
		System.out.println("2. File submenu ");
		System.out.println("3. Close the application ");			
	} 

	public static void submenuScreen() {   
		System.out.println("Please select an item number from the submenu below");
		System.out.println("******************SUBMAIN MENU****************");
		System.out.println("1. Add a file to the existing directory ");
		System.out.println("2. Delete a file from the existing directory ");
		System.out.println("3. Search for a file ");			
		System.out.println("4. Return to main menu ");			
	} 

}
