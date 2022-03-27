package com.greatlearning.hr;

import com.greatlearning.superdepartment.Superdepartment;

public class Hr extends Superdepartment{

	private String departmentName() {

		return "\nWelcome to HR Department";
	}
	
	private String doActivity() {

		return "team Lunch";
	}

	private String getTodaysWork() {

		return "Fill today’s worksheet and mark your attendance";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";
	}

	

	public void showfunctionality() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(doActivity());
		System.out.println(super.isTodayAHoliday());

	}

}
