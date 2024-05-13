package com.sist.main;
/*	206page / 207page
 * 
 * 	오버로딩 : 중복 메소드 정의 => 같은 기능 
 * 	예) print(int) print(char) print(char[]). . .
 * 	   ----------------------------------------------------
 * 	   printInt() printChar() . . .
 * 
 * 	   => 사칙연산 
 * 			plus(byte,byte)
 * 			byte int
 * 
 * 	=> 버스 
 * 	   버스 => 일반버스
 * 	   버스(좌석)
 * 	   버스(마을)
 * 	   버스(고속엔진)
 * 
 * 	오버라이딩 : 기존의 클래스를 상속을 받아서 => 재정의 (메소드 기능을 변경)
 *  ----------------------------------------------------------------------------------------------------------------
 * 				오버로딩 												오버라이딩
 * 	----------------------------------------------------------------------------------------------------------------
 * 	상태 		같은 클래스 내에서 											상속
 * 			class A {												
 * 			public void aaa(){}             => aaa()
 * 			public void aaa(int a){}		=> aaa(int)
 * 			public void aaa(char c){}		=> aaa(char)
 * 			public void aaa(int a, int b){}	=> aaa(int,int)
 * 			public int aaa(double d){}		=> aaa(double)
 * 			void aaa(float f){}				=> aaa(float)
 * 			}
 * 	----------------------------------------------------------------------------------------------------------------
 * 	메소드명	동일														동일
 * 	----------------------------------------------------------------------------------------------------------------
 * 	매개변수 	갯수, 데이터형이 다르다										동일
 * 	----------------------------------------------------------------------------------------------------------------
 * 	리턴형 	관계 없음													동일
 * 	----------------------------------------------------------------------------------------------------------------
 *  접근지정어	관계 없음													확대만 가능
 * 	----------------------------------------------------------------------------------------------------------------
 * 	접근지정어의 크기
 * 	private < default < protected < public 
 * 									------ 기본(public)
 * 	
 * 	오버라이딩 => 상속
 * 			   예외조건) 
 * 				static : 상속은 안된다 => 사용이 가능하게 만든다(공유)
 * 				private : 상속은 가능 => 접근이 불가능
 * 					=> protected
 * 				생성자
 * 				초기화블록
 * 				---------------
 * 				멤버변수(인스턴스)  => 변수값 변경(변수 오버라이딩)
 * 				메소드		====> 기능 변경(메소드 오버라이딩)
 * 				--------------- 상속 
 *
 *		메소드의 종류
 *		1. 인스턴스 메소드 : new에 의해서 따라 저장
 *		2. 공통 메소드 : static => 상속의 예외 조건 => 변경(전체 변경) => 오버라이딩이 안 됨
 *		3. 종단 메소드 : 확장이 불가능 => 변경이 불가능 => final
 *		--------------------------------------------------------------------
 *		권장) 메소드의 접근지정어는 가급적이면 public
 *		----------------------------------
 *		접근지정어
 *		-------
 *		public : 생성자, 클래스, 메소드, 인터페이스
 *				=> 다른 클래스와 연결
 *		private : 멤버변수 => 데이터 노출 방지 (데이터 보호)
 *				=> 다른 클래스에서 사용
 *					=> 변수 기능의 메소드 제작
 *					-------------------
 *					메모리 저장 / 메모리에 읽어오기
 *					--------   -----------
 *					ㄴset변수명()	ㄴget변수명()
 *					
 *					=> class A { 
 *						private String name;
 *						private boolean login;
 *						public void getName();
 *						public void isLogin();
 *						}
 *					   class B {
 *							A a=new A();
 *						}
 *
 *	class 영역
 *	---------------------------
 *	static 메소드 : 기본은 static 메소드, static 변수만 사용이 가능
 *		=> 인스턴스 메소드, 인스턴스 변수는 사용할 수 있다
 *		=> this가 없다
 *	인스턴스 메소드 : 인스턴스 메소드, 인스턴스 변수, static 변수, static 메소드 사용이 가능
 *	----------- this가 있다
 *	
 */
class ABC{
	public void display() {} // 멤버메소드
	public static void display2() {} // 공통메소드 
	public final void display3() {} // 종단메소드 
}
class BCD extends ABC{
	public void display() {} 
	//public static void display2() {} 
	//public final void display3() {} 
}
// 인스턴스 메소드, 인스턴스 변수 => 중심 / static은 데이터베이스
class DGB{
	// this. => DGB가 가지고 있는 변수 
	// 생성자, 멤버 메소드에만 존재 => static 메소드는 this가 없다 => 멤버변수를 사용할 수 없다
	private String name;
	private boolean login;
	private static int age;
	public void display() {
		String name="";
		this.name="홍길동";
		name="";
		age=100;
		aaa();
	}
	public static void aaa() {
		// 클래스의 멤버변수가 아니다 => 공통 사용부분을 구사
		System.out.println(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this 는 지역변수와 충돌 했을 때 사용하는 거임, 똑같은 변수명이 나왔을 때
		// 만약에 String name이 아니라 String s 였을 때는
		// name =s; 로 해도 됨
		// 지역변수 우선순위
		// 지역변수, 매개변수 ==> 멤버변수 
	}
	// 읽기 
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
}
public class MainClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
