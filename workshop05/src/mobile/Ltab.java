package mobile;
public class Ltab extends Mobile{
	
	public Ltab() {
		
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(-(time * 10));
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(time * 10);
		return getBatterySize();
	}
	
	
	
}