/*	알파벳 입력을 받아서
 * 		=> 대문자 : 소문자
 * 		=> 소문자 : 대문자 출력
 * 	=> 결과값 출력 위치
 * 		=> for에서 출력 : for 안에서 변수 설정 
 * 		=> or for 종료 후 출력 : for 위에 설정
 *	=> 변수 유지하는 범위 : {} => 블록변수, 지역변수 --- 반드시 사용 전에 초기화 
 *	=> 멤버변수, 공유변수, 지역변수
 *	   ------------- 초기화가 되어있다
 *
 *	Class A{
 *	int a; =>0 ---멤버변수
 *	static int b; =>0 ---공유변수
 *	public static void main(String[] arg){
 *	int c=0; ---지역변수 
 *	}
 *
 */
import java.util.Scanner;
public class 자바제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=5;i++) {
		System.out.println("알파벳을 입력:");
		char c=scan.next().charAt(0); // 5번의 메모리가 만들어진다 (메모리할당)
		// for 한바퀴 돌때마다 사라지고 다시 만들어진다
		System.out.println("입력된 알파벳:"+c);
		System.out.println("대소문자 변환");
		if(c>='A' && c<='Z') {
			System.out.println("소문자로 변경:"+(char)(c+32));
		}
		else if(c>='a' && c<='z') {
			System.out.println("대문자로 변경:"+(char)(c-32));
		}
		else {
			System.out.println("알파벳이 아닙니다");
		}
		}
		// c 변수는 사용이 가능 => for문 안에 있는 경우에는 밖에서 사용 불가
	}

}
