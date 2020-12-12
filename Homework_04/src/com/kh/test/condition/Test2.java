package com.kh.test.condition;

import java.util.Scanner;

/**
 * - 메소드명 : public void test()
    국어(int), 영어(int), 수학(int) 점수를 정수형으로 입력 받아 
    총점(int)과 평균(double)을 계산하고 
    세 과목의 점수와 평균을 가지고 합격여부 처리, 
    세 과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격,
    아니면 불합격을 출력하는 프로그램을 작성하세요.
 * 
 * 
 *
 */
public class Test2 {public static void main(String[] args) {
	
	Test2 test2 = new Test2();
	test2.test();
}

	public void test(){
			int kor, eng, math,sum;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextInt();

		System.out.print("영어 : ");
		eng = sc.nextInt();

		System.out.print("수학 : ");
		math = sc.nextInt();

		sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		System.out.print("평균 : " + avg);
		System.out.println(kor>= 40 && eng>=40 && math>=40 && avg >=60 ? "합격":"불합격");
	}
}
