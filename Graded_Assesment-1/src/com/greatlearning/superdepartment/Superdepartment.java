package com.greatlearning.superdepartment;

public class Superdepartment {

	private String departmentName() {

		return "\nSuper Department";
	}

	private String getTodaysWork() {

		return "No Work as of now";

	}

	private String getWorkDeadline() {

		return "Nil";
	}

	public String isTodayAHoliday() {

		return "Today is not a Holiday";
	}

	public void showfunctionality() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());

	}

}
