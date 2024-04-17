/*
 *	1. 형식 ==> 어떤 곳에서 사용?
 *	2. 흐름 파악 => 동작 순서
 *	3. 응용
 *	-----------------------
 *	1) 제어문 : 프로그램 제어				  --------반복문(중단, 다시 시작 가능)
 *			----------- 요청된 내용만 출력, 반복 수행, 선택된 내용만 출력
 *						ㄴ필요시에 건너뛸 수도 있다(if) ㄴ선택문
 *	=> 조건문 : 오류처리, 건너뛴다. . . 사용자 요청에 맞는 내용만 출력
 *		= 단일 조건문 : 독립적인 문장 (조건에 맞는 모든 문장을 수행)
 *			if(조건문)
 *			{
 *				true에 수행이 되는 영역 => false면 건너뛴다
 *			}
 *		= 선택 조건문 : true / false 를 나눠서 처리 ==> 56page
 *			if(조건문)
 *			{
 *				true일 때 처리되는 문장
 *			}
 *			else
 *			{
 *				false일 때 처리되는 문장
 *			}
 *		
 *
 *		= 다중 조건문 : 여러개의 조건 중에 한 개만 출력
 *		  형식)
 *			if(조건문)
 *			{
 *				조건문 => true 문장 수행 => 종료
 *					false
 *			}		  ↓
 *			else if(조건문)
 *			{
 *				조건문 => true 문장 수행 => 종료
 *					false
 *			}		  ↓
 *			else
 *			{ 
 *				해당 조건이 없는 경우에 수행 문장 => 필요시에만 처리 (생략이 가능)
 			}
 *			--------------------------
 *			if ~ else => 단일 조건문 => 다중 조건문
 *										↓
 *									   게임 => 키 선택
 *									   메뉴 ==> 대체 switch ~ case 
 *			------------------------------------------------------
 *			Dart 언어 구글 => Flutter
 *			
 */
// 성적 계산 ==> 다중 조건문 => 자주 풀어보기~
import java.util.Scanner;
public class 제어문_조건문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		// 클래스를 메모리에 저장할 때 => new
		// System.in => 키보드 입력값
		System.out.print("국어점수:");
		int kor=scan.nextInt(); //정수값
		System.out.print("영어점수:");
		int eng=scan.nextInt();
		System.out.print("수학점수:");
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		// 요청 => 학점 => 다중 조건문 
		char score='A';
		int avg=(kor+eng+math)/3;
		// avg = 90 => D
		if(avg>=90)
		{
			score='A'; //종료
		}
		else if(avg>=80)
		{
			score='B'; //종료
		}
		else if(avg>=70)
		{
			score='C'; //종료
		}
		else if(avg>=60)
		{
			score='D'; //종료
		}
		else if(avg<60)
		{
			score='F'; //해당 조건이 없는 경우에 수행 문장
		}
		System.out.println("학점="+score);
	}

}
