/*
 *	국어 영어 수학 점수를 입력받아서 
 *	총점, 평균
 *	학점 =>  100~90 : A => +, 0, -
 *			89~80 : B
 *			79~70 : C
 *			69~60 : D
 *			나머지 : F
 */

import java.util.Scanner;

public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력값
		Scanner scan=new Scanner(System.in);
		
		// 필요한 변수 선언 
		int kor,eng,math;
		char score='A';
		
		// 입력값을 받아서 초기화
		System.out.println("국어 점수 입력 :");
		kor=scan.nextInt();
		
		System.out.println("영어 점수 입력 :");
		eng=scan.nextInt();
		
		System.out.println("수학 점수 입력 :");
		math=scan.nextInt();
		
		//학점 계산
		int avg=(kor+eng+math)/3;
		if(avg>=90 && avg<=100)
		{
			score='A';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}
		
		
		//출력
		System.out.println("=====결과값=====");
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균:%.2f\n",+(kor+eng+math)/3.0);
		
		// => \n = new line 줄 바꾸기 = println
		// => \t = tab = 일정 간격을 두는
		System.out.println("학점:"+score+"학점");
		
	}

}
