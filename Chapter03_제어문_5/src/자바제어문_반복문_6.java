// 사용자로부터 2~9 사이의 정수를 입력 받아서 구구단 출력
// 단 입력이 2~9가 아닐 경우에는 다시 입력 요청 
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int dan=0; // 블록변수 => {}을 벗어나면 자동으로 삭제
		// 프로그램에 필요한 데이터를 사용자로부터 받아서 오류 체크
		/*
		 *	for(int i=0;i<=10;i++){
		 *	int j=10
		 *	}
		 *	for 종료시까지만 i,j 사용 가능
		 *	for문에서 변수 설정된 거라서 for문 안에서만 사용이 가능하다는 거
		 *	밖으로 벗어나면 오류남
		 *
		 */
			for(;;) {
				System.out.print("2~9사이 정수 입력:");
				dan=scan.nextInt();
				if(dan<2 || dan>9) {
					System.out.println("잘못된 입력");
					continue; //for의 처음으로 돌아가게 함
				}
				break; // for 종료 : 정상 입력을 했을 경우
				
		}
			System.out.println("단="+dan);
			System.out.println("====="+dan+"=====");
			for(int i=1;i<=9;i++)
			System.out.printf("%d * %d = %d\n", dan,i,dan*1);
	}

}
