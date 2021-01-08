package ncs.test10;

public class Secretary extends Employee implements Bonus {

	public Secretary(){
		super();
	}
	
	public Secretary(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return this.getSalary()*0.1;
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		this.setSalary((int)(this.getSalary()+(pay*0.8)));		
	}
	
}
