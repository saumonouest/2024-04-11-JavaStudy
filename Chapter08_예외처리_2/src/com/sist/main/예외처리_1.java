package com.sist.main;
/*	메소드
 * 	java.lang
 * 	java.util
 * 
 * 	1. 데이터형 / 변수 / 연산자 / 제어문
 * 	2. 클래스 구성요소 : 멤버변수(static), 메소드, 생성자
 * 	3. 재사용 => 상속 / 포함
 * 	4. 클래스의 종류 : 추상 클래스, 인터페이스
 *  5. 예외처리 : try ~ catch, throws
 *  --------------------------------------------- 자바의 기본 문법
 *  6. 라이브러리
 *  7. 조립(라이브러리 이용해서 프로그램 제작)
 *  --------------------------------------------- 
 *  => 사용(웹) => 자바는 변경사항이 없다
 *  			=> 출력 (윈도우 출력, 도스 출력, 브라우저)
 *  										----- HTML/CSS(Java+HTML)
 *  					=> Java와 HTML 분리 => MVC
 *  										 ---- Spring
 *  					=> 기술 => 자바스크립트
 *  					=> 배포 => AWS (리눅스)
 *  => 데이터베이스 라이브러리 : MyBatis / JPA
 *  => 서버가 분리(역할별 => 서버를 따로 제작) => MSA 구조
 *  --------------------------------------------------------------------------
 *  파이썬 => 데이터 분석 => 브라우저(장고)
 *  		--------- 넘파이 / 판다스 / MatPlotLib
 *  --------------------------------------------------------------------------
 *  예외처리 : 사전에 에러 발생에 대한 방지 프로그램
 *  		 -------------
 *  		 => 비정상 종료를 하지 않고 정상 수행이 가능하게 만들어 준다
 *  		 => 에러가 나면 => 에러를 자동 수정해주는 것이 아니라 점프를 해서 에러부분을 통과 ...
 *  
 *  		 문장 1
 *  		 문장 2 => 에러 발생 => 프로그램 종료
 *  		 문장 3
 *  			
 * 			 에러부분의 문장을 => 컴파일시 무시(통과) => 예외처리
 * 	
 * 	에러 발생
 * 	------- 1. 처리 (조건문 = 고려) => 조건문으로 처리가 어려운 경우 => 예외처리 이용
 *  ------- 프로그래머의 실수 (배열 인덱스 초과, 파일명 오류 ...)
 *  ------- 사용자 입력값 => 웹(유효성 검사 => 자바 스크립트)
 *  
 *  에러 종류
 *  Error : 수정이 불가능한 에러 (메모리 부족, 이클립스의 오류...)
 *  Exception : 수정이 가능한 에러 => 가벼운 에러
 *  			-------------- 프로그램 소스 안에서 
 *  			IP 연결시 IP 오류..., 크롤링시 사이트 URL 오류, 파일명 오류 ..
 *  			라이브러리 사용시 => 라이브러리를 로드 안 한 경우...
 *  
 *  정상 처리 방법(예외처리 방법)
 *   = 직접 처리(프로그래머가 에러를 직접 잡아서 => 복구) 예외 복구
 *   						   
 *   = 간접 처리 (파일 받기) => 메소드 호출 시에 처리
 *   			=> 예측되는 에러만 선언 => 라이브러리, 복잡한 소스가 있는 경우
 *   			메소드() throws 예외 종류
 *   			------		   ------
 *   			메소드를 호출해서 사용하려면 => 뒤에 선언된 예외처리를 하고 호출한다
 *   			=> 복구할 수 없다 => 예외를 피해간다 => 예외 회피
 *   -------------------------------------------------------------------
 *   = 임의 발생 : 테스트 (에러발생시 => 견고) 많이 사용하지는 않는다
 *   			 throw
 *   = 사용자 정의 : 자바에서 전체적인 예외처리를 지원하지 안흔ㄴ다 => 필요시에는 직접 만들어서 사용 => 사용빈도는 거의 없다
 *   
 *   => catch에는 순서가 존재
 *   => throws는 순서가 없다
 *   => 예외처리의 상속도 (반드시 예외처리(CheckedException), 필요시 처리(UnCheckedException))
 *   					컴파일시 예외처리 확인				실행시 처리(사용자 입력값을 받아서...)
 *  
 *   => 상속도 
 *   					Object => java.lang.* => 모든 클래스의 최상위 클래스 (모든 클래스는 Object 상속)
 *   					   |
 *   					Throwable => 예외 처리의 최상위 클래스 ==> Error/Exception
 *   					   | 
 *   			-------------------------
 *   			|						|
 *   			Error				Exception => 예외처리의 기본 클래스
 *   									|
 *   						-------------------------
 *   						|						|
 *   					CheckedException 		UnCheckedException
 *   					----------------		------------------
 *   					컴파일시에 예외처리 확인		컴파일시에 예외처리 미확인
 *   					=> 반드시 예외처리 사용		=> 필요시에만 예외처리 사용(생략)
 *   
 *   					=> IOException : 입출력
 *   					   -----------
 *   						=> 파일
 *   						=> 메모리
 *   					=> SQLException : 오라클 연결 / 해제 
 *   					   ------------
 *   						=> 연결시 => 오라클 서버 주소
 *   						=> SQL 문장
 *   						=> 입력값 오류
 *   						=> 자바(입력값 전송) => 오라클에서 결과값 얻기
 *   						=> 오라클 : 전체 프로그램에서 사용되는 데이터를 저장
 *   						   ----- 데이터 저장 : 크롤링
 *   					=> MalFormedURLException : IP,URL 주소가 틀린 경우
 *   					   ---------------------
 *   						=> 크롤링 (정적 : JSoup, 동적 : 셀레니움)
 *   					=> InterruptedException : 쓰레드
 *   					=> ClassNotFoundException : 클래스 이름으로 메모리 할당
 *   						new => 대신
 *   						UnCheckedException : 컴파일시 미확인 => 생략 (필요시에만 사용)
 *   						------------------
 *   						=> 최상위 클래스
 *   						RuntimeException
 *   								|
 *   						ArrayIndexOutOfBoundsException : 배열의 인덱스 초과
 *   						NumberFormatException : 웹, 윈도우
 *   						=> 정수가 필요한데 웹이나 윈도우는 문자열만 전송 => 정수로 변환 후에 사용
 *   							Integer.parseInt() => 문자열을 정수로 변환
 *   							------- 기본형 int를 사용하기 쉽게 => 클래스화
 *   							Double, Boolean, Float, Byte
 *   							---------------------------- 기본 데이터형을 클래스화 => Wrapper
 *   						=> 라이브러리
 *   							java.lang : 기본 사용 클래스 
 *   							= Object, String, StringBuffer, Math
 *   							  Wrapper
 *   							java.util : 유용하게 사용하는 클래스
 *   							= StringTokenizer, Calendar, Date, Scanner
 *   								*** List / Set / Map => 컬렉션
 *   							java.io : 파일 => FileReader, FileWriter
 *   							java.sql : Connection, Statement, ResultSet...
 *   						ArithmeticException : 0으로 나누기
 *   						NullPointerException
 *   						ClassCastException 
 *   						--------------------------------- 자주 에러가 나는 경우에 예외처리를 한다
 *   => 사용법
 *   	1) try ~ catch ~ finally
 *   		try {
 *   			정상적으로 실행되는 소스
 *   			=> 예상 못한 에러가 발생할 수 있다 => 프로그래머의 실수 / 사용자 입력의 문제
 *   			=> 프로그램에서 중요시
 *   				에러에 대한 대비 : 에러를 예상
 *   		}catch(예외처리클래스) => 멀티(여러개 사용이 가능) { 
 *   			에러를 잡아서 복구 => 에러확인
 *   							  ------
 *   								getMessage() : 에러 메세지만 출력
 *   								printStackTrace() : 실행하는 과정 => 에러위치 확인
 *   								----------------- 권장
 *   								=> 에러나는 경우 => output창
 *   								=> 에러 확인
 *   		}
 *   		finally { => 생략이 가능
 *   			try/catch 상관 없이 무조건 수행하는 문장
 *   			=> 파일 닫기, 오라클 닫기, 서버 닫기...
 *   			=> 연결 => 회수 (메모리 회수가 안된다)
 *   		}
 *   	2) throws => 선언, 라이브러리
 *   	   ----------------------------
 *   		메소드() throws 예외처리 등록 => 떠맡기기
 *   	   ----------------------------
 *   		ㄴ 메소드를 호출하려면 등록 예외처리를 하고 사용
 *   		ㄴ 이미 소스가 만들어진 경우
 *   		
 *   		=> throws 문장
 *   			public void disp() throws ArrayIndexOutOfBoundsException, NumberFormatException, NullPointerException
 *   			{
 *   			}
 *   
 *   			=> 호출에 등록된 예외처리를 한 후에 사용한다
 *   			
 *   			public void print() { 
 *   				disp
 *                                                                                                        
 */
