package com.thread.alphabet;

public class LowerAlphbetThread implements Runnable {
	
	public void LowerAlphbetThread() {}
	
	@Override
	public void run() {
		
		for(char i='a'; i<='z'; i++) {
			System.out.print(i);
		}
		
	}

}