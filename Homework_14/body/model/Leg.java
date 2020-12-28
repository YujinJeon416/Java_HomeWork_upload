package com.oop.body.model;
//파생클래스 3 : Leg  -----------------------------------------
//Method : run():void - "성큼성큼 뛰어갑니다."출력
//생성자 작성 : 기본
public class Leg extends Body {
	public void run() {
		System.out.println("성큼성큼 뛰어갑니다.");
	}
	
	public Leg() {
	}
	@Override
	public void action() {
	    run();
	}

}
