/*	절차적 언어 
 * 	=> 순차적으로 명령문 (한줄씩 번역)
 * 		=> 재사용 / 수정 / 추가
 *	=> 메소드 : 기능별 나눠서 처리
 *		=> 변수가 메소드 안에서 사용 => 리턴형 / 매개변수 => 고려
 *	=> 전역변수 => 전체 메소드에서 사용하는 변수 => 리턴형 / 매개변수는 고려하지 않는다
 *	   -----
 *		지역 변수 => 매개변수 포함 => 메소드 블록 => 메소드 종료시 사라짐
 *		전역 변수 => 클래스 블록 => 프로그램 종료시에 사라진다
 * 	------------------------------------------------------------------------------
 *	전역 변수 : a, b
 *	지역 변수 : c, d, e
 *
 *	aaa()
 *	=> a
 *	=> b
 *	=> c
 *	
 *	bbb()
 *	=> a
 *	=> b
 *	=> d
 *
 * 	ccc()
 * 	=> a
 * 	=> b
 *  => e
 *  
 *     출력 할 거 => 필요한 거 
 *  1.  년도/월  => year / month
 *  2.   요일   => year / month / week / i
 *  3.   출력   => year / month / week / i < 루프 변수(지역 변수)
 *  
 */
import java.util.*;
/* 문법 => C
 * 메소드 => C++
 * 전역변수 => 메소드 => 자바
 */
// 문법 => 메소드(재사용) => 실제 프로그램(객체 지향) => 전역 변수(멤버 변수, 공유 변수)
// 기술면접 => 5장
public class 달력만들기_절차적언어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 입력 => default => Date 
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year=scan.nextInt();
		
		System.out.println("월 입력 : "); // final 
		int month=scan.nextInt();
		
	
		// 2. 요일 구하기 => 사용자 정의 / 라이브러리 
		Calendar cal=Calendar.getInstance();
		// Calendar 클래스 메모리 할당 / 추상 클래스는 new 사용 못해서 Calendar.getInstance 쓴 거임
		// 추상 클래스
		cal.set((Calendar.YEAR),year);
		cal.set((Calendar.MONTH),month-1); // 0번부터
		cal.set((Calendar.DATE),1);
		
		// 요일
		int week=cal.get(Calendar.DAY_OF_WEEK); // 1번부터
		
		// 마지막날
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		
		// 3. 달력 출력 
		String[]strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도"+month+"월");
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday;i++) {
			if(i==1)// 시작 시 요일까지 공백 출력
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				System.out.println();
				week=0;
			}
		}
	}
}
