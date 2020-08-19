package com.groupid.employee.employeetable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeinformation")
public class Emp {
	@Id
	private int id;
	private String name;
	private int age;
	private int salary ;
	private String title;
	private String city;
	public Emp() {
	}
	
	public Emp(int id, String name, int age, int salary, String title, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.title = title;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nam) {
		this.name = nam;
	}
	public int  getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	


}
