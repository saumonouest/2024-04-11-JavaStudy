//2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
// 매개변수 x, 리턴형 o

public class 문제_03 {
	// void gugudan()
	static int gugudan(int n) {
		for(int i=1;i<n;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d",i,j,i*j);
			}
		}return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
