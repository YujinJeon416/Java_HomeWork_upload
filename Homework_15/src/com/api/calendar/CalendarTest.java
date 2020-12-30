package com.api.calendar;

import java.util.Calendar;

/**
 * <문제 1>  ---------------------------------------------------------------------
 - 클래스 : com.api.calendar.CalendarTest.java
Calendar 클래스 사용
오늘 날짜에 대한 객체 생성
년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
"2011년 3월 21일 월요일 3시 20분 5초" 로 출력해 보시오.

 * 
 *
 */
public class CalendarTest {
	
	public static void main (String args[]) {
	//2011년 3월 21일 월요일 3시 20분 5초로 나오면 된다.
			Calendar today = Calendar.getInstance();
			today.set(2011, 3, 21, 3, 20, 5);
			
			int year=today.get(Calendar.YEAR);
			int month= today.get(Calendar.MONTH);
			int date=today.get(Calendar.DATE);
			int dayname = today.get(Calendar.DAY_OF_WEEK);
			int hour=today.get(Calendar.HOUR);//시간이 뜬다.
			int min=today.get(Calendar.MINUTE);//분이 뜬다.
			int sec= today.get(Calendar.SECOND);//초가 뜬다.
			int day=today.get(Calendar.DAY_OF_WEEK);
			String[] arr =  {"일요일" , "월요일" , "화요일" , "수요일" , "목요일" , "금요일" ,"토요일" };
			
			
			
			System.out.println(year+"년"+month+"월"+date+"일"+arr[dayname-1]+hour+"시"+min+"분"+sec+"초");
			
			
		}
	
//	public class CalendarTest {
//		public static void main(String[] args){
//			Calendar cal = Calendar.getInstance();
//			int year = cal.get(Calendar.YEAR);
//			int month = cal.get(Calendar.MONTH)+1;
//			int date = cal.get(Calendar.DATE);
//			int day = cal.get(Calendar.DAY_OF_WEEK); //일요일:1~토요일:7
//			String sDay="";
//			
//			switch(day){
//			case 1: sDay = "일요일"; break;
//			case 2: sDay = "월요일"; break;
//			case 3: sDay = "화요일"; break;
//			case 4: sDay = "수요일"; break;
//			case 5: sDay = "목요일"; break;
//			case 6: sDay = "금요일"; break;
//			case 7: sDay = "토요일"; break;
//			}
//			
//			System.out.println(year+"년 "+month+"월 "+date+"일 "+sDay);
//		}
//	}


	

}
