package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {	//운항
		this.setFuelSize(this.getFuelSize()-(30*(distance/10)));
	}

}