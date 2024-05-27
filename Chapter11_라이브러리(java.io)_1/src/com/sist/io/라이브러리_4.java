package com.sist.io;
import java.io.*;
import java.util.*;
import java.text.*;
/*	File 관련
 * 	1. 생성자 => 경로명 : 폴더 정보 읽기
 * 				File dir = new File("c:\\JavaDev");
 * 			 => 경로명 / 파일명 : 파일에 대한 정보
 * 				File dir = new File("c:\\JavaDev\\파일명");
 * 
 * 	2. 폴더 생성 : mkdir()
 * 		파일 생성 : createNewFile()
 * 	
 * 	3. 폴더 삭제 : delete()
 * 				=> 폴더 안에 파일 / 폴더가 있는 경우에는 삭제가 안 된다
 * 						   --------- 먼저 삭제 후에 => 삭제 
 * 		파일 삭제 : delete() => 삭제
 * 	
 * 	4. 폴더 안에 있는 파일 / 폴더의 정보 읽기 : listFiles() : File[]
 * 	
 * 	5. 파일명, 경로명
 * 		getName(), getPath()
 * 	
 * 	6. 
 * 
 */
public class 라이브러리_4 {
	// 코딩이 된 상태 => throws 
	// 코딩이 시작 => try ~ catch
	// io / sql / net => 클래스가 CheckedException을 가지고 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir=new File("c:\\JavaDev");
			// 파일 정보 읽기
			File[] list=dir.listFiles(); // c:\\javaDev에 있는 모든 파일 읽기
			for(File file:list){
				if(file.isFile()) { // 파일
					System.out.print(file.getName()+"   ");
					String s=file.getName();
					s=s.substring(s.lastIndexOf(".")+1); // 확장자
					System.out.println(s+"파일");
					/*String s=file.length()/1024!=0?file.length()/1024+"KB":file.length()+"Bytes";
					System.out.print(file.length()+"bytes   ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();*/
				}
				/*else { // 디렉토리 (폴더)
					System.out.print(file.getName()+"   ");
					System.out.print("파일폴더   ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();
				}*/
			}
			
		}catch (Exception ex){}
	}

}
