package com.collection.list.music.model.vo;

/**
 * ## @실습문제
음악playlist를 관리하는 프로그램을 만들어 보세요.
1. vo클래스 작성
@com.collection.list.music.model.vo.Music.java
-title:String
-singer:String
getter/setter, 기본생성자/파라미터있는생성자, toString 오버라이드
 * 
 *
 */
public class Music {
	
	private String title;
	private String singer;
	
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	// 필드출력용 투스트링 오버라이딩
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	

	@Override
	public boolean equals(Object oj) {
		
		if(!(oj instanceof Music)) {
			return false;
		}
		if(!(this.title.equals(((Music)oj).title))) {
			return false;
		}
		if(!(this.singer.equals(((Music)oj).singer))) {
			return false;
		}
		
		return true;
	}
		

	
	
	@Override
	public int hashCode() {
		return (title + singer).hashCode();
	}
	
}
	

