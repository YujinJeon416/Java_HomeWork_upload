package com.oop.movie.model.entity;

import java.util.Calendar;



/**
 * ## 생성자실습문제2
@실습문제1 : 영화클래스 만들기
- 클래스명 : com.oop.movie.model.entity.Movie.java
- 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.
영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.
 * 
 *
 */
public class Movie {
	
	//멤버변수 : 반드시 캡슐화를 적용할 것
	private String movieTitle;
	private String director;
	private String[] Casting;
	private Calendar release;
	private Object Calendar;

		public Movie() {
			System.out.println("Movie 객체 생성!");
		}
		
		//파라미터 생성자
		//생성자간 생성자호출 this()를 활용할 것.
		
		// 1. movieTitle
       public Movie(String movieTitle) {
		  this.movieTitle = movieTitle ;  
			
		}
		
		 //2. movieTitle, director
       public Movie(String movieTitle, String director ) {
			  this.movieTitle = movieTitle ;  
			  this.director = director ;  
			
			}

		// 3. movieTitle, director, casting
       public Movie(String movieTitle, String director, String[] Casting ) {
    	      this(movieTitle, director);
			  this.Casting = Casting ;  
				
			}

		//  4. movieTitle, director, casting, release
       public Movie(String movieTitle, String director, String[] Casting, Calendar release ) {
    	      this(movieTitle, director, Casting);
			  this.Calendar = Calendar ;  
				
			}

       public String getMovieTitle() {
    	   return movieTitle;
       }

       public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
       }

       public String getDirector() {
    	   return director;
       }

       public void setDirector(String director) {
		this.director = director;
       }

       public String[] getCasting() {
    	   return Casting;
       }

       public void setCasting(String[] Casting) {
		this.Casting = Casting;
       }
       
       public Calendar getRelease() {
    	   return release;
       }

       public void setRelease(Calendar release) {
		this.release = release;
       }

       public Object getCalendar() {
    	   return Calendar;
       }

       public void setCalendar(Object calendar) {
    	   Calendar = calendar;
       }


       public void printMovie() {
   		System.out.println(movieTitle + "," + director+ "," + Casting[] + "," + Calendar);
   	}
}
