/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class 자바정리_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("시작:");
		System.out.println("끝:");
		int start=scan.nextInt();
		int end=scan.nextInt();
		int gop=1;
		for(int i=start;i<=end;i++) {
			gop*=i; //처리부분
			}
		System.out.println("결과값:"+gop);
		}
		
		

	}


