/*
 * 8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
 */
public class 자바정리_문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0;
		for(int i=3;i<=4462;i++) {
			if(i%2==0) {
				sum1+=i;
			}
			else {
				sum2+=i;
			}
		}
		System.out.println("짝수 합="+sum1);
		System.out.println("홀수 합="+sum2);
	}

}
