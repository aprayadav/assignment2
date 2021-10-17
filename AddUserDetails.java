package com.assignments.assignment;

import java.util.*;

/**
class to enter user details
*/
public class AddUserDetails {
	private Scanner sc = new Scanner(System.in);
	private String newLine = System.getProperty("line.separator");
	private Set<String> subjectSet = new HashSet<String>();
	static List<UserDetails> UserDetail = new ArrayList<UserDetails>();
	
	/**
	 method to take user input
	 */
	public void addUserDeets(){
		UserDetails user = new UserDetails();
		System.out.println("Enter your name- ");
		String name = validateStringInput();
		user.setUserName(name);
		
		System.out.println("Enter your roll number- ");
		int rollNo = validateRollNo();
		user.setRollNo(rollNo);
		
		System.out.println("Enter your age- ");
		int age = validatIntegerData();
		user.setAge(age);
		
		System.out.println("Enter your address- ");
		String address = validateStringInput();
		user.setAddress(address);
		
		System.out.println("Enter your chosen subjects, you have to  select 4 subjects among these A,B,C,D,E "+newLine+"note: please enter subjects separated by space ");
		String subject = subjectValidation();
		subjectSet.add(subject);
		user.setSubject(subjectSet);
		
				
		UserDetail.add(user);
		Menu s = new Menu();
		s.menuDetail();
		
		
	}
	
	/**
	 method to validate roll number
	 */
	public int validateRollNo(){
		int rollNo = validatIntegerData();
		for (UserDetails u :UserDetail){
			if(u.getRollNo()==rollNo){
			System.out.println("please enter unique roll no as this roll number already exists ");
			return validateRollNo();
		}
			}
		
		return rollNo;
	}
	
	/**
	 method validate string inputs
	 */
     public String validateStringInput(){
		String validate = sc.nextLine();
		
		if(validate == null || validate.trim().length()<=0){
			System.out.println("please enter correct data...try again");
			return validateStringInput();
		}
		return validate;
	}
	
     /**
     method to validate integer data
     */
	public int validatIntegerData(){
		int data = 0;
		String userInput = "";
		userInput  =sc.nextLine();
		try{
			data = Integer.parseInt(userInput);
		}catch(NumberFormatException e){
			System.out.println("Please enter correct integer value - ");
			return validatIntegerData();
		}
		
		if(userInput == null || userInput.trim().length()<0){
			System.out.println("Please enter correct integer value - ");
			return validatIntegerData();
		}
		return data;
		
	}
	
	/**
	 method to validate subject, it should be only A,B,C,D,E
	 */
	private String subjectValidation(){
		String subjects = sc.nextLine();
		boolean check = true;
		String arr[] = subjects.split(" ");
		
		if(arr.length != 4){
			System.out.println("please enter four subjects...try again");
			return subjectValidation();
		}
		
		for(int i=0;i<arr.length;i++){
			if(!Arrays.asList("A","B","C","D","E","a","b","c","d","e").contains(arr[i])){
				check = false;
			}
		}
		if(!check){
			System.out.println("please enter correct subjects ");
			return subjectValidation();
		}
		
		return subjects;
	}

}
