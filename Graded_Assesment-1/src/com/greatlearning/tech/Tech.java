package com.greatlearning.tech;

import com.greatlearning.superdepartment.Superdepartment;

public class Tech extends Superdepartment {

	private String departmentName() {

		return "\nWelcome to Tech Department";
	}

	private String getTodaysWork() {

		return "Complete coding of module 1";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";
	}

	private String getTechStackInformation() {

		return "Core Java";
	}

	public void showfunctionality() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(super.isTodayAHoliday());

	}

}
