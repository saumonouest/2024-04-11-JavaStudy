/*	112 page
 * 	객체 생성
 * 	-------
 * 	형식) new 생성자()
 * 			 ------ 클래스명과 동일
 * 	e.g.) 
 * 		class A { 
 * 		}
 * 		A a=new A();
 * 		  - 객체 => 멤버변수 / 멤버메소드를 관리
 * 
 * 		배열
 * 			int [] arr =new int[2];
 * 			--- arr ---
 * 			   0x100		arr[0] arr[1] => 메모리 크기가 동일, 고정정으로 설정, 같은 데이터형만 사용이 가능
 * 			----------- => --------------
 * 							  0 	 0
 * 						   |-------------		
 * 						 0x100
 * 
 * 		클래스
 * 			class A {
 * 			String name;
 * 			int age; 
 * 			}
 * 			A a=new A();
 * 			---- a ----
 * 				0x200  => 0x200에 있는 name 이라는 변수값을 읽어 온다 => a.name
 * 			-----------
 * 
 * 			A a = new A();
 * 				  --- --- 생성자 => 멤버변수의 초기값을 대입해 주는 역할 => 같이 다닌다
 * 				  ㄴ클래스에 있는 멤버변수를 저장할 수 있는 공간을 만들어준다
 * 					a라는 공간에 저장된 메모리 주소를 넘겨주는 역할
 * 					** 생성자 호출ㄹ시에는 반드시 new 생성자()
 * 										   ----------
 * 			| 저장되어 있는 변수나 메소드를 관리 => 객체 => 설계(클래스)
 * 
 * 			1. 설계 => class
 * 			2. 메모리 저장 => new
 * 			3. 활용 => new부터 받은 메모리르 이용해서 활용 => 객체
 * 			--------------------------------------------------------- 객체 지향 프로그램
 * 			주목적 : 재사용, 수정 - 추가 편리하게 만든다
 * 			
 * 			=> 객체 사용
 * 				1. 생성
 * 					A a = new A();
 * 					--------------
 * 					A a;
 * 					a=new A();
 * 					--------------
 * 				2. 사용시에는
 * 					a.변수
 * 					a.메소드
 * 					-------------- . 은 메모리 주소 접근 연산자
 * 									    -----------------
 * 			=> 참조변수 (객체) => 메모리 주소를 이용하는 방식
 * 			=> 일반변수 => 메모리에 저장된 값을 이용하는 방식
 * 
 * 			int a=10;
 * 			int b=a;  =>
 * 				--a--	--b--
 * 				 10	 =>	 10
 * 				-----	-----
 * 				값만 넘겨주는 상태 => a값을 변경 / b값을 변경 시에
 * 								 ㄴb는 변경X   -----------
 * 											ㄴa는 변경되지 않는다
 * 
 */
class A{
	String name;
	int age;
}
public class 클래스_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=a;
		
		b=100;
		System.out.println("a="+a);
		System.out.println("b="+b);
		*/
		A a=new A();
		// a=> name/age
		System.out.println("a="+a);
		//객체가 관리하는 메모리 주소 확인
		a.name="서연우";
		a.age=30;
		System.out.println("a.name="+a.name);
		System.out.println("a.age="+a.age);
		
		// 메모리 주소를 받는 경우 => 메모리에 있는 변수자체를 제어할 수 있다 => a의 별칭 => 동시에 같은 메모리 변수를 사용이 가능		
		A b=a;
		System.out.println("b="+b);
		b.name="이다훈";
		b.age=34;
		
		System.out.println("b.name="+b.name);
		System.out.println("b.age="+b.age);
		
		System.out.println("a.name="+a.name);
		System.out.println("a.age="+a.age);
		// 배열 / 클래스는 메모리 주소를 이용한다 => 대입하면 같은 메모리를 제어 => 참조변수
	}

}
