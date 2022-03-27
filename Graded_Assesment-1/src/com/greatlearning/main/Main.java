package com.greatlearning.main;

import com.greatlearning.superdepartment.Superdepartment;
import com.greatlearning.admin.Admin;
import com.greatlearning.hr.Hr;
import com.greatlearning.tech.Tech;

public class Main {

	public static void main(String[] args) {
		
		
		Admin admin = new Admin();
		Hr hr = new Hr();
		Tech tech = new Tech();
		
		admin.showfunctionality();
		hr.showfunctionality();
		tech.showfunctionality();
	}
	
	
}
