package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.print("입력(1~5) : ");
		int num = new Scanner(System.in).nextInt();

		switch(num){
		case 1:	System.out.println("** 입력이정상적으로되었습니다! **"); break;
		case 2:	System.out.println("** 조회가시작되었습니다! ** "); break;
		case 3:	System.out.println("** 수정이정상적으로되었습니다! **"); break;
		case 4:	System.out.println("** 삭제가정상적으로되었습니다! **"); break;
		case 5:	System.out.println("** 정상적으로종료되었습니다! **"); break;
		default:	System.out.println("** 다시입력해주세요! **  ");
		}
	}

}
