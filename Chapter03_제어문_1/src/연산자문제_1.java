/*
 *	조건문 => 비교연산자, 논리연산자, 부정연산자
 *			-------if
 *	통계 / 분석 / 누적 ==> 산술연산자
 *	횟수구하기 / 조회수 증가 ==> ++
 *	결과값 읽기 => 대입연산자
 *	---------------------------------
 *
 *	1) 
 *		int a=10;
 *		=> 한 개 증가
 *			a++
 *			+aa
 *		
 *		   여러개 증가 		
 *			a=a+1
 *			a+=1
 *	
 *	2) % => 달력 (윤년), 숫자 분리
 *	3) +, -
 *		+ : 문자열 결합 . . . 
 *		+= : 빈도수, 석차  . . .
 *		------------------------------ 1. 인기 순위 2. 실시간 그래프 . . .
 * 
 * 
 * 
 *	프로그램
 *	1. 변수 선언 => 데이터 저장 공간 확보 => 메모리
 *	2. 변수의 초기화
 *	------------------------------------- 선언 + 초기화
 *	int a
 *	a=10;
 *	int a=10;
 *
 *	3. 사용자 요청에 대한 처리
 *		=> 연산처리 / 제어문
 *	------------------------------------- 웹, 일반 자바, 모바일 동일
 *	4. 처리된 결과를 출력 (브라우저, 핸드폰, 윈도우) 
 */
import java.util.Scanner;
public class 연산자문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//코딩 순서
		// 1. 변수 선언
		   {// 1번 문제
			   int a;   
		   int b;   
		// 2. 초기화
		   a=3;   
		   b=a+5;       
		   System.out.printf("a의 값: %d \n", a);
		   //
		   //
		   // %d => 정수값 첨부
		   // %f => 실수값 첨부 => %.2f ==> 실수 출력 소수점 2자리 출력
		   // %c => 문자 첨부
		   // %s => 문자열 첨부
		   // 출력형식을 만들어서 처리 ==> printf() ==> C언어의 출력형식 도입
		   System.out.printf("b의 값: %d \n", b); 
		   }
		   
//------------------------------------------------------------------------------		   
		   
		   {// 2번 문제
		   /*	+ 용도가 2개
		   *		실제 산술연산
		   *		문자열 결합
		   			System.out.println("국어점수:"+kor)
		   */
			int a, b;  
		    a = 6;  
		    b = 2;   
		    System.out.printf("덧셈 연산 결과: %d \n", a+b);  
		    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  
		    System.out.printf("곱셈 연산 결과: %d \n", a*b);  
		    System.out.printf("나누기 연산 결과: %d \n", a/b);
		    // 0으로 나눌 수 없다 ==> 반드시 0이 입력이 된 경우에 처리
		    //정수 / 정수 = 정수
		    // 5/2=2, 10/3=3
		    System.out.printf("나머지 연산 결과: %d \n", a%b);
		    // % > 배수
		    //		코딩 => 화폐매수 구하기, 숫자 분리 / 나머지 값은 왼쪽 부호 따라간다
			int money=369;
			// 100자리 몇 개
			int won100=money/100;
			
			// 10자리 몇 개
			int won10=(money%100)/10;
			
			// 1자리 몇 개
			int won1=money%10;
			
			System.out.println("100원 동전:"+won100); //3 
			System.out.println("10원 동전:"+won10); //6
			System.out.println("1원 동전:"+won1); //9
			
			// 윤년 구하기
			Scanner scan=new Scanner(System.in);
			int year=scan.nextInt();
			if((year%4==0 && year%100!=0)||(year%400==0))
			{
				System.out.println(year+"년도는 윤년입니다");
			}
			if(!((year%4==0 && year%100!=0)||(year%400==0)))
			{
				System.out.println(year+"년도는 윤년이 아닙니다");
			}
		   }

		   
//------------------------------------------------------------------------------		   		   
		   {	//3번문제
			   int num1, num2;   
			      num1 = 10/3; // 정수 / 정수 = 정수 
			       // '몫' 출력   
			      num2 = 10%3;
			       // '나머지' 출력
			   System.out.printf("      몫: %d \n", num1);   
			   System.out.printf("나머지: %d \n", num2); 
		   }
		
		   
//------------------------------------------------------------------------------		   
		   { //4번 문제 (대입 연산자 문제)
			   int num1=1, num2=2, num3=3, num4=4, num5=5;     
			     num1 = num1 +    num2; //3 = num+=num2
			     num2 = num2 - 2;      //0  = num2-=2
			     num3 = num3 * 2;     //6	= num3*=2
			     num4 = num4 / 2;     //2	= num4/=2
			     num5 = num5 % 2;     //1	= num5%=2
			     System.out.printf("%d, %d, %d, %d, %d \n",num1,num2,num3,num4,num5);   
		   }
	
		   
		   
