package com.deptInfo.model;

/**
 * This is a sub class of 'SuperDepartment' class
 * overriding 4 methods of super class
 * and displaying relevant information about HR Department
 *  
 * @author Shain Joy
 */

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
	public void display() {
		System.out.println("Welcome to " + departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println();
	}
}
