package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

//패키지명 : com.oop.body.controller 
//테스트 클래스 : ActionBody ---------------------------------
//메인에서 다형성 사용 신체부위별 객체를 담을 수 있는 Body타입의 객체배열[5]을 생성후, 임의의 신체객체를 각 인덱스별로 담습니다. 
//그후 반복문을 통해서 각 객체별 고유메소드를 실행하세요.
//+action(body:Body):void 메소드에서 객체별 고유메소드를 실행할 것(instanceof연산자 사용 또는 동적바인딩 활용)


public class ActionBody {

	public static void main(String[] args) {
		ActionBody ab = new ActionBody();
		
		Body[] arr = new Body[5];
		arr[0] = new Head("보라");
		arr[1] = new Arm();
		arr[2] = new Arm();
		arr[3] = new Leg();
		arr[4] = new Leg();
		
		for(Body b : arr) {
			ab.action(b);
		}
	}
	
	public void action(Body body) {
		body.action();
	}

}