package com.deptInfo.model;

/**
 * This is a sub class of 'SuperDepartment' class
 * overriding 4 methods of super class
 * and displaying relevant information about Admin Department
 *  
 * @author Shain Joy
 */
public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Admin Department"; 
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission"; 
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD"; 
	}
	
	public void display() {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
	}
}