public class 예외처리_1 {
	// display() 호출 시에 => 이런 에러가 발생할 수 있다 (예상)
	// 사용시에는 반드시 예외처리를 하고 사용한다
	// throws 뒤에는 예외 등록 => 순서가 없다
	// throws 뒤에 예외 등록은 보통 => CheckedException
	/* try ~ catch : 초기화 블록, 생성자, 메소드에서 사용이 가능
	 * throws : 생성자, 메소드에서만 가능
	 * *** 권장 => 가급적이면 try ~ catch를 사용한다
	 * *** 
	 * 
	 */
	public void display() throws ArrayIndexOutOfBoundsException,NumberFormatException,
								NullPointerException,IllegalArgumentException {

	}
	// 
	public void print() throws ArrayIndexOutOfBoundsException,NumberFormatException,
								NullPointerException,IllegalArgumentException {
		display();
	}
	public void print2() throws Exception {
		display();
	}
	public void print3() {
		display();
	}
	public void print4() {
		try {
			
		}catch(ArrayIndexOutOfBoundsException e) {}
		catch(NullPointerException e) {}
		catch(NumberFormatException e) {}
		catch(IllegalArgumentException e) {}
	}
	public void print5() {
		try {
			display();
		}catch(Exception ex) {}
	}
	public void print6() throws Exception {
		display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
