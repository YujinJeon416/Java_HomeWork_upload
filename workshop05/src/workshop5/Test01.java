package workshop5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		
		for (int i = arr.length-1; i >= 0; i--) { // 뒤에서부터 길이 -1
			System.out.print(arr[i]);
		}
		
	}

}