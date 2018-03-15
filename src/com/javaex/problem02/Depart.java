package com.javaex.problem02;

public class Depart extends Employee {

    private String department;

	
    public Depart(String name, int salary,String department) {
		super(name,salary);
		this.department = department;
	}
    
    public void getInformation() {
    	
    	
    	System.out.print("이름:" + getName() + "  연봉: " + getSalary()+" 부서: "+ this.department);
    	
    }

}
