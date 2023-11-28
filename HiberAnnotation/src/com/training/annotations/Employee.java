package com.training.annotations;

import javax.persistence.*;

@Entity
@Table(name="EmployeeAnnot")


public class Employee {
	@Id
	@Column(name="EmployeeId")
	private int empid;
	@Column(name="Employeename")
	private String empname;
	@Column(name="Empsalary")
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		
		
	}
	@OneToOne(targetEntity=Address.class)
	@JoinColumn(name="Addid")
	private Address addobj;
	public Address getAddobj() {
		return addobj;
	}
	public void setAddobj(Address addobj) {
		this.addobj = addobj;
	}
}
