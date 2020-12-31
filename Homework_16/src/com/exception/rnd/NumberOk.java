package com.exception.rnd;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * [예외처리실습2]
<문제 1>
* 메소드 작성/사용 연습
클래스명 : com.exception.rnd.NumberOk.java
임의의 난수(1~100사이의 정수)를 발생시켜 키보드로 입력된 값과 비교하여, 임의의 정수를 알아 맞히는 프로그램
main 메서드 : 
    - 메서드 호출은 객체레퍼런스를 통해 게임시작메소드 호출.
키보드 입력용 메서드 : +getNumber() : int 
    - 사용자의 입력예외에 대해 예외처리 할 것
메서드명 : +checkNumber(int) : int
    - 이 메서드에 키보드로 입력받은 정수를 넘겨 
          임의로 발생된 정수와 비교하여, 같으면 0
                  난수보다 적으면 -1,
                  난수보다 크면 1을 리턴함
메인에서 반환값에 따라 정수를 맞힐 때 까지 checkNumber 반복 실행
값을 맞히면 "맞았습니다." 출력하고, 몇번째에 맞혔는지도 출력
계속 할 것인지 물어서, y 이면 계속, n 이면 종료시킴
예)
임의의 정수 발생(화면에 안보이게 함) : 예를 들면 55
정수 입력 : 50
입력한 숫자보다 작습니다.
정수 입력 : 60
입력한 숫자보다 큽니다.
정수 입력 : 55
맞았습니다.(3번$$
계속 하시겠습니까?(y/n) : n
프로그램을 종료합니다.

 *
 *
 */
public class NumberOk {
	Scanner sc = new Scanner(System.in);
	int rnd, cnt;
	
	public static void main(String[] args){
		
		new NumberOk().go();
		
		System.out.println("프로그램을 종료합니다.");
	}

	public void go() {
		getRandomNumber();
		
		while(true){
			
			cnt++;
			
			int userNum = getNumber();
			
			int result = checkNumber(userNum);
			
			if(result > 0)
				System.out.println("입력한 숫자보다 작습니다.");
			else if(result <0)
				System.out.println("입력한 숫자보다 큽니다.");
			else {
				System.out.print("맞았습니다(."+cnt+"번) \n\n 계속 하시겠습니까? (y/n) : ");
				String answer = sc.next();
				
				if(answer.toLowerCase().charAt(0)=='y'){
					getRandomNumber();
				}
				else {
					break;
				}
				}
			}
				
		}
	

	public void getRandomNumber() {
		rnd = new Random().nextInt(100)+1;
		
		cnt = 0;
	}

	public int checkNumber(int userNum) {
		int result;
		
		if(userNum-rnd>0) result = 1;		//입력숫자가 큰 경우	: 입력하신 숫자보다 작습니다.
		else if(userNum-rnd<0) result = -1;	//입력숫자가 작은 경우 : 입력하신 숫자보다 큽니다.
		else result = 0;					//정답.
		
		return result;
	}

	/**
	 * 사용자 정수 입력 메소드
	 * 
	 * InputMismatchException 에 대해서
	 * 
	 * -----------------------------------------------------------------------------------
	 * When a scanner throws an InputMismatchException, 
	 * the scanner will not pass the token that caused the exception, 
	 * so that it may be retrieved or skipped via some other method.
	 * -----------------------------------------------------------------------------------
	 * That means that if the next token is not an int, it throws the InputMismatchException, 
	 * but the token stays there. 
	 * So on the next iteration of the loop, sc.nextInt() reads the same token again and throws the exception again. 
	 * What you need is to use it up. Add a reader.next() inside your catch to consume the token, 
	 * which is invalid and needs to be discarded.
	 * 
	 * @return
	 */
	public int getNumber() {
		int num;
		
		while(true){

			try {
			
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				break;	//정상적인 수를 입력한경우, 반복문 종료!
				
			} catch (InputMismatchException e){
				
				System.out.println("정수를 입력하세요!");
				sc.next();
				
//				throw e;
			}
		}
		
		return num;
	}
	
}