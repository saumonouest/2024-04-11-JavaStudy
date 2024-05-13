package com.sist.main;
/*	객체지향 프로그램
 * 	------------
 * 	1) 데이터 보호 => 캡슐화
 * 			데이터 은닉화 / 메소드를 통해 접근이 가능
 * 			private		getter/setter
 * 	2) 상속 => 기존의 클래스를 재사용
 * 			상속 / 포함 - 있는 그대로 사용 => 사용빈도 많음
 * 			ㄴ변경해서 사용 
 * 			= 메모리 누수 현상
 * 			  상위 클래스 메모리 할당 => 하위 크래스 메모리 할당 : 메모리 사용이 많다
 * 			  상위 클래스에 맞게 사용 => 제약이 많다
 * 			  결합성이 높아지는 단점
 * 			  속도가 느림 => 가급적이면 상속을 사용하지 않는다
 * 			  --------------- 수정 시에 다른 클래스에 영향을 많이 미친다
 * 			=> 윈도우 프로그램 : 상속
 * 			=> 웹 프로그램 : 상속이 거의 없음 => Spring 
 * 	3) 다형성(오버로딩,오버라이딩)
 * 	   ---- ----- ------- 모든 내용이 동일(리턴형, 매개변수, 메소드명, 접근지정어)
 * 		|	ㄴ 메소드명만 동일
 * 	    ㄴ여러 형태 (같은 메소드명으로 다른 기능을 제작)
 * 		=> 새로운 기능 추가 : 오버로딩 
 * 		=> 기존의 기능 변경 : 오버라이딩
 * 		=> 오버로딩 / 오버라이딩 => 질문
 * 			new  /  modify
 * 	----------------------- 객체 지향의 3대 특성 (권장) => 재사용, 수정, 추가 => 유지 보수
 * 	
 * 	1. 클래스 구성요소
 * 		클래스 : 설계
 * 		|		= 필요한 데이터 추출 => 변수
 * 		|		= 기능 추출 => 메소드
 * 		|		= 필요시에는 초기화 => 생성자(생략이 가능)
 * 		메모리에 저장 => 인스턴스 => new
 * 		|
 * 		사용 => 객체 => new로부터 생성
 * 			   --
 * 				관련된 데이터와 메소드를 관리하는 메모리 영역(변수 => 데이터값을 관리)
 * 				--------------------------------
 * 				define은 중요하지 않다
 * 				=> 권위가 있는 사람이 이름을 부여
 * 
 * 		class className {
 * 		클래스 영역에서는 제어문, 연산처리, 값을 다시 대입 => 불가능
 * 		-------- 선언, 선언과 동시에 값 대입 이거밖에 못 함 
 * 				 int a;
 * 				 int a=100;
 * 		--------------------------------------
 * 		변수 
 * 		= 인스턴스 변수 (중심) ==> 멤버변수 ==> Heap
 * 		  --------- 메모리 영역을 만들어서 저장
 * 					------------------- new
 * 					=> 따로 저장하는 메모리 공간을 만든다
 * 					=> 클래스는 1개당 정보를 설정
 * 					   학생 => 1명에 대한 정보 추출 => 여러명 => new를 이용
 * 		= static 변수 ==> 공통변수 ==> Method Area => 메모리가 1개만 생성 
 * 		  ------ 컴파일러에 의해 생성
 * 		  ------ 접근시에는 클래스명.변수명
 * 		--------------------------------------
 * 		메소드 : 변수 활용
 * 		--------------------------------------
 *		초기화 => 데이터베이스 / 파일 / 크롤링
 *				---------------------
 *				=> 생성자 *** 생략이 가능 => 자동으로 생성자를 추가 
 *				    / static {} 
 * 		--------------------------------------
 * 		}
 * 		=> new 연산자 => 메모리에 변수 / 메소드가 동시에 저장
 * 		
 */
public class Chapter06_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
