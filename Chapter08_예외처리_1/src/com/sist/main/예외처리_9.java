package com.sist.main;
/*	1. 반복문장이 많다 => 제거
 * 	   ----------- 메소드			------------- 구조적인 프로그램 => 에러, 수정
 * 		재사용, 다른 클래스에서 연결 => 한가지 기능만 수행  
 * 		-------------------- 메소드
 *
 *	2. 관련된 클래스 여러개 => 한 개의 객체명으로 처리
 *	   -------------- 인터페이스
 *
 *	3. 비정상 종료 없이 프로그램 유지 => 예외처리
 *	------------------------------------------------------------------
 * 	=> 변수 =>  사이트
 * 	=> 누가 잘 묶어서 사용
 * 	   --------------
 * 		변수 => 배열 / 클래스
 * 		명령문(연산자, 제어문) => 메소드
 * 		필요시에 변수 초기화 => 생성자
 * 		=> 클래스 여러개 => 인터페이스
 * 		=> 에러처리 => 예외처리
 * 	=> 윈도우 => 상속 => 오버라이딩(인터페이스)
 *  => 모바일, 웹, App => 동일
 *     -------------------- JSON
 *     						JavaScript Object Nontation
 *     						자바스크립트 객체 표현법
 * 	------------------------------------------------------------------- => 자바의 기본 문법
 * 	=> 라이브러리 + 사용자 클래스 
 * 	   ------------------- 조립 (응용)
 * 	
 * 	예외처리
 * 	=> 1. 파일 입축력
 * 	   2. 네트워크
 * 	   3. 오라클 연동
 * 		  ---- 데이터를 모아두는 장소(영구적인 저장장치)
 * 		  ---- 파일의 단점: 여러개 연결해서 사용할 수 없다
 * 		  ---- 여러개를 연결이 가능하다 (RDBMS)
 * 		-----------------------------------------------  반드시 에러처리
 * 
 * 	1. 생략이 가능
 * 		= import java.lang.*;
 * 		= void => return
 * 		= 생성자 생략
 * 		= extends Object 
 * 		= 실행시 파일 => 예외처리 생략이 가능
 * 		-----------------------------
 * 		= interface 
 * 			=> 상수
 * 			=> 추상 메소드
 * 			=> default
 * 			=> static
 * 		
 * 			interface A {
 * 				(public static final) int a=10;
 * 				=> (public) static final int A=100;
 * 
 * 				(public abstract) void display();
 * \			=> public (abstract) void display();
 * 
 * 				(public) default void aaa(){}
 * 			}
 * 			=> interface는 접근지정어 => public만 사용이 가능
 *                                                                                                                              
 */
interface ABC {
	private int AA=100;
}
public class 예외처리_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
