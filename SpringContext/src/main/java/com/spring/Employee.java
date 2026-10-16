package com.spring;

import java.util.List;
import java.util.Map;

public class Employee {
	
	int empId;
	
	String name;
	
	int salary;
	
	List<String> skills;
	
	Map<String, Integer> education;
	
	
	
	public Employee(int empId, String name, int salary, List<String> skills, Map<String, Integer> education) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
		this.education = education;
	}

	public Map<String, Integer> getEducation() {
		return education;
	}

	public void setEducation(Map<String, Integer> education) {
		this.education = education;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Employee(int empId, String name, int salary, List<String> skills) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}

	public Employee() {
		
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", skills=" + skills
				+ ", education=" + education + "]";
	}

	
	
}
