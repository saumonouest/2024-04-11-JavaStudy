import java.util.Arrays;

public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 생성 => score[0] score[1] score[2]
		int [] score = {100,90,85}; // 값이 지정되면 사용{}, 값 설정이 없는 경우 new
		
		
		// 출력 : 보통 for-each 씀
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
			System.out.println((i+1)+"번학생:"+score[i]+"점");
		}
		//총점
		System.out.println("총점="+sum);
	}
}
