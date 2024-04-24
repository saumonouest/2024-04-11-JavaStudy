/*1) int[] n = {1, 2, 3, 4, 5};
 *2) int n[] = {0};
 *3) int[] n = new int[3];
 *4) int n[3] = new int[3];
 * 배열 => 변수 여러개 모아서 한 개 이름으로 제어
 * 						----
 * 						변수 => 인덱스 번호로 구분한다
 * 		=> 고정적 => 데이터 추가, 데이터 삭제 불가능
 * 			=> 선언한 갯수만큼만 사용이 가능
 * 				** 갯수를 늘리는 경우 : 새로운 배열을 생성(크게)
 * 				=> 데이터 복사 후 사용 arraycopy(), for . . .
 * 	
 * 		=> index를 이용하기 때문에 제어문 사용 편리
 * 			=> index는 0부터 순서적으로 되어있다
 * 		
 * 		=> 선언
 * 			데이터형[]배열명; : 권장
 * 			데이터형 배열명[];
 * 			----- 맞는 데이터만 첨부 가능 => 같은 데이터형 모음, 사용용도가 같을 때 
 * 			예) 이미지, 제목, 조회수 . . . => 인덱스 번호만 참조
 * 
 * 		=> 초기화
 * 			배열명=new 데이터형[]{} => 초기화 
 * 			선언과 동시에 초기화
 * 			데이터형[] 배열명={값. . . .}
 * 			데이터형[] 배열명=new 데이터형[갯수] => 임의로 초기화(자동)
 * 		
 * 		=> 배열의 갯수확인
 * 		   배열명.length
 * 
 * 		=> 배열 한 개씩 사용
 * 		   배열명[인덱스]=값
 * 		   읽기 : 배열명[인덱스] 
 * 				 ---------- 일반 변수와 동일시
 * 			int a=10,b=10,c=10;	
 * 			-------------
 *				10 ==> a 
 * 			-------------
 * 				20 ==> b
 * 			-------------
 * 				30 ==> c  => c=40(30=>40)
 * 			-------------
 * 			
 * 			int[] arr={10,20,30}
 * 			arr -----> -----------------------
 * 						 10		 20 	 30
 * 					   -----------------------
 * 						arr[0]	arr[1]	arr[2]
 * 						 a		b		c      => arr[2]=40
 * 
 * 
 * 
 *1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
 *		char[] c = new char[10]; 
 *​
 *2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
​ *		int [] n={0,1,2,3,4,5}
 *
 *3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
​ *		char [] day ={'일', '월', '화', '수', '목', '금', '토‘}
 *
 *3-1) "일", "월", "화", "수", "목", "금", "토"
 *		String[] days={"일", "월", "화", "수", "목", "금", "토"}
 *
 *4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
 *		boolean[] boo;
 *		boo=new boolean[]{true, false, false, true}
 *		선언 후에 초기값 주는 방법
 *
 *Int[] arr=new int[3];
 * ---- 데이터형 => []숫자가 들어갈 수 없음
 * 
 * 
 *	
 *	
 *
 *
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class 배열_문제_기타 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n1= {1,2,3,4,5};
		System.out.println(n1.length);
		int n2[]={0}; //가급적 사용 하지 않기
		System.out.println(n2.length);
		int [] n3=new int[3];
		System.out.println(n3.length);
		// int n4[3]=new int[3]; > 배열로 저장한 
		
		char[] alpha={'a','b','c','d'};
		 for(int i=0;i<alpha.length;i++){ // 값 변경, 초기화(인덱스 번호가 필요하다)
		 System.out.println(alpha[i]); // 인덱스 => 일반 for문 사용
		 }
		 System.out.println("===== for-each=====");
		 for(char c:alpha) { // 출력용 => 웹 => for-each
			 //	받는 변수 데이터형 = 배열의 데이터형이 동일
			 // 받는 변수 데이터형이 크다
			 System.out.println(c); // 실제 값 출력 => for=each
		 }
		 System.out.println("=====API=====");
		 System.out.println(Arrays.toString(alpha));
	}

}
