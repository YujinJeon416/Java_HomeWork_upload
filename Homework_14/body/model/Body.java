package com.oop.body.model;
//# 다형성 실습문제
//@실습문제1
//패키지명 : com.oop.body.model
//부모 클래스명 : Body  --------------------------------------
//파생클래스 1 : Head  -----------------------------------
//필드 : hairColor:String
//Method : getter/setter 작성, headBang():void - " ~색 머리를 돌립니다."출력
//생성자 작성 : 기본, 필드초기화 생성자
//파생클래스 2 : Arm  -----------------------------------------
//Method : armSwing():void - "팔을 뻗습니다."출력
//생성자 작성 : 기본
//파생클래스 3 : Leg  -----------------------------------------
//Method : run():void - "성큼성큼 뛰어갑니다."출력
//생성자 작성 : 기본
//패키지명 : com.oop.body.controller 
//테스트 클래스 : ActionBody ---------------------------------
//메인에서 다형성 사용 신체부위별 객체를 담을 수 있는 Body타입의 객체배열[5]을 생성후, 임의의 신체객체를 각 인덱스별로 담습니다. 
//그후 반복문을 통해서 각 객체별 고유메소드를 실행하세요.
//+action(body:Body):void 메소드에서 객체별 고유메소드를 실행할 것(instanceof연산자 사용 또는 동적바인딩 활용)

public abstract class Body {

	public Body() {
	}

	public void action() {
		
	}
}
	

