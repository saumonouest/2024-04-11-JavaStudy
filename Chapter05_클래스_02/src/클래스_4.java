// 초기화 블록 => 자동 호출 클래스 블록 안에 {}
import java.util.Scanner;
class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
	
	
	
	// 초기화 => 파일 읽기, 라이브러리, 데이터베이스 연결 => {} 구현 => 자동으로 읽어서 출력
	{
		/*sabun=1;
		name="서연우";
		dept="개발부";
		job="대리";
		loc="용산";
		pay=3600;*/
		for(int i=0;i<10;i++){ // 제어문이나 연산자 사용이 블록 안에 넣어서 사용
			sabun=i;
		}
	}
	
	
	/* 생성자
	 *	=> 멤버변수의 초기화
	 *	=> 메모리에 저장 시에 호출되는 메소드
	 *	=> 모든 클래스에 1개 이상 존재 
	 *	=> 없는 경우에는 자동으로 추가
	 *	특징 
	 *	=> 리턴형이 없다
	 *	=> 클래스명과 동일
	 *	=> 생성자는 여러개인 경우도 있다
	 */
//	____생성자가 아니라 일반 메소드임
	void Sawon() {
		// 클래스명과 동일
	}
	/*	생성자 => 생성자는 반드시 호출 시에 new 생성자()의 형식
	 *	기본 초기값 = 명시적 초기화 = 초기화 블록 = 생성자
	 *							ㄴstatic{}
	 *				----------------------------- 보통은 생성자를 주로 사용한다
	 *	class A
	 *	{
	 *		int a=10;
	 *		{
	 *			a=100;
	 *		}
	 *		A()
	 *		{
	 *			a=200;
	 *		}
	 *	}
	 *	A aa=new A();
	 *	---- aa ----
	 *	0x100
	 *	------------ 0x100
	 *					----------------
	 *					----- a -----
	 *					0 => 10 => 100 => 200
	 *					-------------
	 *					----------------
	 *	관련된 데이터가 여러개 저장시에는 => 메모리 주소를 이용해서 접근한다 => 참조 변수 : 배열 / 클래스
	 *	
	 *	일반 1개의 변수만 이용
	 *	** 객체 지향 프로그램 : 
	 *		여러개의 데이터 + 여러개의 메소드를 한 곳에 저장한 후에 동시에 제어
	 *		-------------------------- 저장 공간을 객체
	 *											---- 한번에 기능을 만들어서 사용
	 *													1. 재사용 
	 *													2. 수정 / 추가 편리
	 *													3. 데이터를 보호
	 * 
	 */
	Sawon(){ // 이게 생성자임

		Scanner scan=new Scanner(System.in);
		System.out.println("사번 입력:");
		sabun=scan.nextInt();
		System.out.println("이름 입력:");
		name=scan.next();
		System.out.println("부서 입력:");
		dept=scan.next();
	}
}
public class 클래스_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon seo=new Sawon(); // 저장 => 메모리 공간 (sabun, name, dept, job, loc, pay. . )
		System.out.println("사번:"+seo.sabun);
		System.out.println("이름:"+seo.name);
		System.out.println("부서:"+seo.dept);
		
	}

}
