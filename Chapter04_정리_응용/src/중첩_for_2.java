/*	구구단
 *
 */
public class 중첩_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) { // 줄 수
			for(int j=2;j<=9;j++) { // 출력 몇 개
				// 구구단 출력
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			// 다음줄 출력
			System.out.println();
		}
	}

}
