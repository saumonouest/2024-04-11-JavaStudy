/*
 *	if ~ else
 *	=> if 정상 수행 문장
 *	=> else 오류, 잘못된 입력일 경우
 */
//	사칙연산 => 연산자를 잘못 입력한 경우 . . . 처리
import java.util.Scanner;
public class 제어문_조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char op=' ';
		System.out.println("첫번째 정수 입력:");
		num1=scan.nextInt();
		System.out.println("연산자 입력(+, -, *, /):");
		op=scan.next().charAt(0); // 문자 1개 받는 경우
		System.out.println("두번째 정수 입력:");
		num2=scan.nextInt();
		
		if(op=='+'||op=='-'||op=='*'||op=='/')
		{
			// 정상 수행
			if(op=='+')
				System.out.printf("%d + %d = %d\n", num1,num2,num1+num2); 
			//"%d + %d = %d\n" 이 패턴은 사용하면 무조건 printf 써야함 아니면 오류난당, printf는 출력형식을 만들어놓고 쓸 때 쓰는 거임
			if(op=='-')
				System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
			if(op=='*')
				System.out.printf("%d * %d = %d\n", num1,num2,num1*num2);
			if(op=='/')
			{
				if(num2==0)
					System.out.println("0으로 나눌 수 없다.");
				else
					System.out.printf("%d / %d = %.2f\n", num1,num2,num1/(double)num2);
					// 정수가 들어올 때는 %d를 쓰는데 실수가 들어올 때는 %f가 들어가야 됨~ 자꾸 까먹음~
			}
		}
		else
		{
			// 연산자가 없는 경우
			System.out.println("잘못된 연산자입니다.");
		}
		/*
		 *  %d => 정수
		 *  %f => 실수 => %.2f %.1f < 소수점 자리
		 *  %c => 문자
		 *  %s => 문자열
		 *  서식이 있는 출력 => 명령프롬프트에 출력할 때만 사용함 => 문법상
		 *  ------------ HTML => CSS 
		 *  출력 형식을 만들어서 출력을 요청 ==> printf()
		 *  println은 소수점 아래를 못 지우고 출력하게 됨 / 형식이 없을 때 쓰는 문장이기 때문임
		 */
	}

}
