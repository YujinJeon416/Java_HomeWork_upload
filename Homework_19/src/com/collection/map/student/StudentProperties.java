package com.collection.map.student;
/**
 *  - 테스트 클래스 : com.collection.map.student.StudentProperties.java
    main() 포함
 - 메소드 추가 : public List<Student> readFile(){}
    //구현 내용
    1. Properties 객체 생성하고, score.txt 파일의 내용을 읽어
    2. 리스트 만듦
    3. 키를 사용하여, 객체정보를 List<Student>에 저장하여 리턴함
      => ", " 으로 문자열 분리처리
      => 분리된 문자열을 각 자료형 필드의 값으로 형변환 대입 저장함
 - 메소드 추가 : public void printConsole(List<Student> stdtList){}
    1. 전달받은 값 출력
    2. 각 객체의 국어합계, 영어합계, 수학합계를 구하고
    3. 과목별 평균점수를 출력함
 - 메소드 추가 : public void saveXMLFile(List<Student> stdtList){}
    1. "student.xml" 파일에 번호필드를 key로 객체가 가진 값 기록 저장함.
 * @author juj04
 *
 */

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

public class StudentProperties {
    public static void main(String[] args) {
		
		StudentProperties sp = new StudentProperties();
		
		List<Student> stdtList = sp.readFile();
		
		sp.printConsole(stdtList);
		
		sp.saveXMLFile(stdtList);
		
	}
	
	
	
//    main() 포함
// - 메소드 추가 : public List<Student> readFile(){}
//    //구현 내용
//    1. Properties 객체 생성하고, score.txt 파일의 내용을 읽어
//    2. 리스트 만듦
//    3. 키를 사용하여, 객체정보를 List<Student>에 저장하여 리턴함
//      => ", " 으로 문자열 분리처리
//      => 분리된 문자열을 각 자료형 필드의 값으로 형변환 대입 저장함
public List<Student> readFile() {
		
		Properties prop = new Properties();			// 프로퍼티 선언
		String fileName = "score.txt";				// 불러올 파일이름
		
		List<String> strList = new ArrayList<>();		// 프로퍼티로 불러온 자료 담을 스트링형 리스트
		List<Student> stdtList = new ArrayList<>();		// 스튜던트 객체화 자료를 담을 스튜던트형 리스트
		
		try {
			prop.load(new FileReader(fileName));			// prop에 자료 읽어옴
			Enumeration<?> names = prop.propertyNames();	// prop의 키만 묶는다.
			
			while(names.hasMoreElements()) {
				String key = (String)names.nextElement();	// 키 반복문
				strList.add((String)prop.get(key));			// 키를통해 불러온 밸류값(스튜던트 생성에 쓸 필드값들을 스트링으로 묶어둔 것)
			}												// 을 스트링형 리스트에 담음
			
			for(String str : strList) {						// 스트링 리스트 반복문
				
				StringTokenizer tokenizer = new StringTokenizer(str, ", ");		// 스트링마다 ,로 구분한 토크나이저 생성
				
				int sno = Integer.parseInt(tokenizer.nextToken());		// 각 토큰순서대로 알맞은 자료형에 담음
				String sname = tokenizer.nextToken();
				int kor = Integer.parseInt(tokenizer.nextToken());
				int eng = Integer.parseInt(tokenizer.nextToken());
				int math = Integer.parseInt(tokenizer.nextToken());
				
				stdtList.add(new Student(sno, sname, kor, eng, math));		// 모은 자료들로 객체 생성하여 스튜던트형 리스트에 담음
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		return stdtList;			// 완성된 스튜던트형 리스트 반환
			
	}
	
	
// - 메소드 추가 : public void printConsole(List<Student> stdtList){}
//    1. 전달받은 값 출력
//    2. 각 객체의 국어합계, 영어합계, 수학합계를 구하고
//    3. 과목별 평균점수를 출력함
	public void printConsole(List<Student> stdtList) {
		
		int total = stdtList.size();		// 전체 학생수 용
		
		int kSum=0;			// 과목별 합계용 변수 선언
		int eSum=0;
		int mSum=0;
		
		for(Student s : stdtList) {		// 객체 반복문
			
			kSum += s.getKor();			// 합계 
			eSum += s.getEng();
			mSum += s.getMath();
		}
		
		for(Student s  : stdtList )
			System.out.println(s);
		
		System.out.printf("학생 수 : %d%n"			// 출력문
				+ "국어 합계 : %d\t평균 : %.2f%n"
				+ "영어 합계 : %d\t평균 : %.2f%n"
				+ "수학 합계 : %d\t평균 : %.2f%n",
				total, kSum, (double)kSum/total,
				eSum, (double)eSum/total, mSum, (double)mSum/total);
		
	}
	
	
	
// - 메소드 추가 : public void saveXMLFile(List<Student> stdtList){}
//    1. "student.xml" 파일에 번호필드를 key로 객체가 가진 값 기록 저장함.
	public void saveXMLFile(List<Student> stdtList) {
		
		String fileName = "student.xml";		// 생성할 파일명
		
		Properties prop = new Properties();		// xml자료 생성 위한 프로퍼티 객체 생성
		
		for(Student s : stdtList) {			// 객체 반복문
			
			prop.setProperty(Integer.toString(s.getSno()), s.toStringForProp());
		}	
		
		try {
			prop.storeToXML(new FileOutputStream(fileName), "");	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

