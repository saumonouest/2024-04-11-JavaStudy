package com.sist.io;
/*	File
 * 	InputStream		OutputStream
 * 		|				  |
 * 	FileInputStream	FileOutputStream
 * 	=> 파일 읽기 		=> 파일 쓰기 			=> 1byte씩 읽어서 출력 / 입력
 * 	=> read() 		=> write()			=> close()
 * 	-------------------------------------------------------------------- 다운로드 / 업로드
 * 	Reader 			Writer
 * 	  | 			  |
 * 	FileReader		FileWriter
 * 	=> 파일 읽기 		=> 파일 쓰기 
 * 	=> read()		=> write() 			=> 2byte씩 읽어서 출력 / 입력 => close() 
 * 	-------------------------------------------------------------------- 한글이 포함된 데이터를 입출력
 * 
 */
import java.io.*;
public class 라이브러리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			File file = new File("C:\\JavaDev\\javaStudy\\Chapter11_라이브러리(java.io)_1\\src\\com\\sist\\");
			fis=new FileInputStream(file);
			int i=0; // 문자 번호를 읽어 온다 A => 65
			while((i=fis.read())!=-1) { // -1 EOF(End Of File)
				System.out.print((char)i); 
			}
		
		}catch(Exception ex) {
			ex.printStackTrace(); // 에러 확인
		}
		finally {
			// 정상 수행(try) / 오류 발생(catch) 상관 없이 무조건 수행하는 문장
			try {
				fis.close();
			}catch(Exception e) {}
		}
	}

}
