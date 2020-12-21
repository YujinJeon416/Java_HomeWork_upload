package test.controller;

public class Test4 {

	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println("합: " + (first + second));
		System.out.println("차: " + (first - second));
		System.out.println("곱: " + (first * second));
		
		if(second == 0 || second < 0)
			System.out.println("나누기 : 0");
		else
			System.out.println("나머지 : " + (first / second));
		
	}

}
