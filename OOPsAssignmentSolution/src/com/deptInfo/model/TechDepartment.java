package com.deptInfo.model;

/**
 * This is a sub class of 'SuperDepartment' class
 * overriding 4 methods of super class
 * and displaying relevant information about Tech Department
 *  
 * @author Shain Joy
 */

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

	public void display() {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println();
	}

}
