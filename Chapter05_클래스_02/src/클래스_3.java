/*	변수 => 초기화(프로그램에 필요한 데이터 값을 저장)
 * 	| 필요한 값을 지정
 *  -------------------------
 * 	| 파일 읽기
 * 	| 웹 읽기(크롤링)
 * 	| 메소드를 이용하는 방법
 * 	| 입력값을 받아서 처리
 * 	------------------------- 선언이 아니라 구현
 * 							  -------------- 클래스 {} 안에서는 사용이 불가능
 * 							  | 초기화 불록 / 생성자
 * 	= 선언과 동시에 값을 지정
 * 		int a=100;
 * 		나중에 값을 대입하는 것은 불가능
 * 		--------------------------
 * 		int a;
 * 		a=100;
 * 		==========================> 클래스 블록에서
 * 		= 모든 클래스에는 생성자가 반드시 1개 이상이 존재
 * 		= 생성자가 없는 경우에는 컴파일 시에 자동으로 1개 추가한다
 * 	
 * 		*** 자바 프로그램에서 자동으로 추가되는 내용
 * 		1. import java.lang.*;
 * 				  -----------
 * 				  String, Math, System
 * 
 * 		2. extends Object : 모든 클래스는 Object 
 * 		3. 메소드 => void => return 생성
 * 		4. 모든 클래스 생성자가 없는 경우 => 자동 추가
 */
class Student{
	// 변수 
	String name="서연우";
	int hakbun;
	String school_name="SIST";
	String subject="컴퓨터";
	int year=2;
	// 명시적인 초기화 => 객체 생성시에 모든 데이터값이 동일
	/*	자동 초기화
	 * 	int => 0
	 * 	double => 0.0
	 * 	String => null
	 * 	boolean => false
	 */
	// 초기화
	// 메소드
}
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생 생성
		// seo 메모리 주소 => name, subject, school_name, year, hakbun => .을 이용해서 접근
		Student seo=new Student();
		//				// 생성자 => 리턴형이 없다 / 클래스명과 동일 => 외부에서 데이터 읽어 변수에 대입
		//				   사용자로부터 입력값을 받아서 초기화
		//				   시작과 동시에 연결 => 서버 구동, 화면 UI, 데이터베이스 연동 할 때 많이 씀
		//				   생략이 가능 => 자동으로 컴파일러가 추가
		System.out.println("이름:"+seo.name);
		System.out.println("학년:"+seo.year);
		System.out.println("학과:"+seo.subject);
		
		System.out.println();
		
		// 2. 학생 생성
		Student lee=new Student();
		// 변경
		lee.name="이다훈";
		lee.year=3;
		lee.subject="의예";
		System.out.println("이름:"+lee.name);
		System.out.println("학년:"+lee.year);
		System.out.println("학과:"+lee.subject);
		
		System.out.println();
		
		// 3. 학생 생성 => park => 박문수, 1, 파이썬
		Student park=new Student();
		park.name="박문수";
		park.year=1;
		park.subject="파이썬";
		System.out.println("이름:"+park.name);
		System.out.println("이름:"+park.year);
		System.out.println("이름:"+park.subject);
	}

}
