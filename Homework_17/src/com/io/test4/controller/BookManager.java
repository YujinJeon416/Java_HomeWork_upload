package com.io.test4.controller;
/**
 * 2. 객체입출력 처리용 클래스 : com.io.test4.controller.BookManager.java
    * Field
    ~ sc:Scanner    //초기화 객체 생성함
    * default 생성자
    * Method
    + fileSave():void
    >> 구현내용
        1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
        2. "books.dat" 파일에 객체 기록 저장함
        3. try with resource 문 사용할 것
        4. "books.dat 에 저장 완료!" 출력
    + fileRead():void
    >>구현내용
        1. Book 객체 배열 선언 : 10개
        2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
        3. 객체 정보를 화면에 출력함
        4. try with resource 문 사용할 것
        5. "books.dat 읽기 완료!" 출력

 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager implements Serializable{
		
	
		private static final long serialVersionUID = 1L;
		Scanner sc = new Scanner(System.in);
		
		public BookManager() {
			
		}
		
		public void fileSave() {
			Book[] book = new Book[] {  // Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
					new Book("코스모스","칼 세이건",16000, new GregorianCalendar(2006,12,20),0.06), 
					new Book("골든 아워", "이국종", 14000, new GregorianCalendar(2018,10,02),0.1),
					new Book("이기적 유전자","",18000, new GregorianCalendar(2018,10,20),0.1),
					new Book("우울할 땐 뇌과학","알렉스 코브", 15000, new GregorianCalendar(2018,03,12),0.1),
					new Book("여행의 이유", "김영하", 12000, new GregorianCalendar(2019,04,17),0.05)
			};
			try(ObjectOutputStream oos = new   //try with resource 문 사용할 것
					ObjectOutputStream(new FileOutputStream("books.dat"));){  // "books.dat" 파일에 객체 기록 저장함
				oos.writeObject(book);
			}catch(IOException e) {
				e.printStackTrace();
				
			}
			System.out.println("books.dat에 저장 완료!"); //"books.dat 에 저장 완료!" 출력
			
		}
		
		public void fileRead() {
			Book[] book = new Book[10];   // Book 객체 배열 선언 : 10개
			try(ObjectInputStream ois =     //try with resource 문 사용할 것
					new ObjectInputStream(new FileInputStream("books.dat"));) {  // "books.dat" 파일에서 데이터 읽어서 배열에 저장함
				book = (Book[])ois.readObject();
				for(int i = 0; i < book.length; i++) {
					System.out.println(book[i]);  //객체 정보를 화면에 출력함
				}
			}catch(EOFException | ClassNotFoundException e) {
				System.out.println("books.dat 읽기 완료!");   //"books.dat 읽기 완료!" 출력
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}


