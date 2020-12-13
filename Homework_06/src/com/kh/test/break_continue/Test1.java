package com.kh.test.break_continue;

import java.util.Scanner;




	/**
	 *  * [문제 1]
		- 클래스 : com.kh.test.break_continue.Test1.java
		- 메소드명 : public void test1()
    	1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 * 
	 *
	 */
	public class Test1 {
		public static void main(String[] args) {
			Test1 t1 =new Test1();
		
			t1.test1();
			System.out.print("============\n");
			t1.test2();
		}
		
		 public void test1() {
			Scanner sc = new Scanner(System.in);
					
			int user;
			int sum = 1;
			
			System.out.println("정수를 입력하세요. : ");
			user= sc.nextInt();
			
			for(int i = 1; i<=user; i++) {
				
				if(i %2==0) {
					continue;
				}
				
				System.out.print(i);
				
				if((i !=user) &&(i+1) !=user) {
				System.out.print(" * ");	
				}
					sum *= i;
				}
			System.out.print("=" + sum+"\n");
			}
			
		 
	/**

	- 메소드명 : public void test2()
	    2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
	     
	        결과:
	        정수를 하나 입력하세요. => 100
	        다른 정수를 하나 입력하세요. => 1
	        ====================
	        1부터 100까지의 홀수의 합은 2500입니다.

	 * 
	 *
	 */			
	
	public void test2() {
	
		Scanner sc = new Scanner(System.in);
	
		 int x, y;
	     int sum = 0;
	     boolean b = false;
	 
	        System.out.print("첫 번째 숫자 입력: ");
	        int user1 = sc.nextInt();
	        System.out.print("두 번째 숫자 입력: ");
	        int user2 = sc.nextInt();
	        
	        x = user1;
	        y = user2;
	        		
	        while(true){
	        	 if(user1<user2) {
	        		 if(user1 %2 != 0)
	        			 sum += user1;
	        		 user1++;
	        		 b = true;
	        	 }  
	        	 else if(user1>user2) {
	        		 if(user2 %2 != 0)
	        			 sum += user2;
	        		 user2++;
	        	 }
	        	 else if (user1 == user2) {
	        		 break;
	        	 }
	        }
	        System.out.print("===========\n");
	        
	        if(b)
	        	System.out.print(x + "부터 " + y + "까지의 홀수의 합은 " + sum + "입니다.");
	        else
	        	System.out.print(y + "부터" + x + "까지의 홀수의 합은" +sum + "입니다. ");
	        	  
	        	  }
	        	  
	        	 }
	
		
	
				
			
			
		

 
		 
