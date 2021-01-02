package com.io.test4.run;
/**
 * 3. 테스트용 클래스 : com.io.test4.run.TestBookManager.java
    main() 포함
    1. BookManager 클래스의 메소드 실행 테스트함

 */
import com.io.test4.controller.BookManager;

public class TestBookManager {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

}
