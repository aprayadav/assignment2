package com.assignments.assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 class to display records as per roll number
 */
public class DisplayUserDetails {
	private Scanner sc = new Scanner(System.in);
	Menu menus = new Menu();
	AddUserDetails data = new AddUserDetails();
	
	/**
	 method to take user input
	 */
	public void userToDisplay(){
		System.out.println("please enter roll number of the user you want to display details for - ");
		int rollNo = data.validatIntegerData();
		display(rollNo);
	}

	/**
	 to get data from file as per roll number entered by user
	 */
	private void display(int rollNo){
		String fileName = "USERFILE"+rollNo;
			try{
			FileReader fr = new FileReader("C:\\Users\\apra.yadav\\"+fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			menus.menuDetail();
			}catch(IOException e){
				 System.out.println("User not found..");
			      menus.menuDetail();
			}
			
		}
		
		
	
	
}
