/*
 * 6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
 *  60점 이하면 F를 출력하라 (다중조건문 사용)
 *
 * 
 * 
 */

import java.util.Scanner;
public class 제어문_문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int score=scan.nextInt();
		if(score>=90 && score<=100)
		{
			System.out.println("A 학점입니다");
		}
		else if(score>=80 && score<90)
		{
			System.out.println("B 학점입니다");
		}
		else if(score>=70 && score<80)
		{
			System.out.println("C 학점입니다");
		}
		else if(score>=60 && score<70)
		{
			System.out.println("D 학점입니다");
		}
		else if(score<60)
		{
			System.out.println("F 학점입니다");
		}
				
		
	}

}

