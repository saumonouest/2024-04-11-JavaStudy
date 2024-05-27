package com.sist.util;
import java.util.*;
import java.io.*;
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// properties 클래스 생성 => CheckException => 무조건 예외처리를 하고 사용
		try {
			Properties prop = new Properties(); // Map key = 값 (key는 중복을 할 수 없음) 
			// 파일 읽기
			prop.load(new FileInputStream("c:\\java_data\\db.properties"));
			// 값 읽기
			String driver = prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			System.out.println("Driver:"+driver);
			System.out.println("url:"+url);
			System.out.println("username:"+username);
			System.out.println("password:"+password);
		}catch(Exception ex) {}
		// Map 방식 => 구분자, 값을 동시에 저장
	}

}
