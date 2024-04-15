/*
 * 자바의 기본 문법
 *	=> 1. 데이터 저장
 *			변수 / 상수 => 변수 : 데이터를 한 개만 저장하는 공간 
 *						----
 *						ㄴ메모리 공간 크기 결정 
 *							ㄴ 정수 / 실수 / 문자 / 논리
 *							ㄴ 기본 저장 크기를 제공 (기본 데이터형)
 *							변수 : 변경해서 사용이 가능
 *							상수 : 변경할 수 없는 공간
 *			================================================
 *			배열 : 여러개를 동시에 저장 (같은 형만 저장 가능)
 *			클래스 : 여러개를 동시에 저장 => 다른 데이터형을 저장할 수 있다
 *
 *	=> 2. 데이터 가공 (사용자 요청 시)
 *			연산자 / 제어문
 *			-----------
 *			=> 메소드
 *	=> 3. 가공된 데이터를 출력
 *			=> 명령 프롬프트 : Application => 윈도우
 *			=> 브라우저 : Web Application
 *			=> 핸드폰 : Moblie Application
 *						=>Java(X), Kotlin, Flutter(Dart)
 *	=> 4. 데이터 분석 : 파이썬
 *	=> AWS
 *
 * 객체 지향 프로그램
 * 예외처리
 * 라이브러리 활용 
 * -------------------
 * 1) 오라클 연결
 * 2) Web => JSP => JQuery (Ajax) => 1차 프로젝트
 * 3) Spring => VueJS => 2차 프로젝트
 * 4) Spring-Boot => React => 3차 프로젝트(개인)
 * 5) Python : Numpy, Pandas, Matplotlib
 * 6) AWS(클라우드) => 호스팅
 * *** Full stack : JavaScript => 동적 페이지
 * 	   JQuery(Ajax), VueJS, React(Redux, React-Query)
 * 	   ***TypeScript, NextJS
 * 
 * 
 *	2024-04-15 연산자
 *	1) 변수 : 데이터 1개만 저장하는 메모리 공간
 *		데이터를 저장하기 위한 작업
 *		1. 메모리에 별칭 설정
 *		   ---- 주소대신 이름으로 저장
 *			0번지---------
 *				사용중
 *			4번지---------
 *				사용중
 *			8번지---------
 *				저장 => 이름을 부여 => 변수
 *			12번지--------
 *			---
 *
 *			**식별자 => 한 개의 클래스 내에서는 같은 변수명을 사용할 수 없다
 *			= 알파벳이나 한글로 시작(대소문자 구분)
 *			= 문자의 갯수는 무제한(3~10자 압축) => 어떤 데이터가 저장되어 있는 지 확인
 *			= 숫자를 사용할 수 있다 (앞에 사용 금지)
 *			= 특수문자 사용 가능(_ , $) => 위치 무관
 *			= 키워드 : 자바에서 사용하는 문자열(단어) 사용 불가 (e.g. int int)
 *			= 공백 사용 불가 (e.g. int A B)
 *
 *			
 *		2. 메모리 크기 (데이터형)
 *			------------------------------------------------------------------------
 *			정수
 *			byte (1byte) => 네트워크 통신, 외부 데이터 읽기, 파일 업/다운로드
 *			
 *			형식) 
 *			byte 변수명 = 값
 *			=> 값은 -128 ~ 127까지만 사용 가능
 *			=> byte는 연산처리가 되면 결과값 int
 *			------------------------------
 *			byte + byte = int 
 *			byte a = 127
 *			byte b = 127
 *			a + b = int => 사용범위 초과
 *			
 *			int (4byte) => 프로그램에서 가장 많이 사용되는 데이터형
 *							정수 => int => default 
 *							컴퓨터에서는 모든 정수는 int를 인식
 *			형식)
 *			int 변수명 = 값
 *			=> 값 사용 범위 : -21억 4천 ~ 21억 4천
 *		
 *			long (8byte)
 *
 *			형식)
 *			long 변수명 = 값 > 큰값이면 설정
 *			byte < int < long
 *
 *			*** 구분자
 *			int a = 100 > 4byte 저장됨
 *			long b = 100L > 8byte 저장됨
 *					
 *			------------------------------------------------------------------------
 *			실수 : 소수점 저장
 *				float (4byte) => 많이 사용하지는 않는다
 *						=> 구분자 F,f
 *				형식) float f = 10.5 ==> 오류
 *							  ----- double
 *					 float f = 10.5f(F)
 *				
 *				double (8byte) => 실수 가장 많이 사용되는 데이터형
 *					=> default(컴퓨터에서 실수가 있는 경우 => double)
 *					=> 실수점 15자리수까지 인식
 *		
 *				*** 정수 < 실수 => 크기를 바이트로 따지지 않음 > 수에 대한 표현
 *					long < float
 *			
 *			------------------------------------------------------------------------
 *			문자 : char (2byte) => 문자는 음수가 없다(0~65535)
 *					=> 각국의 언어를 표현 => 유니코드 => 호환 굿~
 *					값은 문자'', 정수값 사용 가능
 *				형식)	
 *					char a = 'A'
 *					char b = 65 > 예외사항
 *					=> char는 연산처리시에 정수형으로 변경 
 *					'A' => 65
 *					'a' => 97
 *					'0' => 48
 *			------------------------------------------------------------------------
 *			논리 : boolean (1byte) => true / false 만 저장이 가능
 *					=> 조건 / 제어문
 *				형식) boolean b = true / boolean b = false
 *				** 크기는 비교할 수 없다
 *				** 기본 연산이 안 된다
 *				   ------- 부정연산자, 비교연산자, 논리연산자, 삼향연산자
 *
 *			------------------------------------------------------------------------
 *			참조형 (배열, 클래스) => 메모리 주소 이용 
 *			------------------------------------------------------------------------
 *
 *		3. 변수 형식
 *			데이터형 변수명; 
 *			***사용시에는 반드시 변수명 = 값 을 대입해야 사용이 가능
 *			정수 
 *				byte b;
 *				b=10;
 *				int a=10;
 *				long l=100L
 *
 *		4. 초기값
 *				임의로 지정 => 변수(필요시에 따라 변경이 가능)
 *				1) 선언 => 초기값
 *					사용자로부터 값을 받을 경우, 난수(임의로 추출)
 *				2) 선언과 동시에 초기값 
 *				   --------------int a=10;
 *		------------------------------------------------------------------------------------------여기까지가 변수
 *
 *		연산처리
 *		피연산자 / 연산자
 *		-----
 *		10 + 10
 *		--   -- 이게 피연산자
 *		   ㄴ 20 
 *		단항연산자 : 연산 대상이 1개
 *			= 증감 연산자 : 1개 증가 / 1개 감소 => ++, --
 *				int a=10;
 *				a++;
 *				=> a=11
 *				int a=10;
 *				a--;
 *				==> a=9
 *
 *			= 부정연산자 : true -> false, false -> true : boolean만 사용이 가능
 *				=> ! 
 *				boolean b = true
 *				!b => false ==> 조건 => 로그인, 검색어 . . .
 *
 *			= 형변환 연산자 => 모든 데이터형은 변경이 가능 (boolean 제외)
 *				int => double, double => char . . .
 *				형식) 
 *				10.5 ==> double 
 *				(int)10.5 ==> int => 10
 *				-----
 *
 *		이항연산자 : 연산 대상이 2개 
 *			=산술연산자 
 *				+, -, *, /, % (나머지)
 *			
 *			= 비교연산자 : 결과값 => boolean (true/false) 
 *				==(같다) 6==7(false)
 *				!(같지 않다) 6!=7 *(true)
 *				기준점 : 왼쪽 
 *				<(작다)
 *				>(크다)
 *				<=(작거나 같다)
 *				>=(크거나 같다)
 *
 *			= 논리연산자 : 결과값 => boolean (true/false)
 *				&&(앤드) : 직렬 연산자 (범위, 기간 안에 있는 경우) > 예약, 체크인/아웃
 *				||(오어) : 병렬 연산자 (범위나 기간을 벗어나는 경우) > 반대의 경우임
 *
 *			= 대입 연산자 : 결과값을 다시 저장할 경우
 *				***= 대입 
 *				int a=10
 *				***+=
 *				***-=
 *				/=
 *				*=
 *				%=
 *				op=
 *
 *		삼항연산자 : 연산 대상이 3개 => if ~ else => 페이징, 복합한 소스 코딩이 있는 경우
 *							 => 웹, 게임 프로그램, 네트워크 프로그램
 *			(조건)?값1:값2
 *			=> 조건 : true => 값1
 *					 false => 값2
 *
 *		38page => 산술 연산자(+, -, *, /, %)
 *					***주의점 : 자바의 모든 연산은 같은 데이터형끼리만 가능
 *											------------
 *				int + int = int
 *				long + long = long
 *				int + long = long
 *				---
 *				ㄴlong 변경 후에 연산 ==> 데이터형을 큰형으로 변경 후에 연산 
 *
 *				char + int = int 
 *				----
 *				ㄴint
 *				
 *				***데이터형의 크기
 *				byte < char < int < long < float < double
 *
 *				***주의점
 *				byte + byte = int
 *				char + char = int 
 *				byte + char = int 
 *				------------------------int보다 작은 데이터형은 연산시에 결과값이 int
 *				int + double + char = double  가장 큰 데이터형으로 나온 거임
 *				10		10.5	'A'
 *				------------
 *				10.0 + 10.5
 *				------------
 *					20.5       -----
 *								65.0
 *				--------------------
 *						85.5 => 결과값은 가장 큰 데이터형이 나온다
 *				=> +, -, * => 동일
 *
 *				/(나누기)
 *				=> 0으로 나누면 오류 발생(e.g. 10/0 => 오류 => 0으로 나눌 수 없다) 
 *				=> 정수/정수 => 정수 (실수점 제외) (e.g. 5/2 = 2) > 소수점이 필요할 때는 정수/실수
 *
 *				%(나누고 나머지 값)
 *					5%2 => 1 => 배수
 *					** 주의점 
 *					5%2 = 1
 *					5%-1 = 1
 *					-5%2 = -1
 *					-5%-2 = -1
 *					------------왼쪽 부호를 따라 간다 . . . 
 *				
 *
 */
public class 연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10/0);
		System.out.println(5/2.0);
		//국어 영어 수학 => 총점, 평균 
		int kor=80;
		int eng=75;
		int math=90;
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("국어점수"+kor);
		System.out.println("영어점수"+eng);
		System.out.println("수학점수"+math);
		System.out.println("총점"+total);
		System.out.printf("평균:%.2f",avg); //소수점 두자리만 출력한다는 뜻 %.2f 하고 "" 뒤에 플러스 아니고 ,
	}

}
