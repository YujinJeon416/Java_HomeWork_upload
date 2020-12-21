package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if((first >= 1 && first <= 9) && (second >= 1 && second <= 9)){
			int result = first * second;
			if(result >= 1 && result <= 9)
				System.out.println("한자리수 입니다.");
			if(result >= 10 && result <= 99)
				System.out.println("두자리수 입니다.");
		}

	}

}
