package com.oop.emp.model;

import java.util.Scanner;

/**
 * <객체실습>
클래스명 : com.oop.emp.model.Employee
    - 사원정보 관리용 클래스
    - Field 작성 : 캡슐화 반드시 적용함
    사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String
Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

 * 
 *
 */
public class Employee {
	
	//Field 작성 : 캡슐화 반드시 적용함
	private int empNo; 
	private String empName; 
	private String dept;  
	private String job; 
	private int age;  
	private char gender;  
	private int salary;  
	private double bonusPoint;  
	private String phone;   
	private String address;

	//키보드 입력용 메소드 empInput()
	public void empInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("사번 : ");
		setEmpNo(sc.nextInt());
		

		System.out.print("이름 : ");
		setEmpName(sc.next());

		System.out.print("소속부서 : ");
		setDept(sc.next());

		System.out.print("직급  : ");
		setJob(sc.next());

		System.out.print("나이  : "); 
		setAge(sc.nextInt());
		
		System.out.print("성별(F/M)  : "); 
		setGender(sc.next().charAt(0));

		System.out.print("급여  : "); 
		setSalary(sc.nextInt());
		
		System.out.print("보너스 포인트  : "); 
		setBonusPoint(sc.nextDouble());

		System.out.print("핸드폰  : ");
		setPhone(sc.next());

		System.out.print("주소  : ");
		setAddress(sc.nextLine());
	}
		
	//emp객체 모든 필드 출력용 메소드 : empOutput()
	public void empOutPut() {
		System.out.println(
		  "사번: " + getempNo() + "\n"
		  + "이름 : " 	+ getempName() + "\n"
		  + "소속부서 : " 	+ getdept() + "\n"
		  + "직급 : " 	+ getjob() + "\n"
		  + "나이 : " 	+ getage() + "\n"
		  +"성별(F/M) : "   + getgender() + "\n"
		  +"급여: " 	+ getsalary() + "\n"
		  + "보너스 포인트 : " + getbonusPoint()+"\n"
		  + "주소 : " + getaddress());
		  
	}
	

	
	

	
	//getter
	public int getempNo() {
		return empNo; 
	}
	public String getempName() {
		return empName; 
	}
	public String getdept() {
		return  dept; 
	}
	public String getjob() {
		return job; 
	}
	public int getage() {
		return age; 
	}
	public char getgender() {
		return gender; 
	}
	public int getsalary() {
		return salary; 
	}
	public double getbonusPoint() {
		return bonusPoint; 
	}
	public String getphone() {
		return phone; 
	}
	public String getaddress() {
		return address; 
	}
	
	//settter
		public void setEmpNo(int empNo) {
		this.empNo = empNo;
		}	

		public void setEmpName(String empName) {
			this.empName = empName;
			
		}
		public void setDept(String dept) {
			this.dept = dept;

		}
		public void setJob(String job) {
			this.job =  job;
		}	

		public void setAge(int age) {
			this.age = age;
		}	

		public void setGender(char gender) {
			this.gender = gender;
		}	

		public void setSalary(int salary) {
			this.salary = salary;
		}	

		public void setBonusPoint(double bonusPoint) {
			this.bonusPoint =  bonusPoint;
		}	
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public void setAddress(String address) {
			this.address = address;
		}	
		
		
	
}
