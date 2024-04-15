/*
 *	형변환 연산자 
 *	----------(데이터형) => boolean은 제외
 *		|
 *	Upcasting => 데이터형을 크게 만든다 
 *	Downcasting => 데이터형을 낮게 
 *			=========> Upcasting
 *	byte < char < int < long < float < double
 *			<========= Downcasting
 *
 *	예) 
 *		'A' => char 
 *		(int)'A' => int => 65
 *		=> Upcasting
 *
 *		10.5 => double
 *		(int)10.5 => int => 10
 *		=>Downcasting
 *		
 *
 */
public class 연산자_단항연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환 (데이터형) => (int),(double),(char) . . .
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(98);
		System.out.println((char)98);
		
		System.out.println(10.5);
		System.out.println((int)10.5);
		
		/*
		 *	10.5+10.5 => 21.0
		 *	(int)(10.5+10.5)
		 *		  ---------
		 *			21.0 => int ==> 21
		 *
		 *	(int)10.5+(int)10.5
		 *	--------  ----------
		 *     1		   2
		 *     		--3
		 *	> 20 
		 *
		 *	double d=123456.78
		 *	int i=123456
		 *	(int)((d-i)*100)
		 *	> 77 . . . . . ? . . . . . .
		 *	비트가 다르면 나머지 소수점을 .9999로 채우기 때문에...
		 *	그래서 float으로 하면 78이 나옴... 
		 *	비트가 맞기 때문...
		 *
		 *
		 * float d=123456.78f; int i=123456; System.out.println((int)((d-i)*100));
		 */
		 int rand=(int)(Math.random()*100)+1; // 1~99까지 사이에 발생하는 난수
		 //				-------------0.0 ~ 0.99 => 난수 1
		 //				-------------0.0 ~ 99.0 => *100 => 게임, 예약일. . .
		 //		  ----- 0~99 => int 변환 
		 //							    1~100 => +1
		 System.out.println("rand="+rand);
		
	}

}
