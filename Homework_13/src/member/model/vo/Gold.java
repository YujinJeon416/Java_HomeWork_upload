package member.model.vo;
/**
 @실습문제 - 포인트관리시스템의 entity클라스의 상속관계만들기
회원등급을 추상화하여 Member클래스를 작성해 중복을 제거하세요.
* getEjaPoint메소드는 부모클래스에 정의한후, 각 회원별로 오버라이딩 할것

 */
public class Gold {
	protected String name;
	protected String grade;
	protected int point;
	
	public Gold() {}
	public Gold(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getEjapoint() {
		return point*0.05;
	}
}