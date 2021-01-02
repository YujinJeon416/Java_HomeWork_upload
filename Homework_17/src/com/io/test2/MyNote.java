package com.io.test2;

/**
 * [보조스트림 입출력 실습문제]
<문제 1>
 : 문자기반스트림과 보조스트림으로 버퍼이용스트림 클래스를 사용하시오.
 - 패키지명 : com.io.test2
 - 클래스명 : MyNote.java	
 - Field : - sc:Scanner	//초기화 생성함
 - Constructor : default
 - Method
	+ fileSave():void
	+ fileOpen():void
	+ fileAppend():void
 - 구현내용
	* fileSave() 메소드 -------------------------------------------
	1. "파일에 저장할 내용을 입력하시오"  출력
	2. StringBuilder 를 사용하여 문자열을 반복해서 입력받아 추가함
	3. "exit" 입력되면 반복 종료함
	4. "저장하시겠습니까? (y/n) : " 출력
	5. 입력값이 대소문자 상관없이 'Y' 이면, "저장할 파일명 : " 출력
	6. 파일명 입력받아, 해당 파일에 출력 기록함.
	7. "oooo.txt 파일에 성공적으로 저장하였습니다." 출력
	8. 스트림 반납하고 리턴함

	* fileOpen() 메소드 ----------------------------------------
	1. "열기할 파일명 : " 출력하고, 파일명 입력받음
	2. 파일 입력 스트림 생성
	3. 파일의 내용을 한 줄씩 읽어서 화면에 출력함
	4. 스트림 반납하고 리턴

	* fileAppend() 메소드 -----------------------------------------
	1. "수정할 파일명 : " 출력하고, 파일명 입력받음
	2. 파일 입력 스트림 생성
	3. 파일 출력 스트림 생성 : 단, 기존 내용 둔 상태로 생성할 것
	4. 파일의 내용을 읽어서 화면출력.
	5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용을 StringBuilder에 저장하기.
	7. "exit" 입력하면 반복 종료함
	8. "저장하시겠습니까? (y/n) : " 출력
	9. 입력값이 대소문자 상관없이 'Y' 이면, 해당 파일에 출력 기록함.
	10. "ooo.txt 파일의 내용이 변경되었습니다." 출력
	11. 스트림 반납하고 리턴함
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	 Scanner sc = new Scanner(System.in);

	  

	    public void fileSave() {
	        StringBuilder sb = new StringBuilder();
	        String content = null;
	        System.out.println("파일에 저장할 내용을 입력하시오(\\\"exit\"\\을 입력하면 내용 입력 끝) ");
	        while (true) {
	            content = sc.nextLine();

	            if (content.equalsIgnoreCase("exit")) break;
	            else {
	                sb.append(content);
	                sb.append("\n");
	            }
	        }

	        System.out.print("저장하시겠습니까? (y/n) : ");
//	        String save =

	        if (sc.next().equalsIgnoreCase("y")) {
	            BufferedWriter bw = null;
	            try {
	                sc.nextLine();
	                System.out.print("저장할 파일명 : ");
	                String title = sc.nextLine();
	                bw = new BufferedWriter(new FileWriter(title + ".txt"));
	                bw.write(sb.toString());
	                System.out.println("입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.");
	            } catch (IOException e) {
	                e.printStackTrace();
	            } finally {
	                try {
	                    bw.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }

	        } else {
	            System.out.println("다시 메뉴로 돌아갑니다");
	        }


	    }

	    public void fileOpen() {
	        System.out.println("열기 할 파일명 : ");
	        String title = sc.nextLine();
	        BufferedReader br = null;
	        String content = null;
	        try {

	            br = new BufferedReader(new FileReader(title + ".txt"));
	            while ((content = br.readLine()) != null) {
	                System.out.println(content);
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }


	    }

	    public void fileEdit() {
	        BufferedReader br = null;
	        BufferedWriter bw = null;
	        System.out.print("수정 할 파일명 : ");
	        String title = sc.next();
	        sc.nextLine();
	        String content;
	        String add;
	        StringBuilder sb = new StringBuilder();

	        try {
	            br = new BufferedReader(new FileReader(title + ".txt"));
	            bw = new BufferedWriter(new FileWriter(title + ".txt",true));
	            while((content = br.readLine())!=null){
	                System.out.println(content);
	            }
	            System.out.print("파일에 추가할 내용을 입력하시오(\\\"exit\\\"을 입력하면 내용 입력 끝) : ");

	            while(true){
	                add = sc.nextLine();

	                if(add.equalsIgnoreCase("exit")){
	                    break;
	                }else{
	                    sb.append(add);
	                    sb.append('\n');
	                }

	            }
	            System.out.print("변경된 내용을 저장하시겠습니까?(y/n)");

	            String save = sc.nextLine();
	            if(save.equalsIgnoreCase("y")){
	                bw.write(sb.toString());
	                System.out.println(title + ".txt 파일의 내용이 변경되었습니다.");
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try{
	                br.close();
	                bw.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }




	    }


	}

