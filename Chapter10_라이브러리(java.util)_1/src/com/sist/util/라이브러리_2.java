package com.sist.util;
import java.util.*; // 업다운 겜
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터 난수 발생 => 1 ~ 100 
		// 2. 사용자 입력을 받아서 => 난수는 맞추는 게임 => 힌트
		// Math.random() => 보완된 클래스 => Random
		Random r = new Random();
		int com = r.nextInt(100)+1; // 1 ~ 100 
		
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("1~100 사이 정수 입력 : ");
			int user = scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("잘못된 입력");
				continue; // 처음부터 실행 ==> while(조건식), for(증가식)
			}
			
			//힌트
			if(com>user) {
				System.out.println("UP");
			}
			else if(com<user) {
				System.out.println("DOWN");
			}
			else { 
				System.out.println("END");
			}
		}
	}

}











