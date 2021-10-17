package com.assignments.assignment;

import java.util.Arrays;
import java.util.Scanner;
/**
 main menu where the options are shown to perfrom actions
 */
public class Menu {

	private Scanner sc = new Scanner(System.in);
	
	/**
	 display menu options
	 */
	public void menuDetail(){
		String newLine = System.getProperty("line.separator");
		System.out.println("-------------MENU--------------");
		System.out.println("1. Add User Details"+newLine+"2. Display User Details"+newLine+"3. Delete User Details"+newLine+"4. Save User Details"+newLine+"5. Exit");
		userSelectionValidation(sc.nextLine());
		
	}
	/**
	 user selection validation whether user have entered correct user selection value or not
	 */
	private void userSelectionValidation(String userSelect){
		if(userSelect != null && userSelect.trim().length()>0 && Arrays.asList("1","2","3","4","5").contains(userSelect)){
			functioncallAsPerUserSelection(userSelect);
		}else{
			System.out.println("Please enter correct option from the below menu- ");
			menuDetail();
		}
		
	}
	
	/**
	 method calls as per user selection
	 */
	private void functioncallAsPerUserSelection(String userSelection){
		switch(userSelection){
		case "1":
			AddUserDetails user = new AddUserDetails();
			user.addUserDeets();
			break;
		
		case "2":
			DisplayUserDetails details = new DisplayUserDetails();
			details.userToDisplay();
			break;
			
		case "3":
			DeleteUserDetails deleteUser = new DeleteUserDetails();
			deleteUser.deleteUserDetail();
			break;
			
		case "4":
			SaveDataToDisk save = new SaveDataToDisk();
			save.userInput();
			break;
			
		case "5":
			System.out.println("thank you..");
			System.exit(0);;
			break;
			
		}
	}
}
