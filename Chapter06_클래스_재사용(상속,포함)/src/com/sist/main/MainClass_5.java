package com.sist.main;
/*	상속
 * 	=> 사용자 정의 클래스는 상속으로 사용을 잘 안 함
 * 	=> 라이브러리 클래스
 * 	   -------------
 * 	=> 단일 상속
 *	   => 상위클래스는 가급적인 공통기반을 모아서 처리
 *		  class 사람 => 재사용
 *			|
 *	extends 사람
 *	-----------------
 *	|		|		|
 * 회사원	   학생	   홈프로텍터
 *	
 *	=> 메모리에 저장
 *		상위 클래스 = 하위 클래스
 *		-------------------
 *		상위 클래스 = 상위 클래스
 *		하위 클래스 = 하위 클래스
 *	 	하위 클래스 = (하위)상위 클래스
 *
 *		=> 클래스 크기는 상속이 있어야 가능
 *		   -------------
 *		   크기 : 상속 내리는 클래스 > 상속 받는 클래스 
 *		   ----------------------------------
 *		   = 선언되는 클래스 : 변수 
 *		   = 생성자 : 메소드 지정
 *
 *	class Super { 
 *		int a=10;
 *		int b-20;
 *		public void display() {
 *			System.Out.println("Super:display()Call. . .")
 *		}
 *	}
 *	class Sub {
 *		int a=100;
 *		int b=200;
 * 		public void display() {
 *			System.Out.println("Sub:display()Call. . .")
 *		}
 * 	}
 * 	Super sup=new Super(); sup => a=10, b=20, Super:display()Call....
 *	Sub sub=new Sub(); sub => a=100, b=200, Sub:display()Call....
 *	
 *	Super sup2=new Sub()
 *	-----	   ---------
 *	a=10,b=20	Sub:display() Call. . . => 오버라이딩
 *				=> 생성자에 따라서 메소드가 덮어쓴다
 * 
 */
class A{
	int a=10;
	int c=20;
	public void display() {
		System.out.println("A:display()Call . . .");
	}
}
class B extends A implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	int a=100;
	int c=200;
	public void display() {
		System.out.println("B:display()Call . . .");
	}
}
// A aa=new B() ==> (X)
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.a);
		System.out.println(aa.c);
		aa.display();
		
		
		
		
		System.out.println("===========================");
		// 가장 많이 사용
		B bb=new B();
		System.out.println(bb.a);
		System.out.println(bb.c);
		bb.display();
		try {
			B kk=(B)bb.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("===========================");
		// 두번째로 많음
		A cc=new B();
		System.out.println(cc.a);
		System.out.println(cc.c);
		// 상위클래스에 하위클래스 거를 대입하면 변수는 상위 거를 가지고 오는 거임
		// 무조건 그런 거는 또 아니라네... 
		cc.display(); // new B() => B가 가지고 있는 메소드
		// 변수는 안 바뀌고 상위 걸로 되는데 메소드는 변경 됨
		
		
		
		
		System.out.println("===========================");
		B dd=(B)cc;
		// 라이브러리에서 많이 씀 => 형변환
		System.out.println(dd.a);
		System.out.println(dd.c);
		dd.display(); // B
		
	
	}

}
