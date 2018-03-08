package com.javainuse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Employee.class)
public class Employee {

	//private String text;
    //private int priority;
    //private boolean secret;
    
	private String empName;
	private String empId;

	// Default constructor is needed to deserialize JSON
//    public Employee() {
//    }
//
//    public Employee(String empName, String empId) {
//        this.empName = empName;
//        this.empId = empId;
//       // this.secret = secret;
//    }
    
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
//	public boolean isSecret() {
//        return secret;
//    }
	
	
	@Override
	public String toString() {

//        return "CustomMessage{" +
//                "empName='" + empName + '\'' +
//                ", priority=" + priority +
//                ", secret=" + secret +
//                '}';
    
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}

}
