package com.oop.body.model;
 //파생클래스 2 : Arm  -----------------------------------------
//Method : armSwing():void - "팔을 뻗습니다."출력
//생성자 작성 : 기본

public class Arm extends Body {
	public void armSwing() {
		System.out.println("팔을 뻗습니다.");
	}
	public Arm() {
		
	}
	@Override
	public void action() {
		armSwing();
	}

}


