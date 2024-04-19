/*
 * 1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문
 */
import java.util.Scanner;
public class 자바정리_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		int x=scan.nextInt();
		if(x>10 && x<20) {
			System.out.println("true");			
		}
		else
		{
			System.out.println("false");
		}
	}

}
