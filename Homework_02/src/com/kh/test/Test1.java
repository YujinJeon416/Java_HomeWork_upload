package com.kh.test;



/**
 * # 정수 실습문제
1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
    - 정수형 100, 9999억, 
    - 실수 486.520(float), 567.890123
    - 문자 A
    - 문자열 Hello world, 
    - 논리 true
     
     단, 변수를 이용하여 출력하시오 .
 * 
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Test1 ts1 = new Test1();
		ts1.test1();
	    ts1.test2();
		ts1.test3();
	    ts1.test4();
	    ts1.test5();
	    ts1.test6();
	    ts1.test7();

}
	public void test1() {
		byte  b;
		 b = 100;
		 System.out.println(b);
				}
	public void test2() {
		long l;
		 l = 999900000000L;
		 System.out.println(l);
				}
	public void test3() {
		float f;
		 f = 486.520f;
		 System.out.println(f);
				}
	
	public void test4() {
		float f;
		 f = 567.890123f;
		 System.out.println(f);
				}
	public void test5() {
		char ch;
		 ch = 65;
		 System.out.println(ch);
				}

     public void test6() {
		String name = "Hello";
		System.out.println(name + " World ");}
     
     public void test7() {
    	 boolean bool;
    	  bool = true;
 		  bool = false;
 		  bool = (7 > 3);
 		 System.out.println("bool = " + bool);
 				}
}