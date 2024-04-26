/*	1. 중복없는 난수 => 응용
 * 	-------------------
 * 	숫자 야구 게임
 * 	-------------------
 * 	1) 난수 => 3개 발생 
 *	2) 사용자 입력
 *	3) 힌트
 *		같은 자리 => 스트라이크 => 1s
 *		다른 자리 => 볼
 * 
 */

/*	1. 묶음
 * 		변수 여러개를 묶어서 관리
 * 		변수 여러개 => 제어문 사용이 어렵다
 * 		-------- 평문을 사용한다
 * 		
 * 		난수 100개
 * 		int a1=(int)(Math.random()*100)+1;
 * 		
 * 
 */
import java.util.Scanner;
import java.util.*;
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 난수 발생 => 1~9 사이의 중복 없는 숫자 3개
		
	
		
		int [] com=new int[3];
		
		for(int i=0;i<=com.length;i++) { //3번 반복하라는 뜻
			com[i]=(int)(Math.random()*9)+1;
			// 중복 여부 확인
			for(int j=0;j<=i;j++) { // 생성된 난수만큼 비교
				if(com[i]==com[j]) {// 같은 수가 있는지 확인 => 비교연산 / 논리연산만
					i--; // 다시 난수 발생
					break; // j가 있는 for만 종료 ==> i++로 이동
				}
			}
		}
		System.out.println(Arrays.toString(com));
		

		//사용자가 입력한 데이터 저장
		int [] user=new int[3];
		
		// 2. 사용자 입력 요청
		while(true) {//반복 횟수가 없다 => 정답시에 종료 => 무한루프
			Scanner scan=new Scanner(System.in);
			System.out.println("세자리 정수 입력:");
			int input=scan.nextInt();
			// 오류 처리 => 세자리 정수가 입력이 안 된 경우
			
			if(input<100 || input>999) {
				System.out.println("알림 ☞ 세자리 정수만 입력");
				//while의 처음으로 이동
				continue;
				/*	continue
				 *	while => 조건식으로 이동
				 *	for => 증가식으로 이동
				 *
				 *	while(조건식){
				 *			  |			=> 처음으로 다시 시작
				 *	continue;_|
				 *	}
				 *
				 *	for(초기값;조건식;증가식){
				 *					|	=> 제외 
				 *	continue;_______|
				 *	}
				 * 
				 * 
				 *	break는 while / for 상관없이 반복문을 중단
				 *
				 */
			}
		
			// 세자리 정수를 입력한 경우
			user[0]=input/100;
			user[1]=(input%100/10);
			user[2]=input%10;
			
			//	오류 처리 => 2개
			//	1. 같은 수인 경우는 안 된다
			if( user[0]==user[1] || user[1]==user[2] || user[2]==user[3]){
				 System.out.println("알림 ☞ 중복된 수는 사용 불가 ");
				 continue;
			}
					
					
			// 	2. 0을 입력하면 안 된다
			if( user[0]==0 || user[1]==0 || user[2]==0){
				System.out.println("알림 ☞ 0은 사용 불가 ");
				 continue;	
			}
		
			//정상적으로 입력이 됐다면
			//힌트
			int s=0,b=0; //s는 숫자와 자리수가 맞는 경우, b는 숫자는 있고 자리수가 안 맞는 경우
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {// 같은 수가 존재하는지 확인
						if(i==j) // 같은 자리면
							s++;
						else	 // 다른 자리면
							b++;
					}
				}
			}
			//힌트 제공
			System.out.printf("input Number: %d, Result:%dS-%dB\n",input,s,b);
			
			
			// 4. 정답 여부 확인 => 정답이면 종료(break) / 오답이면 => 다시 입력이 가능(continue)
			// 종료 여부
			if(s==3) {
				System.out.println("Game Over");
				break;
			}
		
		}

	}

}
