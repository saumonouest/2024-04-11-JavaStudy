/*	달력
 * 	---
 * 	1. 절차적 언어
 * 	2. 메소드 ==> 구조적 프로그램
 * 				ㄴ 클래스 => 객체지향 프로그램
 *
 *	최소한 3개
 *	입력 부분 > 메소드
 *	--------------
 *	처리 부분 > 메소드 : 세분화
 *	출력 부분 > 메소드 
 */
import java.util.*;
public class 메소드_7 {
	// 입력 부분 => 반복 제거
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		return scan.nextInt();
	}
	
	// 처리
	static int getWeek(int year, int month) {
		int total=(year-1)*365 +(year-1)/4 -(year-1)/100 +(year-1)/400;
		
		// 2. 전달까지의 총 날 수
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 윤년 => 2월 => 29일
		if(isYear(year))//((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else 
			lastday[1]=28;
		
		for(int i=0;i<(month-1);i++) {
			total+=lastday[i];
			//return week;
		}
		
		// 3. +1(1일자의 요일 확인)
		total++;
		
		// 4. 요일 구하기 => 총 날 수 % 7
		int week=total%7;
		return week;
	}
	static boolean isYear(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0))
			return true;
		else
			return false;
	}
	
	// 츨력
	static void print(int year, int month, int week) {
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(year+"년도 "+month+"월");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(String w:strWeek)
			System.out.print(w+"\t");
		System.out.println();
		
		// 실제 달력을 출력
		for(int i=1;i<=lastday[month-1];i++) {
			// 1. 공백 출력 => 처음 한 번만 출력
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t"); // ln 빼기~
				}
			}
			System.out.printf("%2d\t",i);
			// 일요일이면 다음줄 출력
			// 요일 확인
			week++;
			if(week>6) {
				System.out.println();// 다음줄 출력
				week=0;
			}
			
		}
	}
	static void process() {
		int year=input("년도");
		int month=input("월");
		
		int week=getWeek(year, month);
		print(year, month, week);
	}
	
	public static void main(String[] args) {
		process();
		// TODO Auto-generated method stub
		/*
		// 입력 부분
		Scanner scan=new Scanner(System.in);
		//1. 년도 입력 
		System.out.println("년도 입력: ");
		int year=scan.nextInt();
		
		//2. 월 입력
		System.out.println("월 입력: ");
		int month=scan.nextInt(); // 반복 제거
		
		// 처리 부분 => 요일
		// 1. 전년도까지의 총 날 수
		// 4년마다 / 100년마다 제외 / 400년마다 
		int total=(year-1)*365 +(year-1)/4 -(year-1)/100 +(year-1)/400;
		
		// 2. 전달까지의 총 날 수
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 윤년 => 2월 => 29일
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else 
			lastday[1]=28;
		
		for(int i=0;i<(month-1);i++) {
			total+=lastday[i];
		}
		
		// 3. +1(1일자의 요일 확인)
		total++;
		
		// 4. 요일 구하기 => 총 날 수 % 7
		int week=total%7;
		
		// 출력 부분
		System.out.println(year+"년도 "+month+"월");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(String w:strWeek)
			System.out.print(w+"\t");
			System.out.println();
		
		// 실제 달력을 출력
		for(int i=1;i<=lastday[month-1];i++) {
			// 1. 공백 출력 => 처음 한 번만 출력
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.println("\t");
				}
			}
			System.out.printf("%2d\t",i);
			// 일요일이면 다음줄 출력
			// 요일 확인
			week++;
			if(week>6) {
				System.out.println();// 다음줄 출력
				week=0;
			}
			
		}*/
	}

	private static void process(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
