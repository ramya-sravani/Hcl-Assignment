package com.zooapp;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("IN_VET")
public class InHouseVet extends VET{

	@Column(name = "SALARY")
	private double salary;
	
	
	public InHouseVet() {
	}
	
	

	public InHouseVet(String name, String qualification) {
		super(name, qualification);
	}



	public InHouseVet(String name, String qualification, double salary) {
		super(name, qualification);
		this.salary = salary;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InHouseVet [salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	
}