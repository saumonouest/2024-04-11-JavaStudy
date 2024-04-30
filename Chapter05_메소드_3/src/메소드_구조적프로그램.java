/*	소스가 많은 경우 => 나열(X) => 기능별 분리
 * 	문장 => 단락을 나눠서 처리
 *	----------------------------------
 *	오류 => 해당 메소드만 찾는다
 *	수정하기 편리
 *	---------------------------------- 구조적인 프로그램
 *	메소드
 *		= 재사용 => 다른 클래스와 연결
 *		  ---- 1. 신뢰성이 높음 (검증된 상태)
 *			   2. 소스량 줄일 수 있다
 *			   3. 개발 속도가 빠르다 (조립 => 약간의 수정)
 *
 *		= 반복 제거
 *			같은 내용 소스 코딩 => 한 개 통합
 *			수정하기 편리하다
 *			== 개발 / 유지보수
 *				SI / SM
 *
 */
import java.util.*;
public class 메소드_구조적프로그램 {
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		
		System.out.println("국어 입력: ");
		int kor=scan.nextInt();
		
		System.out.println("영어 입력: ");
		int eng=scan.nextInt();
		
		System.out.println("수학 입력: ");
		int math=scan.nextInt();
		
		System.out.println("물리 입력: ");
		int p=scan.nextInt();
		
		System.out.println("역사 입력: ");
		int h=scan.nextInt();
		
		System.out.println("화학 입력: ");
		int ch=scan.nextInt();*/
		
		int k=input("국어");
		int e=input("영어");
		int m=input("수학");
		int p=input("물리");
		int h=input("역사");
		int ch=input("화학");
	}

}
