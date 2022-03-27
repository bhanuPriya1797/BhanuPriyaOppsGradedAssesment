package com.greatlearning.admin;

import com.greatlearning.superdepartment.Superdepartment;

public class Admin extends Superdepartment {

	private String departmentName() {

		return "Welcome to Admin Department";
	}

	private String getTodaysWork() {

		return "Complete your documents Submission";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";
	}

	public void showfunctionality() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());

	}

}
