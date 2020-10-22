package EmployeeRecord;

public class ComissionEmployee extends Employee implements IncreaseSalary{

	private int perecentage;
	private int weeklySale;

	public ComissionEmployee(int perecentage, int weeklySale) {
		this.perecentage = perecentage;
		this.weeklySale = weeklySale;
	}

	@Override
	public int getSalary() {
		System.out.println("Salary of comission employee is ");
		return (perecentage*weeklySale)/100;
	}

	@Override
	public int increaseSalary() {
		return 3;
	}

	@Override
	public double getPayment() {

		return (perecentage*weeklySale)/100;
	}


}
