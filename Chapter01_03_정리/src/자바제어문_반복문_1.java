/*
 *	반복문 => 중복 제거 할 때 많이 사용
 *	---- 메소드
 *	for : 반복 횟수가 지정된 경우(자바에서는 많이 안 씀~)
 *	
 *	프로그램
 *	1. 변수 => 합, 정수 받아서
 *	2. 조건 / 반복
 *	3. 결과값 출력
 *
 *	=> 1 ~ 45 까지의 정수 중 6개를 추출해서 출력하는 프로그램
 *
 *	반복문 
 *	1. 반복횟수 확인
 *		10번 반복(어디서부터 어디까지)
 *		for(int i=0;i<10;i++)
 *		for(int i=1;1<=10;i++)
 *
 *	2. 처리 문장
 *	3. 처리된 결과값
 *
 * 1~100 좌우대칭 숫자 출력
 * for(i=1;i<=100;i++){
 * if(i%11==0)
 * sysout(i+" ")'
 * }
 * 
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num1=(int)(Math.random()*45)+1; // 1~45
		System.out.print(num1+" ");
		int num2=(int)(Math.random()*45)+1;
		System.out.print(num2+" ");
		int num3=(int)(Math.random()*45)+1;
		System.out.print(num3+" ");
		int num4=(int)(Math.random()*45)+1;
		System.out.print(num4+" ");
		int num5=(int)(Math.random()*45)+1;
		System.out.print(num5+" ");
		int num6=(int)(Math.random()*45)+1;
		System.out.print(num6+" ");*/
		for(int i=1;i<=6;i++) {
			int num1=(int)(Math.random()*45)+1;
			System.out.print(num1+" ");
		}
		
		
		
	}

}
