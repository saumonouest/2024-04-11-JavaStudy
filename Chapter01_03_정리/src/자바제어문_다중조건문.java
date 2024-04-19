import java.util.Scanner;
/*
 *	다중 조건문 형식)
 *	if(조건문){
 *		조건이 true 일 때 처리문장 ==> 종료
 *			  ㄴfalse 일 때 아래문장
 *	}		  
 *	else if(조건){
 *		조건이 true 일 때 처리문장 ==> 종료
 *	}
 *	else if(조건){
 *		조건이 true 일 때 처리문장 ==> 종료
 *	}
 *	else{
 *		조건에 맞는 문장이 없는 경우 => default => 생략 
 *	}
 *
 *	==> 다중 조건문은 1개의 문장만 수행
 *		------- 전체를 수행하지 않을 때도 있다 => else 가 없는 경우
 *	==> 메뉴 선택 / 화면 변경(페이지 이동)
 *	==> 브라우저에서 1개만 실행 => include => CardLayout
 */
public class 자바제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;) // 무한루프
		{
			System.out.println("=====메뉴=====");
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 상세");
			System.out.println("3. 영화 검색");
			System.out.println("4. 영화 추천");
			System.out.println("5. 영화 예약");
			System.out.println("6. 종료");
			System.out.println("=============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				System.out.println("영화 목록 출력 . . .");
			}
			else if(menu==2) {
				System.out.println("영화 상세 보기 출력 . . .");
			}
			else if(menu==3) {
				System.out.println("영화 검색 목록 출력 . . .");
			}
			else if(menu==4) {
				System.out.println("영화 추천 목록 출력 . . .");
			}
			else if(menu==5) {
				System.out.println("영화 예약하기 . . .");
			}
		}
	}

}
