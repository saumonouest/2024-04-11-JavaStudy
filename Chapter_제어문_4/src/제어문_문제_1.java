//1)100점 만점으로 성적을 입력 받아 
/*90~100이면 A,
 * 80~89이면 B,
 * 70~79이면 C, 
 * 60~69이면 D, 
 * 60점 이하면 F를 출력하라 (switch~case 사용)
 *
 *
 *	switch ~ case : 선택문
 *	--------------------
 *	if문의 조건문과 다르게 case를 사용 => case에 사용할 수 있는 것 : 정수 / 문자 / 문자열
 *	=> 값을 한 개 지정
 *	=> 값이 입력 => switch에 값을 받는다
 *		switch(op)
 *	=> case 처음부터 검색
 *	=> 해당 문자, 정수를 찾아서 문장을 수행
 *	=> case를 찾아서 처리하고 break가 없는 경우에는 break가 존재하는 곳까지 문장 수행
 *		int a=3;
 *		switch(a)
 *		{
 *		case 1:
 *			문장1
 *		case 2:
 *			문장2
 *		case 3:	==> 시작
 *			문장3  ==> 종료하지 않는다(브레이크 없어서) 브레이크 있는 곳까지 수행하고 나가는 거임
 *		case 4: ==> 수행
 *			문장4
 *			break;
 *		case 5:	==> 수행	=> 문장3 문장4
 *			문장5
 *		}
 *	**찾은 케이스부터 브레이크가 있을 때까지 수행
 *	**해당 케이스가 없는 경우에는 디폴트 수행 (생략 가능) => 케이스마다 브레이크
 *	**브레이크는 스위치 케이스를 종료
 *
 *	** 보통 프로그램에서는 if를 많이 사용
 *		경우의 수가 많은 경우에는 스위치 케이스를 주로 이용(게임,메뉴)
 *		스위치가 if보다 간결
 *
 *	** if => 범위가 있는 경우
 *		if(score>90 && score<=100)
 *	** 값이 한 개씩 여러개인 경우 => 스위치
 *		switch(score)
 *		{
 *		case 100: case:99 case 98: . . . // 10으로 나눠쓴다
 *		}
 *
 *	switch(정수,문자,문자열)
 */
import java.util.Scanner;
public class 제어문_문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score;
		while(true)
		{
			System.out.print("0~100 사이의 정수 입력:");
			score=scan.nextInt();
			if(score<0 || score>100)
			{
				System.out.println("다시 입력하세요");
				continue;
			}
			break;
		}
		switch(score/10)
		{
		case 10:
		case 9: //10,9를 동시에 처리
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
		
		
		}
	}
}
