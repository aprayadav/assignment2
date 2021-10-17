package com.assignments.assignment;

import java.util.HashSet;
import java.util.Set;

public class UserDetails {
	
	private String userName;
	private int age;
	private int rollNo;
	private String address;
	private Set<String> subject = new HashSet<String>();
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public Set<String> getSubject() {
		return subject;
	}

	public void setSubject(Set<String> subject) {
		this.subject = subject;
	}
	
	
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", age=" + age + ", rollNo=" + rollNo + ", address=" + address
				+ ", subject=" + subject + "]";
	}

}
