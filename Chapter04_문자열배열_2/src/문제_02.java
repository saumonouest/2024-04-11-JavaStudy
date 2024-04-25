/* 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. 
 * (실적 0~100)
 * 1) 사번별 실적을 출력하시오.
 * 사원(1) 50..
 * 2) 1월 실적의 총점과 평균을 출력하시오.
 * 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */
public class 문제_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int[]score = {50,45,35,12,70};
		System.out.println();
		int sum=0;
		double avg=sum/(double)5.0;
		int max=score[0];
		int min=score[0]; // 배열 중에 하나를 준다는 거임, 전처럼 max=0, min=100 안 해도 됨
		
		for(int num=0;num<score.length;num++) {
			System.out.println((num+1)+"번 사원: "+score[num]+"점");
			
			if(max<score[num])
				max=score[num];
			
			if(min>score[num])
				min=score[num];
		}
		for(int num:score) {
			sum+=num;
			avg=sum/(double)5.0;
		}
		
		System.out.println("sum="+sum+"점");
		System.out.printf("평균:%.2f\n",avg);
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
