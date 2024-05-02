/*	클래스 
 *	1. 사용자 정의 데이터형 : 데이터만 모아서 관리
 *						----- 다른 데이터를 모아서 관리
 *	2. 액션 클래스 : 메소드를 여러개 모아서 관리
 *
 *	** 클래스는 한 개에 대한 정보
 *	class 사원 {
 *		이름
 *		부서
 *		근무지
 *		입사일
 *		직위
 *		연봉
 *		성과급
 *		. . .
 *	}	
 * 
 * 	class 학생 {
 * 		이름
 * 		학년 int 
 * 		학점 char
 * 		주소 String. . .
 *		. . .
 *	}
 */
// 데이터형 => 형변환 
// 개발자마다 다르다(프로그램에 맞게 개발)
class Student{ //(여기서는 Student가 데이터형)
	String name;
	int age;
	String school_name; //static 붙이면 하나만 생성됨
}
// => 저장
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student	seo=new Student();
		seo.name="서연우";
		seo.age=30;
		seo.school_name="보성여고";
		// name, age, school_name
		Student	lee=new Student();
		lee.name="이다훈";
		lee.age=34;
		lee.school_name="서울고";
		// name, age, school_name
		Student	han=new Student();
		han.name="한희경";
		han.age=59;
		han.school_name="보성여고";
		// name, age, school_name
		
		System.out.println("===== seo 영역 =====");
		System.out.println("이름: "+seo.name);
		System.out.println("나이: "+seo.age);
		System.out.println("학교: "+seo.school_name);
		
		System.out.println("===== lee 영역 =====");
		System.out.println("이름: "+lee.name);
		System.out.println("나이: "+lee.age);
		System.out.println("학교: "+lee.school_name);
		
		System.out.println("===== han 영역 =====");
		System.out.println("이름: "+han.name);
		System.out.println("나이: "+han.age);
		System.out.println("학교: "+han.school_name);
	}

}
