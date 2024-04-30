/*	3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
 *	년도 입력 메소드
 *	윤년 처리 
 *	출력 
 *
 * 
 */
import java.util.*;
import java.util.Scanner;
public class 문제_06 {
	
	//년도 입력 메소드
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int a=scan.nextInt();
		return a; //입력 받은 값을 돌려준다
	}
	
	//윤년처리
	static void isYear(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.println(year+"년도는 윤년이다"); 
		else
			System.out.println(year+"년도는 윤년이 아니다");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=input();
		isYear(year);
		/*
		 * 
		 * Scanner scan=new Scanner(System.in); // System.in : 키보드 입력값, System.out //
		 * System.in 모든 문자를 정수형으로 가져옴 // 스캐너 클래스 : 키보드 입력받아 메모리에 저장
		 * System.out.println("년도 입력:"); int year=scan.nextInt();
		 * 
		 * // 입력부분 if((year%4==0 && year%100!=0) || (year%400==0);
		 * System.out.println(year+"년도는 윤년이다"); else
		 * System.out.println(year+"년도는 윤년이 아니다");
		 */
	}

}
