/*
 *	비교연산자 => 숫자에서만 사용이 가능(문자열은 비교가 불가능)
 *	X "aaa"=="aaa" => equals()
 *	***비교연산자는 결과값이 => true / false 만 나옴 = 조건문에서 주로 사용
 *
 *	== 같다 
 *		자바스크립트 (===)
 *		오라클 (=)
 *	! 같지않다
 *	< 작다 (기준점 : 왼쪽)
 *	> 크다 
 *	<= 작거나 같다 <,== 로도 씀
 * 	>= 크거나 같다 >,==
 * 
 * 	6==7 > false
 * 	6!=7 > true
 * 	6>7  > false
 * 	6<7  > true
 *  6<=7, 6<7 6==7 > true
 *  6>=7, 6>7 6==7 > false
 *  
 *	==> char
 *	'A'=='B' 'A'!='B'....
 *	
 *	1) 단항연산자 / 산술연산자 / 비교연산자 / 대입연산자 / 논리연산자 / 형변환
 *		변수 / 연산자 / 제어문 => 나머지는 묶음 얘네한테 프로그램이 달려있다 . . . 중요. . .
 *	
 *		
 */
public class 연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수비교
		int a=(int)(Math.random()*100)+1; // 1~100 사이의 임의의 수를 추출
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a+",b="+b);
		System.out.println("====== 비교 ======");
		
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b)); //a<b || a==b 둘 중 하나가 true면 true
		System.out.println("a>=b:"+(a>=b)); //a>b || a==b ==> 44page
		
		System.out.println("====== 알파벳 비교 ======");
		char c=(char)((int)(Math.random()*26)+65); //알파벳 추출 시 사용
		//					-------------1 0~25+65 > 65~90
		//								----2
		//			  ----3
		//			  						----4
		//		-----5	  						
		System.out.println("c="+c);
		
		char d=(char)((int)(Math.random()*26)+65); //자주 나오니까 잘 기억해두기~
		System.out.println("c="+c+",d="+d);
		
		System.out.println("c==d:"+(c==d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
		
		
		/* char d=(char)((int)(Math.random()*26)+97); 
		 * 이거는 65를 더하면 대문자로 나오고 97을 더하면 소문자로 나옴
		 * 97이 'a' 이기 때문~
		 * */
		
		

	}

}