//------------------------------------------------------------------------------		   
		   { //5번 문제 (증감 연산자) ---- ++. --	  : 제어문 > 반복문, 횟수 구하기, 크롤링
			 // 무조건 증가, 감소 (1씩)
			   int num1=10;   
			      System.out.printf("%d \n", num1); //10
			      num1++; 
			      System.out.printf("%d \n", num1); //11
			      ++num1; 
			      System.out.printf("%d \n", num1); //12
			      --num1; 
			      System.out.printf("%d \n", num1); //11
			      num1--; 
			      System.out.printf("%d \n", num1); //10
			      char c='A';
			      System.out.println(c++); //출력하고 나중에 증가
		   }
		   
//------------------------------------------------------------------------------		   		   
		   { //6번 문제 
			   int num1=10, num2=10;   
		       int a, b;   
		       a = ++num1; //a=11, nun=11
		       // 뭐가 먼저냐. 대입이냐 증가냐
		       // 앞에 연산자가 붙어 있으면 전체 연산자~ 먼저 증가해라~ 
		       // 증가된 값을 대입
		       
		       b = num2++; //b=10, num=11
		       // 후치연산자 => 대입 먼저 하고 나중에 증가해라~
		       
		       System.out.printf("%d, %d \n", b, num2); 
		   }
		   
		   
		   
//------------------------------------------------------------------------------		   		   
		   { // 7번 문제
			   int num1=10, num2=10;   
		        int a, b;   
		        num1 = num1 + 1; //=> num+=1 : num1++
		        a = num1; //11
		        System.out.printf("%d, %d \n", a, num1); //11,11 
		        b = num2;	//b=10
		        num2 = num2 + 1; 
		        System.out.printf("%d, %d \n", b, num2); //b=10,11 

		   }
//------------------------------------------------------------------------------		   		   	
		   {//번외
			   for(int i=1;i<=10;i++)
			   {
				   System.out.println(i);
			   }
		   }
//------------------------------------------------------------------------------	
		   {//8번 문제
			   int num1=10, num2=10;
			   //num1=10 ==> ++
			   //num1=11
			    System.out.printf("%d \n", ++num1); //출력 전에 증가 => 출력 //num1=11
			    System.out.printf("%d \n", num1); //11
			    System.out.printf("%d \n", num2++); //출력 후에 증가 //num2=10
			    System.out.printf("%d \n", num2);
		   }
	
//------------------------------------------------------------------------------		
		   {//10번 문제
			   int num1 = 2;
			    int num2 = 7;
			    int num3; //=1
			    int num4; 
			    num1++; //=2 증가 안 됨
			    //여기서 증가 됨 num1=3
			    num3 = --num1; //num3=2 
			    --num2; //num2=6
			    num4 = num2++; //6 여기서 증가 안 됨
			    //여기서 증가 됨
			    System.out.printf("%d\n", num3); //2
			    System.out.printf("%d\n", num4); //6 

		   }
	
//------------------------------------------------------------------------------			
		   {//11번 문제
			   int i=0;
			   int re = 0;
			   i=3;
			   re = ++i; //re=4. i=4
			   System.out.println("re:"+re + ", i:"+i); //re:4,i:3
			   i = 3;
			   re = i++; //re=3 //i=4
			   System.out.println("re:"+re + ", i:"+i); //re:4, i:3
		   }
	
//---------------------------------------------------------------------------
		   {//12번문제
			   Scanner scan=new Scanner(System.in);
					   System.out.println("두개의 정수 입력(10 20):");
					   int num1=scan.nextInt();
					   int num2=scan.nextInt();
					   System.out.println("=====결과값=====");
					   //System.out.println(num1+"-"+num2+"="+(num1-num2)); 아래거랑 같은 거임
					   System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
					   //System.out.println(num1+"*"+num2+"="+(num1*num2)); 아래거랑 같은 거임
					   System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
					   // dos에서만 사용
					   //+, - 연산 순위가 동일
					   //* => + 보다 연산 순위가 우선
		   }
//----------------------------------------------------------------------------------
		   {//13번 문제
			   Scanner scan=new Scanner(System.in);
			   System.out.println("세 개의 정수를 입력(10 20 30):");
			   int num1=scan.nextInt();
			   int num2=scan.nextInt();
			   int num3=scan.nextInt();
			   System.out.println("=====결과값=====");
			   System.out.printf("%d * %d + %d = %d", num1,num2,num3,(num1*num2+num3));
		   }
//------------------------------------------------------------------------------------
		   {//14번 문제
			   int num1=(int)(Math.random()*100)+1;
			   int num2=(int)(Math.random()*100)+1;
			   System.out.println("=====결과값=====");
			   System.out.printf("%d %% %d = %d\n" ,num1,num2,num1%num2);
			   					   //--//이미 수식에 퍼센트 있으면 두 번 주기	
		   }
	
	
	}

	}
