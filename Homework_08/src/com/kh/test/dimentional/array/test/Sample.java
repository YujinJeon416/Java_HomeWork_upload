package com.kh.test.dimentional.array.test;
/**
 * [2차원 배열 실습문제]
 - 클래스 생성 : com.kh.test.dimentional.array.test.Sample.java
[문제 1]
 - 메소드명 : public void exercise1()
 - 구현내용 : 
    1. 3행짜리5열 2차원배열 선언 및 생성
    2. 1~100사이의 임의의 정수를 모든 방에 기록함
    3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함

 * 
 *
 */
public class Sample {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();
	} 
	
	public void exercise1() {
		
		//3행 5열 2차원 배열 선언
		int[][] arr = new int [3][5]; 
		//열의 합계 넣어둘 변수 
		int[] sum = new int[arr.length];
		
		// 1~100사이의 임의의 정수를 모든 방에 기록함
		for(int i=0; i<3; i++) {
			arr[i] = new int[5]; // 2차원 배열 행렬 중 열.

			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
				sum[i] += arr[i][j]; // 각 행의 더한 값을 다른 배열에 담아둔다. (5의 배수 판별을 위해)
			}			
		}
		System.out.println();

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			if(sum[i]%5==0) {
				System.out.println("["+i+"]열의 합계(5의 배수): "+sum[i]);
			}else {
				System.out.println("["+i+"]열의 합계(5의 배수): 5의 배수가 아닙니다.");					
			}
		}	
    }

	}


