package ncs.test9;

public class Cargoplane extends Airplane {
	
	public Cargoplane() {
		super();
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {	//운항
		this.setFuelSize(this.getFuelSize()-(50*(distance/10)));
	}
}