package com.assignments.assignment;

import java.util.List;
import java.io.*; 
import java.util.Scanner;

/**
class to delete user details as per user requirement..
*/
public class DeleteUserDetails {
	private Scanner s = new Scanner(System.in);
	AddUserDetails add = new AddUserDetails();
	private List<UserDetails> UserDetails = add.UserDetail;
	Menu menus = new Menu();
	

	/**
	 to take user input, roll number of the user whose record needs to be deleted
	 */
   public void deleteUserDetail(){
		
		System.out.println("please enter the roll number of the user whose data you want to save");
		int rollNo = add.validatIntegerData();
		deleteUser(rollNo);
		
	}
	
   /**
   delete file as per user input
   */
	private void deleteUser(int rollNo){
		String fileName = "USERFILE"+rollNo;
			File myfile = new File("C:\\Users\\apra.yadav\\"+fileName);
			if (myfile.delete()){ 
			     int i ;
					boolean dataExists = false;
					for(i=0;i<UserDetails.size();i++){
						if(UserDetails.get(i).getRollNo()==rollNo){
							dataExists=true;
						break;
						}
					}
					UserDetails.remove(i);
					System.out.println("record deleted..");
			      menus.menuDetail();
			    }else{
			      System.out.println("Failed to delete the record.. record doesn't exists");
			      menus.menuDetail();
			    } 
			
	}
	
	
}
