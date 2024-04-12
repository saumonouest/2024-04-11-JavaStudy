/*
 *  1. 변수 / 상수
 *     변수
 *     한 개의 데이터를 저장하는 메모리 공간 이름 > 변경 가능
 *     => 외부 => 계속 변경되는 데이터를 찾는다
 *     데이터형 변수 = 값
 *     모든 상수명 소문자
 *     
 *     상수
 *     한 개의 데이터를 저장하는 메모리 공간 이름 > 변경 불가능
 *     final 데이터형 변수 = 값 
 *     모든 상수명은 대문자
 *     => IP
 *     
 *	2. 변수 / 상수 선언
 *	   => 데이터형 변수명 ; 
 *	   => final 데이터형 상수명 ; < 이건 오류 남 
 *	   => final 데이터형 상수명=값; < 이렇게 해야 됨
 *
 *	3. 데이터형(기본형) => 저장범위, 메모리 크기(1,2,4,8byte)
 *	   ---------------------------------------------------
 *		정수형
 *		  byte : 1byte => -128 ~ 127 => 네트워크 전송 시에 주로 사용(업로드, 다운로드)
 *		  int  : 4byte => -21억 4천 ~ 21억 4천 => 모든 정수는 컴퓨터에서 int로 인식
 *				 가장 많이 사용되는 정수형 (웹에서 숫자가 나오면 무조건 int)
 *				 e.g. 회원가입(나이 : int age) / 게시판(게시물 번호 : int bno, 조회수 : int hit)
 *		  long : 8byte =>(최근 => 빅테이터) => AI
 *	   ---------------------------------------------------
 *		실수형
 *		  double : 8byte => 평균 . . .
 *				   실수형의 default => 실수가 나오면 컴퓨터에서는 무조건 더블로 인식
 *				   => 평균치, 평점. . .
 *	   ---------------------------------------------------
 *		문자형
 *		  char : 문자 1개 저장 => '' => 2byte(0~65535) => 각국의 언어 사용 가능
 *									 Unicode
 *				** 연산시에는 정수로 변경이 된다 
 *				   연산처리가 될 때, 연산은 같은 데이터형끼리만 연산 가능 
 *			  e.g. 10 + 10.5 > 10.0 + 10.5 로 변경 
 *				   10.0 + 10.5 => 20.5(더블로 나오는 거임)
 *				   'A' + 1 
 *				   ---
 *				   65 + 1 = 66
 *	   ---------------------------------------------------
 *		논리형
 *		  boolean : 1byte (1:true, 0:false) => true/false
 *					=> 조건이 있는 경우
 *					boolean bCheck=false;
 *	   ---------------------------------------------------
 *		선언 방법 => 초기화
 *		byte b=10;
 *		byte b;
 *		b=20;
 *	   -----------------------
 *		int i=10; => 선언 + 초기화 
 *
 *		//사용자로부터 입력값을 받는 경우
 *		int i;  //선언
 *		i=20; //초기값
 *		
 *		여러개가 있는 경우
 *		int a;
 *		int b;
 *		int c;
 *		-------> int a,b,c;
 *
 *		여러개의 변수에 초기화
 *		int a=10;
 *		int b=10;
 *		int c=20;
 *		
 *		int a=10,b=10,c=20; 같은 데이터형일 경우에만
 *
 *		======================================
 *		데이터형 변수명 = 값 > 초기화 
 *		
 *		변수의 명칭 
 *		1. 알파벳, 한글로 시작 (대소문 구분) 
 *		2. 숫자 사용 가능 (앞에 사용 불가)
 *		3. 키워드는 사용 불가
 *		4. 특수문자 사용 가능 (_ , $)
 *		5. 공백은 허용하지 않는다
 *
 *		데이터 크기
 *		byte < char < int < double
 *		boolean은 크기에서 제외
 *
 *		데이터의 교환은 반드시 임시변수 설정
 *		int a=10;
 *		int b=20;
 *		int temp=a;
 *		a=b;
 *		b=temp;
 *		-----------------------------------------
 *
 *		*** 변수에 값을 대입 할 때는
 *		byte b = 값(byte)
 *		char c = 값(char값, int값)
 *		int i = byte값, char값, int값 
 *		long l = byte값, char값, int값, long값
 *		double d = byte값, char값, int값, long값
 *		------------------------------------------
 *		작은 데이터형을 대입하면 자동으로 변경
 *		char c=65 > c='A'
 *		int a='A' > a=65
 *		long a=10 > a=10L
 *		double a='A' > a=65.0
 *		------------------------------------------ 2장 ~37page
 *
 */
public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

	}

}
