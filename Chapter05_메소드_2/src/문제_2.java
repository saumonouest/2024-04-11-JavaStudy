// 1~10까지의 합을 구하는 메소드를 구현
// 리턴형 (O) 매개변수(X)

public class 문제_2 {
	static int munje2(){
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum; // 값 = 리턴형에 사용되는 데이터형이 동일 해야 함
		// 특별한 경우에는 return 값이 작을 수 있다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		munje2();
	}
}
