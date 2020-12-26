package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;
/**
@실습문제 - 포인트관리시스템의 entity클라스의 상속관계만들기
회원등급을 추상화하여 Member클래스를 작성해 중복을 제거하세요.
* getEjaPoint메소드는 부모클래스에 정의한후, 각 회원별로 오버라이딩 할것

 *
 */
public class Run {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.silverInsert(new Silver("홍길동", "Silver",1000));
		m.silverInsert(new Silver("김말똥", "Silver",2000));
		m.silverInsert(new Silver("고길동", "Silver",3000));
		m.goldInsert(new Gold("김회장", "Gold",1000));
		m.goldInsert(new Gold("이회장", "Gold",2000));
		m.goldInsert(new Gold("오회장", "Gold",3000));
		m.vipInsert(new Vip("최순실", "Vip",10000));
		m.vvipInsert(new VVip("박근혜", "VVip",100000));
		m.printData();
	}
}

