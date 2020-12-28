package com.oop.body.model;
//파생클래스 1 : Head  -----------------------------------
//필드 : hairColor:String
//Method : getter/setter 작성, headBang():void - " ~색 머리를 돌립니다."출력
//생성자 작성 : 기본, 필드초기화 생성자
public class Head extends Body {
	private String hairColor;

	public void headBang() {
	System.out.println(hairColor+ "색 머리를 돌립니다.");
}
	public Head() {
	}
	public Head(String hairColor) {
		super();
		this.hairColor = hairColor;
	}
	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public void action() {
		headBang();
	}
}

