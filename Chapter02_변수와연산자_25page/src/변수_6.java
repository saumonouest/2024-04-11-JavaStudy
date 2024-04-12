
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte_value=10; //바이트는 구분이 없다, -128 ~ 127 사이 정수만 넣으면 문제 없삼. . .
		//byteVlaue > 단어가 두 개 붙으면 언더바 하든가 아니면 뒤에 거에 대문자 하면 됨
		
		int intValue=20; //컴퓨터에서는 모든 숫자를 int로 인식함, 21억 4천 안 넘으면 됨
		// 4byte
		
		long longValue=30L; // 구분 > 숫자 뒤에 L,l
		// 8byte
		
		float floatValue=10.5F; // 4byte > 소수점 6자리까지 계산
		
		double doubleValue=10.5F; //10.5D, 10.5d > D,d는 생략 가능
		// 실수의 디폴트 값
		// 정수 > int, 실수 > double
		// 실제 프로그램에서는 int, double가 가장 많이 사용된다
		// 변수 = 계속 상태가 변경 . . . / 상태가 고정 = 상수
		
		boolean booleanValue=true;
		// ㄴ조건식 1byte > 저장은 true/false만 저장 가능
		
		char charValue='A';
		// 문자 1개 저장 공간 > 2byte
		
		/* byte = char = int = long = double 
		 * boolean
		 * 여기 여섯개만 잘 기억하면 됨~
		 * 조만간 char보다는 String을 더 쓰게 될 거임
		 * 
		 */
		char c1='된';
		char c2='장';
		char c3='국';
		char c4=' ';
		char c5='끓';
		char c6='이';
		char c7='는';
		char c8=' ';
		char c9='법';
		
		System.out.println(c1+""+c2+c3+c4+c5+c6+c7+c8+c9);
		String s="된장국 끓이는 법";
		System.out.println(s);
		
	}

}
