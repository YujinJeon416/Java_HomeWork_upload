package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		GregorianCalendar myBirth = new GregorianCalendar();
		myBirth.set(1987, 5-1, 27);
		String dayOfWeek=null;
		
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		
		
		
		System.out.print("생일 : "+sdf.format(myBirth.getTime()));
		switch (myBirth.get(Calendar.DAY_OF_WEEK)) {
		case 1:	dayOfWeek="일";		break;
		case 2:	dayOfWeek="월";		break;
		case 3:	dayOfWeek="화";		break;
		case 4:	dayOfWeek="수";		break;
		case 5:	dayOfWeek="목";		break;
		case 6:	dayOfWeek="금";		break;
		case 7:	dayOfWeek="토";		break;
		}
		System.out.println(" "+dayOfWeek+"요일");
		System.out.println("현재 : "+sdf.format(today.getTime()));
		System.out.println("나이 : "+(year-myBirth.get(Calendar.YEAR))+"세");
	}

}

