//출력 형식
/*
 * = System.out.println()
 * 					=====ln() => new line
 *   System.out.print("Hello")
 *   System.out.print("java")
 *   Hello
 *   java
 *   
 * = System.out.print() ===> 옆으로 출력
 *   System.out.print("Hello")
 *   System.out.print("java")
 *   Hello java
 *   
 * = System.out.printf()
 *   서식이 있는 출력
 *	%d => 정수
 *	%f => 실수
 *	%c => 문자
 *	%s => 문자열
 *
 *	=자바에서 표현법
 *	정수표현법
 *		= 10진법(0~9) 10, 20 . . . . .
 *		= 8진법 (0~7) 010 = 8 => 앞에 0 붙임 *달력이나 시간 쓸 때 주의해서 쓸 것
 *		= 16진법(0~15)0x10 =16 => 앞에 0x 붙임, 색상에 많이 씀
 *		= 2진법 (0~1) 0b10 => 앞에 0b 붙임
 *=====================================================================
 *	실제 표현 예시
 *		10, 	10L 	=> 64bit (long)*숫자는 똑같고 메모리 용량이 다른 거임 
 *		int,	long
 *		범위가 다름 long이 더 큰 숫자까지 쓸 수가 있으니까 보통 은행이나 증권가에서는 long 형을 쓰는 거임
 *=====================================================================
 *
 *	실수표현법 => 10.5 , 10.5F
 *			10.5 -------- 저장하는 메모리 크기 => 64bit
 *			10.5F-------- 32bit(4byte) 1byte => 8bit 
 * 			bit에는 0 아니면 1만 들어감 8개 들어갔다는 뜻임
 * 		
 *	문자표현법 => 'A' => 한글자만 사용이 가능
 *	문자열표현법 => "Hello" => 여러 문자 사용이 가능
 *
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"서연우\""); //"서연우" => 명령문이 종료하면 반드시 세미콜론(;)
		System.out.println("c:\\javaDev\\movie.txt"); //경로나 텍스트 자체에 따옴표 넣고 싶을 때 역슬러시 두 개! 
		// "}" 이거 아랫줄에 쓰는 거 아니고 맨 끝줄에 넣기
		
		// e.g. 서연우 여자 *가운데 공백을 원하면 역슬러시 + t (\t)
		System.out.println("서연우\t여자");
		
		// e.g. 서연우 여자 *다음줄 출력을 원하면 역슬러시 + n (\n)
		System.out.println("서연우\n여자");
	
		// e.g. 서연우 여자 30 다 다른 줄 print를 사용하여 띄어쓰기를 원할 때
		System.out.print("서연우\t");
		System.out.print("여자\t");
		System.out.print("30\n");
		
		/* 아래 그대로 출력하고 싶을 때~ 어케 할 거임~
		 * ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 */
		System.out.println("★\n★★\n★★★\n★★★★\n★★★★★");
		System.out.println("★");
		System.out.println("★★");
		System.out.println("★★★");
		System.out.println("★★★★");
		System.out.println("★★★★★");
		
		/* i	j	i=j ==> j=i
		 * 줄수 별표
		 * 1	1
		 * 2	2
		 * 3	3
		 * 4	4
		 * 5	5
		 * 
		 * 줄수 별표 ==> 역순이면 더한다
		 * 1	5	i+j=6 ==>j=6-i
		 * 2	4
		 * 3	3
		 * 4	2
		 * 5	1
		 * 
		 */
		
		  for(int i=0;i<=5;i++){ for(int j=0;j<=5-i;j++) { System.out.print("*"); } }
		 //컨트롤 쉬프트 슬러스 = 주석 걸 때, 컨트롤 쉬프트 역슬러시 = 주석 풀 때
		
		 System.out.println("10 20 30 40 50");
		 System.out.printf("%-3d%-3d%-3d%-3d%-3d%-3d",10,20,30,40,50);
		// 서식을 가지고 출력할 때 프린트에프~
		//"-"를 붙이면 왼쪽 정렬 안 붙이면 오른쪽 정렬
		// 3이 뭐냐면 두 글자 가져오는데? 3개 들이라고? 뭐라는...
		// 000
		// 10 => +
		//10  => -
	}
}
