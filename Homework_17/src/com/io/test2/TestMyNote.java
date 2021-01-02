package com.io.test2;
/**
 * - 테스트 클래스명 : com.io.test2.TestMyNote.java
	main() 메소드 포함
	1. menu() 메소드 실행함
	2. public static void menu() 작성
	* 구현 내용
	MyNote 클래스 객체 생성함
	키보드 입력용 객체 생성함
	아래 내용이 콘솔에 출력되게 함

	******   MyNote  *******

	1. 노트 새로 만들기		//MyNote의 fileSave()
	2. 노트 열기			//MyNote의 fileOpen()
	3. 노트 열어서 수정하기		//MyNote의 fileAppend()
	4. 끝내기				//main() 으로 리턴

	메뉴 선택 : 번호입력

	입력된 번호에 따라, MyNote 의 메소드 실행시킴
	메뉴 반복 실행
	
 */
import java.util.Scanner;


public class TestMyNote {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MyNote mn = new MyNote();

	        while (true) {
	            System.out.println("1. 노트 새로 만들기");
	            System.out.println("2. 노트 열기");
	            System.out.println("3. 노트 열어서 수정하기");
	            System.out.println("4. 끝내기");
	            System.out.print("번호를 입력하세요 : ");
	            int menu = sc.nextInt();
	            switch (menu) {
	                case 1:
	                    mn.fileSave();
	                    break;
	                case 2:
	                    mn.fileOpen();
	                    break;
	                case 3:
	                    mn.fileEdit();
	                    break;
	                case 4:
	                    System.out.println("프로그램을 종료합니다.");
	                    return;
	                default:
	                    System.out.println("잘못 입력하셨습니다.");
	                    break;

	            }
	        }
	    }
	}