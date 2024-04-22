/*	for => updown
 * 	1. 난수 => 난수를 맞추는 프로그램
 * 	   --- 힌트 : UP/DOWN
 * 	   ---------------------- 반복 횟수가 명확하지 않다 => while 
 * 		=> 종료 : break;
 * 		=> 잘못 입력 시 : continue;
 * 	   --------------------------- 반복 제어문
 */
import java.util.Scanner; 
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//1. 난수 발생
		int com=(int)(Math.random()*100)+1;
		while(true) { //무한루프
			System.out.print("1~100 사이의 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력값"); // while 처음으로 이동
			continue; // while문 처음으로 이동하게 하는 거
			}
			
			//힌트
			if(com>user) {
				System.out.println("UP");
			}
			else if(com<user){
				System.out.println("DOWN");
			}
			else { //com=user
				System.out.println("정답"); // 종료
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
