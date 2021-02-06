package company;

public class Company {

	double salary;
	double income;
	double afterTaxIncome;
	double bonus;
	double afterTaxBonus;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(double salary) {
		// TODO Auto-generated constructor stub
		this.salary =salary;
		afterTaxIncome = 0.1;
		afterTaxBonus = 0.055;
		bonus = salary*0.2;
	}
	double getIncome(){
		return 12*salary;
	}
	public double getAfterTaxIncome() {
		return getIncome() -salary*afterTaxIncome*12;
	}
	public double getBonus() {
		return bonus;
	}
	public double getSalary() {
		return salary;
	}
	public double getAfterTaxBonus() {
		return (bonus- bonus*afterTaxBonus)*4;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
}