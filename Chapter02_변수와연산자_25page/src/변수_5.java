/*
 * btye. char, int, long, float, double
 * 기타 : boolean
 * 
 * 	1. 데이터의 크기 
 * 	  byte < char < int < long < float < double
 * 	  =크기 기준 : 수 표현의 갯수
 * 	  e.g. 1 => 1.000000 -실수형이 정수형보다 크다~ 라는 거임~
 * 	  
 * 	  int a=10L - 이거 불가능한
 *    ---	---
 * 크기 4 	 8
 * 
 * 	  long a=10; - 이건 가능
 *	  ----	 --
 * 크기 8 	 4
 * 
 * 	  int a='A' - 이것도 가능~
 * 
 * 	byte + byte = int
 *  char + char = int 
 * 
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 형변환 언제든 쌉가능~ , 강제 형변환((int)'A') < 실수로 바꿔라! 하면 double로 하면 됨! 
		// 형변환은 작은 거에서 큰 것도, 큰 거에서 작은 것도 가능함! 다운캐스팅, 업캐스팅이라고 한다함~
		int a='A'; //char > int 
		System.out.println(a);
		char c=65; //int > char
		System.out.println(c); //65는 A 나타내는 숫자라서 캐릭터에 넣으니까 A로 나온 거임 캐릭터는 문자로 나타내는 거니까
		double d='A'; //char > double
		System.out.println(d);
		byte b1=10;
		byte b2=110;
		//byte b3=b1+b2; < 이거는 에러 뜸 왜냐면 바이트 더하기 바이트는 int이기 때문임 캐릭터도 두 개 더 하면 int임 
		//여기서 중요한 거~ 작은 거랑 큰 거 더하면 보통 큰 걸로 바뀜
		//그래서 저거 어떻게 해야 하냐
		byte b3=(byte)(b1+b2);
		System.out.println(b3);

	}

}
