package com.kh.test.condition;

import java.util.Scanner;

/**
 * 2020/12/9 과제 
 * 전유진
 *
 */

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		
		test1.test1();
		test1.test2();
		test1.test3();
		
	}
			
	/**
	 * 
	*1.메소드명 : public void test1()
    *- 국어, 영어, 수학 점수를 입력 받아 합계를 계산하고 합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.
    */	
		public void test1() {
			Scanner sc = new Scanner(System.in);
			int kor, eng, math, sum;
			
			
				System.out.println("국어점수: ");
				kor = sc.nextInt();
				
				System.out.println("영어점수: ");
				eng = sc.nextInt();
				
				System.out.println("수학점수: ");
				math = sc.nextInt();
			
				sum = kor + eng + math;
				
				System.out.print("합계 : " + sum);
				if(sum >=250 ) { 
					
					System.out.println("우수생입니다.");
				  }
				System.out.println("---test1종료---");
		}


/**
 *  2.메소드명 : public void test2()
        - A, B, C연봉을 입력하고 각 연봉을 입력하고 연 봉이 5000이상이면 “0은 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요.
 */

		public void test2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("A 연봉 : ");
			int salA = sc.nextInt();
			
			System.out.print("B 연봉 : ");
			int salB = sc.nextInt();
			
			System.out.print("C 연봉 : ");
			int salC = sc.nextInt();
			
			if (salA >= 5000) {
				System.out.println("A는 고액연봉자입니다.");
			} 
			if (salB >= 5000) {
				System.out.println("B는 고액연봉자입니다.");
			}
			if (salC >= 5000) {
				System.out.println("C는 고액연봉자입니다.");
			}
			System.out.println("---test2종료---");
		}
		

/**
 * 3.메소드명 : public void test3()
        - 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.

 */
		
		public void test3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();
		
			if(num  % 2 == 0) { 
				System.out.println("짝수다!");
			}
			else {
				System.out.println("홀수다!");
			}
			System.out.println("---test3종료---");
		 
		}
		












}
				
		
			
			
			