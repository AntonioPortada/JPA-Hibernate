package com.jorge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="pa_surname")
	private String paSurname;
	
	@Column(name="ma_surname")
	private String maSurname;
	
	private String email;
	private float salary;
	
	public Employee() {
	}
	
	public Employee(int id, String firstName, String paSurname, String maSurname, String email, float salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.paSurname = paSurname;
		this.maSurname = maSurname;
		this.email = email;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPaSurname() {
		return paSurname;
	}
	
	public void setPaSurname(String paSurname) {
		this.paSurname = paSurname;
	}
	
	public String getMaSurname() {
		return maSurname;
	}
	
	public void setMaSurname(String maSurname) {
		this.maSurname = maSurname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", paSurname=" + paSurname + ", maSurname="
				+ maSurname + ", email=" + email + ", salary=" + salary + "]";
	}
}
