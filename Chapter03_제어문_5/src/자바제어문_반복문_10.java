// 1~100까지의 합을 구해서 출력
public class 자바제어문_반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; // for 문 안에 있으면 계속 초기화 됨, 밖에 있어야 누적이 됨
		for(int i=1;i<=100;i++) {
			sum+=i;
			System.out.println("i="+i+",sum="+sum);
		}
		System.out.println("1~100 사이의 정수 합:"+sum);
	}

}

