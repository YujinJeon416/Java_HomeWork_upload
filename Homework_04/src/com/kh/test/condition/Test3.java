package com.kh.test.condition;

import java.util.Scanner;

/**
 * [문제 3]
- 클래스 : com.kh.test.condition.Test3.java
- 메소드명 : public void test()
    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 
    계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      
    출력 예) 입력 5, 6, +
           5+6=11
    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면
     “잘못 입력 하셨습니다.  프로그램을 종료합니다.”
      라는 문구가 출력되게 하세요.
 * 
 * 
 *
 */
		public class Test3 {
				public static void main(String[] args) {
		
					Test3 test3 = new Test3();
					test3.test();
		
	}
			public void test(){
				Scanner sc = new Scanner(System.in);
				
				int a, b; 
				String c;
				char d;
				
				System.out.println("정수 입력 : ");
				a = sc.nextInt();
				System.out.println("정수 입력 : ");
				b = sc.nextInt();
				System.out.println("연산자 입력(+,-,*,/) : ");
				c= sc.next();
				d = c.charAt(0);
				
				if(d=='+') {
					System.out.println(a + " + " + b + " = " + (a+b));
				}
					else if (d=='-') {
					System.out.println(a + " - " + b + " = " + (a-b));
					}
					else if (d=='*') {
					System.out.println(a+"*"+b+"="+(a*b));
					}
					else if (d=='/') {
					System.out.println(a+"/"+b+"="+(a/b));
					}
					else {
					System.out.println("잘못 입력하셨습니다.");
			}
		}
				
				
				
				
				
	
}


