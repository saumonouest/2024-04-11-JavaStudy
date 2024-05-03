/*	static 메소드
 * 	-----------
 * 	=> static 변수만 사용이 가능
 * 	=> 멤버변수를 사용하려면 => 객체 생성(new를 이용)
 *  
 *  멤버 메소드*****
 *  => static 변수, 멤버변수를 사용할 수 있다
 */
public class 멤버변수_활용_3 {
	int a=10;
	static int b=10; // 카드놀이 => width/height가 안 맞는 경우가 있음 => 한번에 동시에 변경
	// 공통으로 사용되는 메소드 
	static void display() {
		멤버변수_활용_3 ss=new 멤버변수_활용_3();
		System.out.println("a="+ss.a);
		// 사용하려면 다른 데서 선언한 거 가져오면 됨!
	}
	// 클래스 멤버 메소드
	void print() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
