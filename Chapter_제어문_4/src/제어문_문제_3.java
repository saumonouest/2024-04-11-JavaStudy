/*
 * 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 * for(int i=2;i<=100;i+=2)
 * 
 * for => 반복문 => 반복횟수가 있는 경우에 주로 사용
 * 
 * 1)형식
 * 		for(초기값;조건식;증가식) => 정수, 문자
 * 		{
 * 			반복 실행 문장
 * 		}
 * 2)순서
 * 3)초기값 : 시작점 => int i=0, int i=1, int i='A' . . .
 * 4)조건식 : 어디까지 출력(범위)
 * 5)증가  : 몇 씩 증가할 건지
 */

public class 제어문_문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		/*
		 *  수열이 아닌 경우에는 for문을 사용할 수 없다
		 *  
		 */

	}

}




