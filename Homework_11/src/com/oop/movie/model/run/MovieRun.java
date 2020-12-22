package com.oop.movie.model.run;

import java.util.Calendar;

import com.oop.movie.model.entity.Movie;


//영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.


public class MovieRun {
	public static void main(String[] args) {
		
		
	
		Movie m = new Movie();
	
		//1. movieTitle
		Movie m1 = new Movie("원더랜드");
		m1.printMovie();
		
		//2. movieTitle, director
		Movie m2 = new Movie("원더랜드" , "김태용감독");
		m2.printMovie();
		
		//3. movieTitle, director, casting
		Movie m3 = new Movie("원더랜드", "김태용감독", "공유, 정유미, 수지, 박보검, 최우식");
		m3.printMovie();
		
		//4. movieTitle, director, casting, release
		Movie m4 = new Movie("원더랜드", "김태용감독" , "공유, 정유미, 수지, 박보검, 최우식" , "2021년 4월 16일");
		m3.printMovie();
	}
		
		
	

	
	    
	   
	    
	
		
		
	

	
	/**
	 * casting 객체를 배열로 관리
	 */
	public void Casting() {
		//1. 객체 배열 선언
		Casting[] arr = new Casting[5];
				//향상된 for문 
		for(Casting c : arr) {
		System.out.println(c);
		}
			
		}
		//2. 객체를 각각 할당 
		arr[0] = new Casting("공유");
		arr[1] = new Casting("정유미");
		arr[2] = new Casting("수지");
		arr[3] = new Casting("박보검");
		arr[4] = new Casting("최우식");
		
		//3. 출력

		for(Casting c : arr) {
			c.printCasting();
		}
				
	}
 }
