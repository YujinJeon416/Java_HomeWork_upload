package com.oop.method.static_;
/**
 * [static메소드 실습문제]
package com.oop.method.static_;
//실행클래스 Run : 적절한 방법으로 static 메소드 호출하기
//기능제공클래스 StaticMethod
public class StaticMethod {
    
    //static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
    
    
    //2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char)
    
    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String
    
}

 * @author juj04
 *
 */
public class Run {

	public static void main(String[] args) {
		System.out.println(StaticMethod.setChar("java", 0, 'x'));
		//1
		System.out.println(StaticMethod.toUpper("kh academy"));
		//2
		System.out.println(StaticMethod.getAlphabetLength("안녕, 난 James야!"));
		//3
		System.out.println(StaticMethod.concat("hello", "world"));
	}

}
