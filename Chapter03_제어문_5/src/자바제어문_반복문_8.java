
public class 자바제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 => 범위 지정 => {} => scope => 사용범위 => 결과값 추출이 가능
		for(int i=1;i<=5;i++) {
			char c='A';
			System.out.println(c+" ");
			c++; 
			// c 변수는 여기까지만 사용이 가능
		} // c 변수는 사라진다
	}

}
