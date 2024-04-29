// 사용자로부터 => 2개의 정수를 받아서 결과값 전송
import java.util.*;
public class 메소드_계산기 {
	static int add(int a, int b) {
		return a+b;
	}
	// 사용자 요청 => 매개변수
	// => 처리 처리 결과값 => 리턴형
	// 리턴형을 1개만 사용이 가능
	/*
	 *		데이터 첨부 => 매개변수
	 *	----| |----
	 *	|		  |
	 *	|	처리	  |=> {구현부}
	 *	|		  |
	 *	-------| |-
	 *			결과값 도출 => 리턴형
	 *
	 *	(e.g.)
	 *	과일 ==> 믹서기 ==> 즙
	 *	|
	 *	매개변수 	구현		결과값
	 *
	 *	GPT
	 *	사용자 입력 ==== 구글링 / 데이터 만들기 ===> 화면
	 *		|				|
	 *	매개변수				메소드(구현)		결과값
	 *------------------------------------------------------
	 *	1. 사용자가 보내주는 값? 어떤 값을 받을 지
	 *	2. 처리 방법 ==> {구현부}
	 *		=> 변수 / 연산자 / 제어문 ==> 명령문
	 *								----- 명령문의 집합
	 *
	 *	3. 어떤 결과값 도출 => 리턴형
	 *------------------------------------------------------
	 * ㄴ 소스를 구분 => 기능별 분리 => 알아보기 쉬움, 오류 시 메소드만 찾는다
	 * 							 필요시에 변경이 가능
	 * ㄴ 재사용이 가능 - 게임 다시 시작
	 * ㄴ 메소드는 호출시마다 처음부터 다시 구동
	 * ㄴ 결과값이 많은 경우
	 * 	 ------------- 정렬 => 배열
	 * 	=> 리턴형 => 배열, 정수, 실수, 문자열, 문자, 논리, 클래스
	 * 		int [] method()
	 * 		int method()
	 * 		double method()
	 * 		String method()
	 * 		char method()
	 * 		boolean method()
	 * 		Sawon method() ==> 아직 사용 전
	 * 	
	 * => 매개변수 => 배열, 정수, 실수, 문자열, 문자, 논리, 클래스
	 * 					----------------------- 기본형 데이터 
	 * => 리턴형 / 매개변수의 차이점 = 1개 / 여러개
	 * 			------ 갯수를 모르는 경우
	 */
	static int minus(int a, int b) {
		return a-b;
	}
	static int gop(int a, int b) {
		return a*b;
	}
	// 리턴형 => 고정이 된 건 아님
	static String div(int a, int b) { // 메세지 날릴 때 String
		String result="";
		if(b==0)
			result="0으로 나눌 수 없음";
		else
			result=String.valueOf(a/b);
		return result;
	}
	// 계산기
	static void process() {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/): ");
		char op=scan.next().charAt(0);
		System.out.println("두번째 정수 입력 : ");
		int num2=scan.nextInt();
		
		switch(op) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2,add(num1,num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2,minus(num1,num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2,gop(num1,num2));
			break;
		case '/':
			System.out.println(div(num1,num2));
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 연결만 한다
		// PrintStreem java.io.PrintStreem.printf(String format, Object. . . args)
		System.out.println();
		Object i=10; // Object 는 모든 데이터형을 받을 수 있는 거임
		i="";
		i='A';
		i=10.5;
		i=new Scanner(System.in);
		
	}

}
