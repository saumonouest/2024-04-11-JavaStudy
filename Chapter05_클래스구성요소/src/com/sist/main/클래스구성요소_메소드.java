package com.sist.main;
/*	메소드
 * 		=> 문장 => 단락
 * 		=> 기능별 분리 => 오류 처리
 * 		   --------
 * 			1. 재사용
 * 			2. 수정이 용이
 * 			3. 추가 가능
 * 			4. 유지보수
 * 			5. 분업
 * 		
 * 		=> 역할 : 다른 클래스와 연결해서 사용
 * 			사람 클래스 ========= 자판기 클래스
 * 					동전 투입 => 음료수 선택
 * 							   음료수 뽑기
 * 								잔돈을 돌려준다 => 동작
 * 	
 * 			객체지향 프로그램 = 여러개의 클래스를 만들어서 상호 연결해서 사용
 * 	
 * 	
 * 		=> 사이트 분석
 * 		   --------
 * 			1. 데이터 확인
 * 			2. 기능 확인  ===> 데이터 추출
 * 			
 * 		예)
 * 			중복없는 난수 3개 발생 int [] com
 * 			사용자 입력		  int [] user 
 * 			입력값 난수 비교	  com / user 
 * 			힌트 				  com / user / s / b
 * 			종료여부 확인		  s==3
 * 
 * 		예)
 * 			년도/월 입력 year / month
 * 			요일 구하기 => 윤년 처리 => year / month / week
 * 			달력출력 => year / month / week
 * 			
 */
import java.util.*;

// public => 한 개의 파일에서는 public은 한 개만 사용이 가능
class Diary{
	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		return scan.nextInt();
	}
	// 요일 구하기
	public int getWeek(int year, int month) {
		Calendar cal=Calendar.getInstance(); // 객체 생성 방법 => 추상 클래스는 new를 사용해서 객체 생성이 불가능
		// 추상 클래스 : 미완성된 클래스 => 객체는 new를 사용하지 않아도 객체 생성이 가능
		// Spring => new 를 사용하지 않고 객체 사용이 가능 => 리플렉션
		// => 디자인 패턴 / 알고리즘 / 자료 구조 . . . 
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		// 상수 => static final => 모든 프로그램에서 공유 => 클래스명.상수명
		// 상수형 => final => 클래스 내에서 사용 => 객체명.상수
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		// month=0, week=1
		return week-1;
	}
	public int getLastDay(int year,int month){
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		
		int lastday=cal.getActualMaximum(Calendar.DATE);
		return lastday;
	}
	// 달력 출력 => 전역변수 없이 => 전역변수(멤버변수)
	public void print(int year, int month, int week, int lastday) {
		System.out.println(year+" 년도 "+month+"월 ");
		String []strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday;i++) {
			if(i==1) {
				// 공백
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			/*if(week==0 || week==6)
				System.err.printf("%2d\t",i);
				else*/
				System.out.printf("%2d\t",i);
			
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}
	public void process() {
		int year=input("년도");
		int month=input("월");
		int week=getWeek(year,month);
		int lastday=getLastDay(year,month);
		print(year,month,week,lastday);
	}
}

// public이 있는 클래스가 저장명이 된다 => 자바는 파일명=클래스명이 동일
public class 클래스구성요소_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diary d=new Diary(); // input => 저장
		Scanner scan=new Scanner(System.in);
		while(true) {
			d.process();
			System.out.println("\n종료할까요?(y/n):");
			char end=scan.next().charAt(0);
			if(end=='y' || end=='Y');
				System.out.println("프로그램 종료");
				System.exit(end);
		}
		/*int year=d.input("년도");
		int month=d.input("월");
		System.err.println(year+"년도 "+month+"월");*/
	}

}
