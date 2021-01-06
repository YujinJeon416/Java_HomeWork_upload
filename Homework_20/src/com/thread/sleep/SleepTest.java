package com.thread.sleep;
/**
 * [Thread 실습문제]
<문제 1> 
 - 실행용클래스 com.thread.sleep.SleepTest
 + sendAphorism() : void 
 - 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
 - 10번 출력후 종료하세요.

 * @author juj04
 *
 */

public class SleepTest {

	public static void main(String[] args) {
		SleepTest s = new SleepTest();
		s.sendAphorism();
	}

	
	public void sendAphorism() {
		String[] s = new String[10];
		s[0]="소잃고 외양간 고친다";
		s[1]="쥐구멍에도 볕들날 있다.";
		s[2]="고생끝에 낙이온다.";
		s[3]="지옥으로 가는 길은 선의로 포장되어 있다.";
		s[4]="역사를 잊은 민족에게 미래는 없다.";
		s[5]="끝을 맺기를 처음과 같이 하면 실패가 없다.";
		s[6]="1퍼센트의 가능성, 그것이 나의 길이다.";
		s[7]="술이 만든 친구는 그 술처럼 하룻밤 뿐이다.";
		s[8]="거짓말을 한 그 순간부터 뛰어난 기억력이 필요하게 된다.";
		s[9]="기회는 새와 같은 것, 날아가기 전에 꼭 잡아라.";
		
		for(int i=0; i<10; i++) {
			int ran=(int)(Math.random()*10);
			System.out.println(s[ran]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
}

	}


