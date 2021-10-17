package com.assignments.assignment;
import java.io.*;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.List;
/**
 Class to save data to disk,data will be saved in separate files for every user..
 */
public class SaveDataToDisk {
	AddUserDetails data = new AddUserDetails();
	Menu menus = new Menu();
	private List<UserDetails> UserDetails = data.UserDetail;
	
	public void userInput(){
		
		System.out.println("please enter the roll number of the user whose data you want to save");
		int rollNo = data.validatIntegerData();
		createFile(rollNo);
		
	}
	/**
	 create file with user rollnumber and save corresponding data to database
	 */
	private void createFile(int rollNo){
		int i ;
		boolean dataExists = false;
		for(i=0;i<UserDetails.size();i++){
			if(UserDetails.get(i).getRollNo()==rollNo){
				dataExists=true;
			break;
			}
		}
		if(dataExists){
		String fileName = "USERFILE"+UserDetails.get(i).getRollNo();
		System.out.println("FILE NAME "+fileName);
		try {
		 File myObj = new File("C:\\Users\\apra.yadav\\"+fileName);
		 if(myObj.createNewFile()){
			 FileWriter myWriter = new FileWriter("C:\\Users\\apra.yadav\\"+fileName);
			 BufferedWriter bw = new BufferedWriter(myWriter);
			 bw.write("--------------------------------------------------");
			 bw.newLine();
			 bw.write("NAME     ROLL.NO     AGE     ADDRESS     SUBJECT");
			 bw.newLine();
			 bw.write("--------------------------------------------------");
			 bw.newLine();
			 bw.write(UserDetails.get(i).getUserName()+"        "+UserDetails.get(i).getRollNo()+"          "+UserDetails.get(i).getAge()+"      "+UserDetails.get(i).getAddress()+"    "+UserDetails.get(i).getSubject());
			 bw.close();
		      System.out.println("user data saved, username is " + UserDetails.get(i).getUserName());
			 menus.menuDetail();
		 }else{
			 System.out.println("User data already exists.... please choose other option from the menu"); 
			 menus.menuDetail();
		 }
		}catch(IOException e){
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		      menus.menuDetail();
		 }
		}else{
			 System.out.println("no record found with this roll number "+rollNo); 
			 menus.menuDetail();
		}
	}
	

}
