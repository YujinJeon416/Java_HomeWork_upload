package com.collection.map.member;

import java.util.Objects;

/**
 * 1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.
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
 * 
 *
 */
public class Member {
	
	private String userId;		
	private String userPwd;		
	private String userName;	
	private int age;			
	private String phoneNumber;	
	
	
	
	public Member() { super(); }
	public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;			
	}
	
	
	
	public String getUserId() {					
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}											
	
	
	
	@Override
	public boolean equals(Object o) {		
		
		if(this == o) return true;
		
		if(o == null) return false;
		
		if(!(o instanceof Member)) return false;
		
		Member other = (Member)o;
		if(age != other.age) return false;
		
		
		
		if(userId == null) {
			if(other.userId != null) return false;
		} else {
			if(!userId.equals(other.userId)) return false;
		}
		
		if(userPwd == null) {
			if(other.userPwd != null) return false;
		} else {
			if(!userPwd.equals(other.userPwd)) return false;
		}
		
		if(userName == null) {
			if(other.userName != null) return false;
		} else {
			if(!userName.equals(other.userName)) return false;
		}
		
		if(phoneNumber == null) {
			if(other.phoneNumber != null) return false;
		} else {
			if(!phoneNumber.equals(other.phoneNumber)) return false;
		}
		
		return true;
	}	
	
	
	
	@Override
	public int hashCode() {		
		return Objects.hash(userId, userPwd, userName, age, phoneNumber);
	}
	
	
	
	@Override
	public String toString() {		
		return  userId+ "   " +  userPwd+"   " +  userName+ "   " + age+"    "
				+ phoneNumber;
	}
	
}


