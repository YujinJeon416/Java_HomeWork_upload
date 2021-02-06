package mobile;
public class MobileTest {
	public static void main(String[] args) {
		Mobile lMobile = new Ltab("Ltab", 500,"AP-01");
		Mobile oMobile = new Otab("Otab",1000,"AND-20");
		
		System.out.printf("  Mobile\tBattery\t\tOS%n");
		System.out.println("----------------------------------------");
		System.out.printf("  %s\t\t%d\t\t%s%n", lMobile.getMobileName(), 
				lMobile.getBatterySize(), lMobile.getOsType());
		System.out.printf("  %s\t\t%d\t\t%s%n", oMobile.getMobileName(), 
				oMobile.getBatterySize(), oMobile.getOsType());
		
		System.out.println("\n");
		lMobile.charge(10);
		oMobile.charge(10);
		System.out.println("10분 충전");
		System.out.printf("  Mobile\tBattery\t\tOS%n");
		System.out.println("----------------------------------------");
		System.out.printf("  %s\t\t%d\t\t%s%n", lMobile.getMobileName(), 
				lMobile.getBatterySize(), lMobile.getOsType());
		System.out.printf("  %s\t\t%d\t\t%s%n", oMobile.getMobileName(), 
				oMobile.getBatterySize(), oMobile.getOsType());
		
		System.out.println("\n");
		lMobile.operate(5);
		oMobile.operate(5);
		System.out.println("5분 통화");
		System.out.printf("  Mobile\tBattery\t\tOS%n");
		System.out.println("----------------------------------------");
		System.out.printf("  %s\t\t%d\t\t%s%n", lMobile.getMobileName(), 
				lMobile.getBatterySize(), lMobile.getOsType());
		System.out.printf("  %s\t\t%d\t\t%s%n", oMobile.getMobileName(), 
				oMobile.getBatterySize(), oMobile.getOsType());

		
	}
}
