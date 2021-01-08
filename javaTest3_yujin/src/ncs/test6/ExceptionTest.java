package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.print("입력 값 : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		try {
			System.out.println("결과값 : "+new Calculator().getSum(data));
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
