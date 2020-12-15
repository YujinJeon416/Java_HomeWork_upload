package com.kh.test.nested.loop;

import java.util.Scanner;

/**
 * [문제3]
클래스명: com.kh.test.nested.loop.Test3.java
메소드명: public void test()
    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    프로그램을 만들어보자.
        출력예)
      정수 입력 : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
 
 * 
 *
 */
public class Test3 {
	
		public static void main(String[] args) {
			Test3 t = new Test3();
			t.test();
			
		}
	
		public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		if( num>0) {
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[1].length; j++) {

					if (i >= j) {
						System.out.print("*"); 

					}
				}
				System.out.println();
			}
		}
		
				for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[1].length; j++) {

					if (i <= j) {
						System.out.print("*"); 
					}
				}
				System.out.println();
			}
		}
		
		else  {
			System.out.println("양수가 아닙니다."); //에러!!!!!!!!!
		}
	}

		
	}

	
