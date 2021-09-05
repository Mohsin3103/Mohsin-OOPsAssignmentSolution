package com.greatlearning.Main;
import com.greatlearning.Departments.*;

public class Driver {

	public static void main(String[] args) {
		
		SuperDepartment Admin = new AdminDepartment();
		SuperDepartment HR = new HRDepartment();
		SuperDepartment Tech = new TechDepartment();
		
		//Admin Department Functionalities
		
		System.out.println("Welcome to "+ Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday() + "\n");
		
        //HR Department Functionalities
		
		System.out.println("Welcome to "+ HR.departmentName());
		System.out.println(((HRDepartment) HR).doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday() + "\n");

		
		//Tech Department Functionalities
		
		System.out.println("Welcome to "+ Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(((TechDepartment) Tech).getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
	}
}
