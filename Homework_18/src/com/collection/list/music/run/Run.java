package com.collection.list.music.run;
/**
 * 2. 실행클래스(메인메소드 포함)
@com.collection.list.music.run.Run.java
 */
import com.collection.list.music.view.MusicMenu;

public class Run {

	public static void main(String[] args) {
		new MusicMenu().mainMenu();
		
		// 뮤직메뉴가 끝나기 전까지는 계속 반복
		System.out.println("===== 이용해주셔서 감사합니다. =====");
	}
}
