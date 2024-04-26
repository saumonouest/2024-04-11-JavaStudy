/*	중첩 for => 반복문 : 웹에서는 사용 빈도가 거의 없음
 *	1) 코딩 테스트 / 정보처리
 *	2) 솔류션
 *
 *	중첩 
 *	---
 *		조건문
 *		if() = 1차 {
 *		}
 *		선택문
 *		switch(){
 *		case : 
 *			switch{
 *			}
 *		}
 *
 *		반복문 : 주로 => for
 *		for() { -------------> 줄 수
			for() {-----------> 출력 갯수
			}
		}
		1번째 줄 ==> 5
		2번째 줄 ==> 4
			.	.	.
 *		형식) 	false 되면 종료
 *			for(초기값;조건식;증가식) {
 *					true 조건
 *				for(초기값;조건식;증가식) {  < 여기서 false 되면 다시 위에 걸로 이동
 *					true 되면 문장 수행
 *				}
 *			}
 *
 *		(e.g.)
 *			1. 몇 줄 출력 : 세로
 *			2. 출력은 몇 개 : 가로
 *			for(int i=1;i<=3;i++){ => 종료시에 for 끝난다
 *				for(int j=1;j<=3;j++){
 *				}
 *			}
 *			i=1 => j=1 j=2 j=3 => i증가
 *			i=2 => j=1 j=2 j=3 => i증가
 *			i=3 => j=1 j=2 j=3 => i증가
 *			i=4 => 종료
 */
public class 중첩_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) { // 줄 수 => for 횟수는 25
			for(int j=1;j<=5;j++) { //출력
				System.out.println("i="+i+",j="+j); // 실제 출력물은 2차
			}
			System.out.println();
		}
		/*
		 * i=1 => j=1 j=2 j=3 j=4 j=5
		 * i=2 => j=1 j=2 j=3 j=4 j=5
		 * i=3 => j=1 j=2 j=3 j=4 j=5
		 * i=4 => j=1 j=2 j=3 j=4 j=5
		 * i=5 => j=1 j=2 j=3 j=4 j=5
		 * 
		 */
	}

}
