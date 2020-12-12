package com.kh.test;
/**
 * 2. 다음 코드의 형변환 과정과 결과값을 예상해 주석으로 작성한뒤 콘솔 결과와 비교하세요.
        public void test2(){
            System.out.println("A = "+ ('A'+0)); //("65 = "+ ('65'+0));
            
            System.out.println("0 =" + ('0' + 0) );  //48
            
            System.out.println("(char)65 = " + (char)65); //A
            
            byte bt1 = 125; 
            char ch1 = 'C';
            int it1 = bt1 - ch1;
            System.out.println("it1 = "+it1);  //58 125-67=58
            
            
            boolean bool = false;
            
            bool = (2.0 == 5/2);
            System.out.println("bool = " + bool); //fales->true->false
            
            bool = ('C' == 67);
            System.out.println("bool = " + bool); //false->true
            
            bool = ('A' == 'B'-1);
            System.out.println("bool = " + bool); //fasle->true
            
            bool = ('a' != 97 );//부정연산자
            System.out.println("bool = " + bool); //fales ->!true->false
        }

 * 
 * 
 *
 */
public class Test2 {
	  public void test2(){
          System.out.println("A = "+ ('A'+0)); 
          
          System.out.println("0 =" + ('0' + 0) ); 
          
          System.out.println("(char)65 = " + (char)65); 
          
          byte bt1 = 125; 
          char ch1 = 'C';
          int it1 = bt1 - ch1;
          System.out.println("it1 = "+it1); 
          
          
          boolean bool = false;
          
          bool = (2.0 == 5/2);
          System.out.println("bool = " + bool); 
          
          bool = ('C' == 67);
          System.out.println("bool = " + bool); 
          
          bool = ('A' == 'B'-1);
          System.out.println("bool = " + bool); 
          
          bool = ('a' != 97 );//부정연산자
          System.out.println("bool = " + bool); 
      }

	

}
