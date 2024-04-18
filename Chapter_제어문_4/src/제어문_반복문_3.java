// 1 ~ 100까지의 합 ==> 반복횟수 ==> 100
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; // 합 누적 => 초기값 0
		for(int i=1;i<=100;i++) //i++ 을 i+=2로 하고 시작을 1로 하면 홀수만 더한 값이 나옴, i=2로 바꾸고 i+=2로 하면 짝수만 더한 값이 나옴
		{
			sum=sum+i; //누적 연산자
			System.out.println("i="+i+",sum="+sum);
		}
		System.out.println("1~100까지의 합:"+sum);

	}

}
