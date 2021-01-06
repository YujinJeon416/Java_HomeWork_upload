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

import java.io.FileNotFoundException;

public class PropertiesMain {

	public static void main(String[] args) {
		new PropertiesMain().start();
	}

	private void start() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/config.properties"));
			
//			prop.list(System.out);
			
			String OS = prop.getProperty("OS");
			String Price = prop.getProperty("Price");
			String Company = prop.getProperty("Company");
			String PrimaryUI = prop.getProperty("PrimaryUI");
			
			System.out.println("OS="+OS);
			System.out.println("Price="+Price);
			System.out.println("Company="+Company);
			System.out.println("PrimaryUI="+PrimaryUI);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



