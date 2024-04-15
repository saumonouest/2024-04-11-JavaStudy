import java.util.*; //자바에서 지원하는 라이브러리를 읽어 오는 거임~ 아항~
public class 연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 변수 지정 시 int a=100
		
		// 변수 선언
		int num1,num2; // 이 상태에서 사용 시 오류 > 변수는 초기화를 해야 사용 가능(값 지정)
		// 초기화 
		
		Random r=new Random();
		// 임의의 수를 추출
		num1=r.nextInt(101); //0~100까지 사이의 정수 추출 => 마지막 제외
		num2=r.nextInt(101);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2); //새고할 때마다 숫자 바뀜
		
		// 더하기 연산 +
		int plus=num1+num2;
		System.out.println("plus="+(num1+num2));//최우선 순위 연산자에 괄호 붙이기, 여기서 괄호 안 하면 전체 문자 취급행
		//System.out.println(5+5*10); //55
		//System.out.println((5+5)*10); //100
		int minus=num1-num2;
		System.out.println("minus="+minus);
		
		int gop=num1*num2;
		System.out.println("gop="+gop);
		
		int a=10;
		int b=3;
		System.out.println(a/(double)b); //(a/b)일 때는 3, (a/(double)3)일 때는 3.3333333
		//int => double로 변경 (double)변수명=> 데이터형 변경
		//값이 있는 경우 => .0 
		
		System.out.println(a%b); //1
		System.out.println(a%-b);
		System.out.println(-a%b);
		System.out.println(-a%b);
		

	}

}
