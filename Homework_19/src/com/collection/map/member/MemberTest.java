package com.collection.map.member;
/**
 * @실습문제
실행클래스
@com.collection.map.member.MemberTest
1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.
Member VO클래스
@com.collection.map.member.Member.java
필드(변수) - private
- userId        : String        // 유저 ID
- userPwd       : String        // 유저 Password
- userName      : String        // 유저 이름
- age           : int           // 유저 나이
- phoneNumber   : String        // 유저 폰번호
+getter, +setter, +생성자
회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.
@com.collection.map.member.MemberTest.test1
map의 모든 member객체 정보 출력
==================================================
아이디   비밀번호    이름      나이  전화번호
--------------------------------------------------
honggd  1234        홍길동       35      01012341234
sinsa   1234        신사임당    50      01012341234
leess   1234        이순신       43      01012341234
yooon   1234        윤봉길       37      01012341234
jangbg  1234        장보고       29      01012341234
--------------------------------------------------
2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
@com.collection.map.member.MemberTest.isUserExist(userId:String):boolean
@com.collection.map.member.MemberTest.test2
다음 두 아이디를 테스트하세요.
- jangbg : true 리턴
- sejong : false 리턴
3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
@com.collection.map.member.MemberTest.test3
- 비밀번호 : 5678
- 이름 : 윤동주
- 나이 : 27
- 전화번호 : 01034563456
4. sinsa 아이디 회원을 삭제하세요.
@com.collection.map.member.MemberTest.test4

 * @author juj04
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberTest {
	
	Map<String, Member> map = new HashMap<>();

    public static void main(String[] args) {
		
		MemberTest mt = new MemberTest();
		
		mt.test1();
		mt.test2();
		mt.test3();
		mt.test4();
		mt.test5();
		
		
		
    }
		
       //1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.
       public void test1() {
		map.put("1", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		map.put("2", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		map.put("3", new Member("leess", "1234", "이순신", 43, "01012341234"));
		map.put("4", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		map.put("5", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
		
		
	}
	
	
       public void test2() {
    	   System.out.println("==================================================");
    	   System.out.println("아이디      비밀번호    이름      나이    전화번호");
    	   System.out.println("--------------------------------------------------");
    	   
       Set<String> keySet = map.keySet();
		
          for(String key : keySet) {
            System.out.println(map.get(key));
        }
           System.out.println("--------------------------------------------------");
         }	
	
		
	
	
//	2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
//	@com.collection.map.member.MemberTest.isUserExist(userId:String):boolean
//	@com.collection.map.member.MemberTest.test2
//	다음 두 아이디를 테스트하세요.
//	- jangbg : true 리턴
//	- sejong : false 리턴
	
	public boolean isUserExist(String userId) {		// 해당 아이디가 있는지 판별하는 메소드
		
		Set<String> keySet = map.keySet();		
		boolean flag = false;					// boolean 준비
		
		for(String str :keySet) {				// keyset을 돌리는 for each문
			if(map.get(str).getUserId() == userId) {
				flag = true;				
			}								
		}
		
		return flag;
	}

	

	public void test3() {
		
		boolean bool = isUserExist("jangbg");		// 위에서 만든 메소드 활용
		System.out.println(bool);
		
		bool = isUserExist("sejong");
		System.out.println(bool);
	}
	
//	3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
//	@com.collection.map.member.MemberTest.test3
//	- 비밀번호 : 5678
//	- 이름 : 윤동주
//	- 나이 : 27
//	- 전화번호 : 01034563456
	
	public void test4() {
		
		Set<String> keySet = map.keySet();		// 키셋 생성
		Member m = null;						// 멤버 객체 준비
		
		for(String key :keySet) {
			if(map.get(key).getUserId().equals("yooon")) {
				m = map.get(key);		// yooon 아이디를 가진 객체를 판별해 m에 담음
			}
		}
		
		m.setUserPwd("5678");		
		m.setUserName("윤동주");
		m.setAge(27);
		m.setPhoneNumber("01034563456");
		
		System.out.println(m);					
		System.out.println("위와 같이 변경되었습니다.");	
												
	}

	
	//4. sinsa 아이디 회원을 삭제하세요.
	//@com.collection.map.member.MemberTest.test4
	
	public void test5() {
		
		Set<String> keySet = map.keySet();		// 키셋 준비
		Member m = null;
		
		for(String key : keySet) {
			if(map.get(key).getUserId().equals("sinsa")) {
				m = map.remove(key);		// 신사 아이디가 있으면 해당 키밸류 제거
				break;			
			}					
		}						
		
		System.out.println(m);
		System.out.println("위 회원정보가 삭제되었습니다.");
	}
	
}


