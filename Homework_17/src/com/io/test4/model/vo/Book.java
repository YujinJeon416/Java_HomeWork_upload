package com.io.test4.model.vo;
/**
 * @실습문제4 : 입출력실습문제4_object
 - 패키지 : com.io.test4
1. 객체로 사용할 클래스 : com.io.test4.model.vo.Book.java //직렬화 처리함
    * Field
    - title:String  //도서명
    - author:String //저자
    - price:int //가격
    - dates:Calendar    //출판날짜
    - discountRate:double   //할인율
    * Constructor
    + 디폴트 생성자
    + 매개변수 있는 생성자
    * Method
    + Setters ans Getters 작성
    + toString():String     //Override
        : 날짜에 포맷 적용함 ("yyyy'년' MM'월' dd'일 출간')

 */

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDates() {
		return dates;
	}
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	@Override
	public String toString() {
		String year = String.valueOf(dates.get(Calendar.YEAR));
		String month = String.valueOf(dates.get(Calendar.MONTH));
		String day = String.valueOf(dates.get(Calendar.DATE));

		if(Integer.parseInt(month)==0) {
			month = "12";
		}
		else if(Integer.parseInt(month)<10) {
			month = "0" + month;
		}
		
		return "Book [도서명=" + title + ", 저자=" + author + ", 가격=" + price + ", 출판날짜=" + 
	year+"년 "+month+"월 "+day+"일 출간"
				+ ", 할인율=" + discountRate + "]";
	}	
}