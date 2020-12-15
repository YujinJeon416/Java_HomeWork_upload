package com.kh.test.nested.loop;

import java.util.Scanner;

/**
 * [문제1]
클래스명: com.kh.test.nested.loop.Test1.java
메소드명: public void test()
    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    출력예)
    정수 하나 입력 : 5
    1
    12
    123
    1234
    12345
    출력예)
    정수 하나 입력 : -5
    양수가 아닙니다.

 * 
 *
 */
		public class Test1 {
			
			public static void main(String[] args) {
				Test1 t = new Test1();
				t.test();
			}
			
			public void test() {

				Scanner sc = new Scanner(System.in);
				System.out.print("정수 하나 입력 : "); 
				int num = sc.nextInt();
				int[][] arr = new int[num][num];

				if (num <= 0) {
					System.out.println("양수가 아닙니다.");//에러뜸.....

				}

				else {

					for (int i = 0; i < arr.length; i++) {

						for (int j = 0; j < arr[1].length; j++) {

							if (i >= j) {
								System.out.print("●"); //숫자로 못하겠음 

							}
						}
						System.out.println();
					}
				}

			}
		}
					
				
		
		
				
	
			
				

