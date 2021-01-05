package com.collection.map.properties;
/**
 * 제공된 파일을 프로젝트에 위치시키세요
Project-Root/
    resources/
        config.properties
    score.txt
@실습문제1
/resources/config.properties 파일의 정보를 Properties객체를 이용해서 읽어와 화면에 출력하세요.
실행클래스
com.collection.map.properties.PropertiesMain.java
 * 
 *
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMain {
	
public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("resources/config.Properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		Enumeration<?> names = prop.propertyNames();	// key 모음  - 이뉴머레이션 활용
														// iterator 같은 기능
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();	// name은 key만 모아놨음
			
			String value = prop.getProperty(name);
			System.out.println(name + " = " + name);
		}
	}

}


