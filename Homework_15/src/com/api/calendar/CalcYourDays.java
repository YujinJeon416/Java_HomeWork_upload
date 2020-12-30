package com.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * [날짜관련 실습문제1]
[문제1] 
패키지 com.api.calendar.CalcYourDays.java
사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.

 * @author juj04
 *
 */
public class CalcYourDays {
	public static void main(java.lang.String[] args) {
		 
		  // 시스템 일자를 가지고 오기 위한 Class 생성
		  Date today = Calendar.getInstance().getTime();
		  SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		  SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		  SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		  
		  // 생년월일을 입력받기 위한 Class 생성
		  Scanner sc = new Scanner(System.in);
		  
		  // 시스템 일자 가져오기
		  int currYear = Integer.parseInt(yearFormat.format(today));
		  int currMonth = Integer.parseInt(monthFormat.format(today));
		  int currDay = Integer.parseInt(dayFormat.format(today));
		  
		  // 생년월일을 저장할 변수
		  int birthYear = 0;
		  int birthMonth = 0;
		  int birthDay = 0;
		  
		  // 계산된 일수를 저장할 변수
		  int dayCount = 0;
		  
		  // 년 입력받기
		  System.out.print("태어난 년을 입력하세요. : ");
		  birthYear = sc.nextInt();
		  
		  // 월 입력받기
		  System.out.print("태어난 월을 입력하세요. : ");
		  birthMonth = sc.nextInt();
		  
		  // 일 입력받기
		  System.out.print("태어난 일을 입력하세요. : ");
		  birthDay = sc.nextInt();
		    
		  // 계산하는 부분
		  dayCount = currDay - birthDay;
		  System.out.println(dayCount);
		  dayCount = dayCount + ((currMonth * 30) - (birthMonth * 30));
		  System.out.println(dayCount);
		  dayCount = dayCount + ((currYear * 365) - (birthYear * 365));
		  System.out.println(dayCount);
		  
		  // 결과 출력
		  System.out.println("오늘이 태어난 지 " + dayCount + "일 되는 날입니다.");
		  
		 }
	
//public void test2 {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("생일을 입력하세요.\n년도(yyyy) : ");
//		int yyyy = sc.nextInt();
//		System.out.print("월 : ");
//		int mm = sc.nextInt();
//		System.out.print("일 : ");
//		int dd = sc.nextInt();
//		
//		//today위치에 주의하자.
//		//시분초단위입력을 안하고, today를 사용자 입력이전에 위치시키면, 시간차가 줄어들어서 하루가 줄어든다.
//		//1일차인 86400초보다 적다면, 하루가 줄어든다.
//		Calendar today = Calendar.getInstance(); 
//
//		
//		Calendar birth = Calendar.getInstance();
//		birth.set(yyyy, mm-1, dd);	
//		//날짜차이 계산
//		long diff = (today.getTimeInMillis()-birth.getTimeInMillis())/1000;
//		
//		System.out.println(diff);
//		diff = diff/(60*60*24);
//		System.out.println("오늘은 "+(diff+1)+"번째날입니다."); //태어난 날이 0이 아닌 1번째 날이므로 +1을 해준다.
//		
//		
//	}

}
		 
		


