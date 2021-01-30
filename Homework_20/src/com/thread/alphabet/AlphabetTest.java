package com.thread.alphabet;
/**
 * <문제 2>
- 실행용 클래스 : com.thread.alphabet.AlphabetTest.java
- 쓰레드 클래스 : com.thread.alphabet.UpperAlphbetThread.java
               com.thread.alphabet.LowerAlphbetThread.java  
두개의 멀티쓰레드를 만들고, 각각 알파벳대문자, 알파벳 소문자를 출력하세요.

 * @author juj04
 *
 */
public class AlphabetTest {
public static void main(String[] args) {
		
		AlphabetTest abt = new AlphabetTest();
		
		abt.test();
		
	}

	private void test() {
		
		Thread th1 = new Thread(new UpperAlphbetThread());
		Thread th2 = new Thread(new LowerAlphbetThread());
		
		th1.start();
		th2.start();
		
	}
	

}




