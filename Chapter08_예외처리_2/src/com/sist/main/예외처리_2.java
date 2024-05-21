package com.sist.main;
import java.io.IOException;
/* throw : 임의로 에러 발생
 * 			형식) 
 * 			throw new 예외클래스() => catch 로 이동
 * 			=> 코딩이 불가능 
 * 			catch는 예외처리 크기에 따라 순서가 존재 => 상속도
 * 			throws 문장 예외처리 순서가 없다 => ,
 * 
 */
import java.util.*;
public class 예외처리_2 {
	public void disp() throws Exception { // Exception이 제일 큰 거라 이 뒤에 다른 거는 굳이 쓸 필요는 없음
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("양수 입력:");
		int no=scan.nextInt();
		try {
			if(no<0) {
				// 견고한 프로그램 => 에러 발생기에 처리가 되고 있는지 => 테스트
				// 애플리케이션 테스트
				throw new IllegalArgumentException("음수 사용 불가"); // catch로 이동
				// 예외를 던진다 => 직접 예외의 catch를 호출이 가능
				//System.out.println("음수 사용 불가");
			}
			System.out.println("no="+no);
		}/*catch(IllegalArgumentException e) {//입력값이 잘못된 경우
		  *	System.out.println(e.getMessage());
		} */catch(Exception e) {
			System.out.println(e.getMessage());
		}
		// 반드시 실행되는 문장이 있는 경우
		System.out.println("종료");
	}
}
