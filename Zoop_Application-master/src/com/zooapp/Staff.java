package com.zooapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STAFF")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STAFF_ID")
	private int staffId;
	
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private int age;
	@Column(name = "SALARY")
	private String salary;
	@Column(name = "GENDER")
	private String gender;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Staff(String name, int age, String salary, String gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	public Staff() {
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Staff [staffId=");
		builder.append(staffId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("]");
		return builder.toString();
	}
}
