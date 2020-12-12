package com.kh.test.condition;

import java.util.Scanner;

import java.util.Random;


/**
 * 가위바위보게임
 * 가위바위보중 하나를 선택 승패를 결정하는 게임
 * 승패를 결정하는 if문은 중첩,if문 금지(||, &&연산자를 적절히 활용)
 * 
 * ===가위 바위 보 게임===
 * 숫자를 선택하세요(1.가위/2.바위/3.보):1
 * ========결과========
 * 당신은 가위를 냈습니다.
 * 컴퓨터는 보를 냈습니다.
 * ===================
 * 당신이 이겼습니다. ㅠ.ㅠ
 * 
 *
 */
public class RandomTest {
	
	public static void main(String[] args) {
		RandomTest rndtest = new RandomTest();
		rndtest.test();
	}
		public void test() {
		Scanner sc = new Scanner(System.in);
		int user;
		int com;
		System.out.println("===가위 바위 보 게임===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보)");
		
		user = sc.nextInt();
		Random r = new Random();
		com = r.nextInt(3)+1;
		

		System.out.println("========결과========");
		if(user==1) {
		System.out.println("당신은  가위를 냈습니다.");
		}
		else if (user==2) {
		System.out.println("당신은  바위를 냈습니다.");
		}
		else if (user==3) {
		System.out.println("당신은  보를 냈습니다.");
		}
		
		if (com == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
			
		} else if (com == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
			
		} else if (com == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}


		System.out.println("===================");
		if(user == com) {

			System.out.println("비겼습니다.");
		}
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com ==1))

		{
			System.out.println("당신이 이겼습니다.ㅠㅠ");
		}
		else 
		{
			System.out.println("당신이 졌습니다.^^");

		}

	
	

	
	}
}








