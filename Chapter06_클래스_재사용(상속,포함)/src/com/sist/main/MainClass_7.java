package com.sist.main;
/*	5장 객체지향 프로그램 시작
 * 		=> 변수 설정
 * 		=> 저장할 내용이 여러개 => new 인스턴스 변수
 * 			한 개 저장 => static
 * 		=> 메소드 형식 => 처리 과정
 * 		   ---- 연산자 / 제어문
 * 		=> 초기화 : 생성자, static{}
 * 
 *  194 page 
 * 	상속 => 재사용
 * 	=> 변경 (오버라이딩)
 * 	=> 상속 => 호출 되는 과정
 * 	=> 메모리 할당 (상위, 하위)
 * 	=> 형변환 
 * 	----------------------
 *  7장 : 추상클래스 / 인터페이스
 *  8장 : 예외처리
 *  ---------------------- 자바 기본 문법 
 *  9장 ~ 마지막 : 라이브러리 => 조립
 * 
 * 
 * 	상속
 * 	=> 멤버변수, 메소드
 * 	=> 상속 => 확장된 클래스 : extends
 * 	=> 형식 
 * 		class A extends B => 단일 상속, 재사용
 * 	=> 단일 상속
 * 	   	 동물
 * 		  |
 * 		 인간		-------------- 이다 (is-a) => 추상화 => 
 * 		  |
 * 	-------------	--------- 구체화 
 *  |			|
 *  남자			여자
 *  
 *  상속을 내리는 클래스는 클래스마다 공통점을 가지고 있다
 *  
 *  
 *  201 page => 단일상속
 *  		A
 *  		|
 *  	---------
 *  	|		|
 *  	B		C
 *  		
 *  		A
 *  		|
 *  		B
 *  
 *  	A		B
 *  	-		-
 *  	|		|
 *  	---------		=> 다중 상속 (클래스에는 존재하지 않는다 => 인터페이스)
 *  		|
 *  		C		
 *  
 *  201 page => 확장
 *  			--- 변경해서 사용 => 오버라이딩 (변수 오버라이딩, 메소드 오버라이딩)
 *  			--- 추가
 * 	
 * 	추가 : 오버로딩 / 변경(수정) : 오버라이딩
 * 
 * 
 * 					오버로딩				  오버라이딩(덮어쓰기)
 *  -------------------------------------------------------
 *  상태 					같은 클래스 내에서만 상속이 된 상태 
 *  					------------	-----------
 *  									** 익명의 클래스 => 상속 없이 오버라이딩이 가능
 * 	-------------------------------------------------------
 * 	메소드명			 동일		   			    동일
 * 	-------------------------------------------------------
 *  매개변수		갯수/데이터형이 다르다 	  갯수나 데이터형 동일 
 * 	-------------------------------------------------------
 * 	리턴형			관계없음				    동일 
 * 	-------------------------------------------------------
 * 	접근지정어 		관계없음			  축소 불가능 / 확대 가능
 *  -------------------------------------------------------
 *  접근지정어 
 *  			<----------------------- 축소
 *  	=> private < default < protected < public
 *  			-----------------------> 확대
 *  -------------------------------------------------------
 *  class A {
 *  	void display(){}
 *  }
 *  => void display(){}
 *  => protected void display(){}
 *  => public void display(){}
 *  => 잘 모르는 경우 => public 
 *  
 */
// 변수 오버라이딩
import java.util.*;
/*	변수 오버라이딩
 * 	Parent => 메모리 할당 => Child가 메모리 할당
 */
class Parent {
	String name;
	int age;
	// 메모리에 저장 => 상속받은 클래스에서 연걸해서 사용
	
	public Parent() {
		name="홍길동";
		age=25;
		System.out.println("Parent 클래스 메모리 할당");
	}
}
class Child extends Parent{
	// Stirng name;
	// int age;
	/*
	 * Child c=new Child(); // 확장된 클래스 => 기본
	 * Parent p=new Child()
	 * -------------------- 클래스 여러개를 한 개의 이름으로 제어
	 * 
	 * 
	 */
	public Child() {
		this.name="박문수"; // 자신 => this => 지역변수와 구분 
		this.age=30;
		super.name="심청이"; // 상위 클래스 => super
		super.age=15;
		System.out.println("Child 클래스 메모리 할당");
	}
	
}
class KKK{
	public void display() {
		System.out.println("KKK:display()Call...");
	}
}
class AAA extends KKK {
	public void display() {
		System.out.println("AAA:display()Call...");
	}
}
class BBB extends KKK {
	public void display() {
		System.out.println("BBB:display()Call...");
	}
}
class CCC extends KKK {
	public void display() {
		System.out.println("CCC:display()Call...");
	}
}
class DDD extends KKK {
	public void display() {
		System.out.println("DDD:display()Call...");
	}
}
class EEE extends KKK {
	public void display() {
		System.out.println("EEE:display()Call...");
	}
}
/*	프로그램은 여러개를 가지고 제어하면 => 어렵다
 * 	int a,b,c,d,e,f,g,h,i,j,k;
 * 	int [] arr=new int [12];
 * 	
 * 	class AAA BBB CCC . . .
 * 	extends => 상위 클래스로 제어
 */
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println("이름:"+c.name);
		System.out.println("나이:"+c.age);
		
		/*Scanner scan=new Scanner(System.in);
		System.out.print("AAA(1),BBB(2),CCC(3),DDD(4),EEE(5):");
		int no=scan.nextInt();
		
		KKK k=null; // 상속받은 모든 클래스를 상위 클래스를 이용해서 한 번에 제어
		// 데이터가 여러개 => [] => 배열명
		// 클래스가 여러개인 경우 => 상속 => 상위 클래스를 이용해서 제어
		switch(no) {
		case 1:
			k=new AAA();
			break;
		case 2:
			k=new BBB();
			break;
		case 3:
			k=new CCC();
			break;
		case 4:
			k=new DDD();
			break;
		case 5:
			k=new EEE();
			break;
		}
		k.display();
		if(no==1) {
			AAA a=new AAA();
			a.display();
		}
		else if(no==2) {
			BBB b=new BBB();
			b.display();
		}
		else if(no==3) {
			CCC c=new CCC();
			c.display();
		}
		else if(no==4) {
			DDD d=new DDD();
			d.display();
		}
		else if(no==5) {
			EEE e=new EEE();
			e.display();
		}*/
		
	}

}
