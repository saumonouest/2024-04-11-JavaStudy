/*
 *	1 ~ 100 사이의 
 *		=> 짝수의 합
 *		=> 홀수의 합
 *		=> 전체 합 
 */
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,even=0,odd=0; // 합 구하기 
		int ecount=0,ocount=0;// 갯수 구하기 ecnt,ocnt 가능
		// 초기값
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{	
				even+=i; //짝수값 누적  => 복합대입연산자
				ecount++; // 갯수 확인 => 단항연산자 
			}
			else 
			{	
				odd+=i; //홀수값 누적
				ocount++; //갯수 확인
			}
			sum+=i; //전체합 누적
			
		}
		System.out.println("1~100 사이의 짝수 합="+even);
		System.out.println("1~100 사이의 짝수의 갯수="+ecount);
		System.out.println("1~100 사이의 홀수 합="+odd);
		System.out.println("1~100 사이의 홀수의 갯수="+ocount);
		System.out.println("1~100 사이의 전체 합="+sum);
	}

}
