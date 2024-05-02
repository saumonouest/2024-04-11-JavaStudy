// 매개변수의 전송
// 메소드 안의 변수는 메소드가 종료가 되면 자동으로 사라짐 => 다른 메소드로 값을 전송
import java.util.Arrays;
import java.util.Scanner;
/*	메소드의 연결
 * 	---------
 *  숫자 야구 게임 => 분리
 *  1. 세 개의 중복 없는 난수 발생 
 *  2. 사용자로부터 세 개의 정수 입력
 *  3. 난수와 사용자 입력값 비교 
 *  4. 힌트 제공
 *  5. 종료 여부 확인 => 다시 게임 시작?
 * 
 */
public class 메소드정리_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차적 언어 => 다시 게임을 할 지 물어보는 거 불가능 => 재사용이 안 됨
		int [] com = new int [3];
		for (int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1; // 1~9
			//중복 체크 
			for(int j=0;j<i;j++) {
				if(com[i]==com[j])
					i--; // 값 같으면 다시 발생 해라(턴 넘기지말고 원래 턴으로 원상 복구해)
					break;
			}
		}
		//System.out.println(Arrays.toString(com));
		
		// 사용자 입력 => 정답 입력이 되는 상태까지 => while
		// 사용자 입력값 저장
		int [] user = new int [3];
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("세자리 정수 입력: ");
			int input=scan.nextInt();
			
			//오류 처리
			if(input<100 || input>999) { // 세자리 정수가 아닐 때, 범위 벗어날 때 보통 || 씀
				System.out.println("세자리 정수만 입력 가능");
				
				// 처음 상태로 돌아간다
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류처리
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 수는 사용 불가능");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용 불가능");
				continue;
			}
			
			// 비교
			int s=0, b=0;
			for(int i=0;i<com.length; i++) {
				for(int j=0;j<user.length;j++) {
					// i=0 -> j=0,1,2
					// i=1 -> j=0,1,2
					// i=2 -> j=0,1,2
					if(com[i]==user[j]) { // 같은 수가 있는지 확인
						if (i==j)  // 같은 자리
							s++;
						else // 다른 자리
							b++;
						}
					}
				}
			
		// 힌트
					System.out.printf("Input Number: %d, Result: %dS-%dB\n",input,s,b);
					
					// 종료 여부 확인
					if(s==3) {
						System.out.println("게임 종료");
						break;
					}
		}
	
	}

}
