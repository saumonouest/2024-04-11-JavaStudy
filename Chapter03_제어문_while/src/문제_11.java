/*	11.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
 * 
 */
import java.util.Scanner;
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int score=0;
		while(true) {
			System.out.println("정수 입력:");
			score=scan.nextInt();
			if(score<0 || score>100) {
			System.out.println("잘못된 입력");
			continue;
		}
			//정상 수행
			break;
		}
		if(score>60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		}
	}


