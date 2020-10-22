package EmployeeRecord;

public class Employee implements Payable{

	private int rate;

	public Employee() {

	}

	public abstract int getSalary();

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
