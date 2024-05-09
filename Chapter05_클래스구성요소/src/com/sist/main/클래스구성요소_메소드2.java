package com.sist.main;
import java.util.*;

class Diary2{
	private int yeat;
	private int month;
	private int week;
	private int lastday;
	
	// private => Diary2 클래스 안에서는 사용이 가능, 다른 클래스에서 불가능 => 다른 클래스에서 사용한다면 getter/setter 
	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		return scan.nextInt();
	}
	// 요일 구하기
	public int getWeek(int year, int month) {
		Calendar cal=Calendar.getInstance(); 
		 
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
	
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		return week-1;
	}
	public int getLastDay(int year,int month){
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		
		
		return lastday;
	}
	
 
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

public class 클래스구성요소_메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
