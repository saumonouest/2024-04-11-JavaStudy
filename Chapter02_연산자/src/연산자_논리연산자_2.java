/*
 *	점수 >=60 <=100 - true 
 
 */
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*100)+1; //1~100 난수 발생
		System.out.println("난수값:"+score);
		
		boolean bCheck=(score>=60) && (score%2==0);
		//							   ------- 짝수 조건
		//System.out.println(bCheck);
		//score가 40 이상이고, score가 홀수라면
		bCheck=(score>=40) && (score%2==1); //(score%2!=0) 도 가능, boolean을 또 주면 안 됨
		//boolean을 또 쓰려면 이름 바꾸면 됨 e.g. bCheck1
		//재사용 => 데이터형을 사용하지 않고 변수만 사용
		System.out.println(bCheck);
		
		int a=10;
		a++;
		a=100;
		a++;
		a=200;
		a++;
		a=300; //여기서 300으로 바꿔서 마지막 값이 299인 거임
		a--;
		System.out.println(a);
		//변수 => 필요시마다 변경해서 사용 가능
		//main이 종료시까지 메모리가 유지
		
	}

}
