/*	while문
 *	반복문 => 반복 횟수가 지정이 안 된 경우 주로 사용
 *	형식) 
 *		초기값----------- 1 
 *		while(조건문){
 *			반복 수행문장-- 2
 *			증가식------- 3  => 조건문에 대입 
 *		}
 *
 */
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) { // 반드시 종료하는 프로그램을 제작 => break;
			System.out.println("=====메뉴=====");
			System.out.println("1. 음악 목록");
			System.out.println("2. 음악 검색(곡명)");
			System.out.println("3. 음악 검색(가수명");
			System.out.println("4. 음악 보기");
			System.out.println("9. 프로그램 종료");
			System.out.println("=============");
			System.out.println("메뉴선택:");
			int menu=scan.nextInt();
			
			/*switch / 다중 조건문
			if(menu==1) {
				System.out.println("음악 전체 목록");
			}
			else if(menu==2) {
				System.out.println("곡명으로 검색");
			}
			else if(menu==3) {
				System.out.println("가수명으로 검색");
			}
			else if(menu==4) {
				System.out.println("동영상 요청");
			}
			else if(menu==9) {
				System.out.println("프로그램 종료");
				//while을 종료한다 : 
				break;
			 		break => 반복문을 종료(중단)
				  	continue => 조건식으로 이동 => 처음부터 실행할 때 사용
				  
	
			}
			else {
				System.out.println("메뉴가 존재하지 않습니다.");
			}
			*/
			switch(menu) {
			case 1: 
				System.out.println("음악 전체 목록");
				break;
			case 2: 
				System.out.println("곡명으로 검색");
				break;
			case 3: 
				System.out.println("가수명으로 검색");
				break;
			case 4: 
				System.out.println("동영상 요청");
				break;
			case 9: 
				System.out.println("프로그램 종료");
				System.exit(0);
				//프로그램 종료 시 사용
				//break => switch가 벗어난다 => while문은 계속 수행
			default:
				System.out.println("메뉴가 존재하지 않습니다.");
			}
		}
	}

}
