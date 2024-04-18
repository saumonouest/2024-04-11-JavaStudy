/*
 * 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
 * 프로그램을 만들어라 (switch~case 사용) 
 * 반복문8이랑 똑같음
 */
import java.util.Scanner;
public class 제어문_문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("연산자 입력(+, -, *, /):");
		char op=scan.next().charAt(0);
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		switch(op)
		{
		case '+' :
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-' :
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*' :
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/' :
			{
				if(num2==0)
				{
					System.out.println("0으로 나눌 수 없음");
				}
				else if(num2!=0);
				{
					System.out.println(num1+"/"+num2+"="+(num1/num2));
				}
			}
			break;
			
		
		}
		
	}

}
