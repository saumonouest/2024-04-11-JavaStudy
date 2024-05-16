/*package com.sist.music;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스, 인터페이스 => 관련된 클래스를 묶어서 1개의 객체로 제어하는 목적
		// 데이터 => 한 개의 이름으로 여러개의 변수를 제어 => 변수
		/*	추상 클래스
		 * 	= 공통으로 사용되는 기능 => 구현 동일한 경우
		 * 		list(), find(), detail() ===> 추상 클래스에서 구현
		 * 	= 공통으로 사용 => 구현 내용이 다른 경우
		 * 		init() => 선언 => 각 클래스에서 구현
		 * 
		 * 메소드
		 * 	=> 구현된 메소드 : 상속받은 클래스의 구현 내용이 동일 
		 * 		=> [접근지정어] abstract 리턴형 메소드명(매개변수. .){
		 * 				구현하는 내용이 들어간다
		 * 			}
		 * 	=> 구현이 안 된 메소드 : 상속받은 클래스가 동일하지 않는 경우에 선언 => abstract
		 * 		=> [접근지정어] abstract 리턴형 메소드명(매개변수. .);
		 * 					--------- 선언만 한다
		 * 		*** 메소드가 선언만 되어 있는 경우에는 new를 이용해서 메모리 저장할 수 없다
		 * 			=> new를 이용해서 메모리 할당이 안 된다
		 * 				상속받은 클래스를 이용해서 메모리에 저장 후에 사용
		 * 				---------- 선언된 메소드를 반드시 구현해서 사용
		 * 		*** 메소드가 구현이 안 된 경우 : 추상 클래스, 인터페이스
		 * 			------------------- 미완성 클래스
		 * 
		 * 		abstract class A { 
		 * 			public void aaa(){}	=> {} 메소드는 구현으로 인정 
		 * 			public void bbb(){}
		 * 			public void ccc(){}
		 * 		}
		 * 		추상 클래스에서 모든 메소드가 구현이 된 경우에도 => 메모리 할당을 할 수 없음
		 * 		abstract => 선언시에는 메모리 할당을 할 수 없다
		 * 		
		 * 		class A {
		 * 		-------------------
		 * 		변수 : 인스턴스
		 * 				정적
		 * 		-------------------
		 * 		생성자
		 * 		-------------------
		 * 		메소드
		 * 		-------------------
		 * 		선언된 메소드
		 * 		-------------------
		 * 		=> 선택 사항 
		 * 	}
		 * 	구현이 안 된 메소드가 없는 경우는 추상클래스보다는 일반 클래스가 편하다	
		 * 	---------------------------------------------------
		 * 	자체 메모리 할당이 가능
		 * 	추상 클래스는 무조건 상속을 내려서 처리
		 
		Scanner scan=new Scanner(System.in);
		//MusicSystem ms=new GenieMusic();
		//ms.init();
		MusicSystem ms=null;
		System.out.println("지니뮤직(1), 멜론(2):");
		int n=scan.nextInt();
		/*if(n==1)
			ms=new GenieMusic();
		else
			ms=new MelonMusic();
		
		ms.init();
		if(n==1)
		while(true) {
			System.out.println("========== 메뉴 ==========");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println("========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			switch(menu) {
			case 1:
				ms.list();
				break;
			case 4: 
				System.out.println("프로그램 종료");
				System.exit(0);
			case 2:
				System.out.println("번호 선택 (1~50):");
				int no=scan.nextInt();
				ms.detail(no);
				break;
			case 3: 
				System.out.print("검색어 입력:");
				String title=scan.next();
				ms.find(title);
				break;
			}		
		}
	}
*/