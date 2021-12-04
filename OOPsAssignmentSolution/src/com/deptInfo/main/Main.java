package com.deptInfo.main;

import com.deptInfo.model.*;

// Driver class 
public class Main {

		public static void main(String[] args) {
			
			// Creating and initializing objects of all 3 departments
			HrDepartment hr = new HrDepartment();
			TechDepartment tech = new TechDepartment();
			AdminDepartment admn = new AdminDepartment();
			
			/**
			 * calling display method of each department objects
			 * to show the required information
			 */ 
			admn.display();
			hr.display();
			tech.display();
		}
}
