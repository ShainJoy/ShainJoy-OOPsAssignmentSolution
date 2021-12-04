package com.deptInfo.model;

public class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
	// Displaying information about Super Department
	public void display() {
		System.out.println("Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
	}

}
