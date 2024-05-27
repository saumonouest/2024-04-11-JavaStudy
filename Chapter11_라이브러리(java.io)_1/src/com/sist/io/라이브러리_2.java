package com.sist.io;
import java.io.*;
import java.util.*;
public class 라이브러리_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 파일 생성 => 같은 폴더에서는 같은 파일명이 생성되지 않는다
		File file =new File("c:\\java_data\\student.txt");
		// 존재 여부 확인
		if(!file.exists()) { // 파일이 없다면 
			// 파일을 만들어라
			file.createNewFile(); // CheckedException => 반드시 예외처리
			System.out.println("파일 생성 완료");
		}
		else {
			System.out.println("이미 존재하는 파일");
		}
	}

}
