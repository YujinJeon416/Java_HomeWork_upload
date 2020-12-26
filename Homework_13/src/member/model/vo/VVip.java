package member.model.vo;

public class VVip extends Vip{
	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public double interestP() {
		return this.point*0.15;
	}
}

