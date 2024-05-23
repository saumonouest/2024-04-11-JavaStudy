package com.sist.util;
import java.util.*;
import java.text.*;
public class 라이브러리_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 회원가입
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id=scan.next();
		
		System.out.print("PW 입력 : ");
		String pw=scan.next();
		
		System.out.print("이름 입력 : ");
		String name=scan.next();
		
		System.out.print("성별(여자/남자) 입력 : ");
		String sex=scan.next();
		
		System.out.print("나이 입력 : ");
		int age=scan.nextInt();
		
		System.out.print("번호 입력 : ");
		String tel=scan.next();
		
		System.out.print("주소 입력 : ");
		String addr=scan.next();
		
		// 오라클 전송
		String sql = "INSERT INTO member VALUES('"
					+id+"','"+pw+"','"+name+"','"+sex+"',"+age+",'"+tel+"','"+addr+"')";
		System.out.println(sql);
		
		sql = "INSERT INTO member VALUES(''{0}'',''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'')";
		Object[]obj= {id,pw,name,sex,age,tel,addr};
		System.out.println(MessageFormat.format(sql,obj));
		// sql = "INSERT INTO member VALUES(?,?,?,?,?,?)"
		// => 오라클 => 저장 => 출력 형식을 만들어서 처리 => MessageFormat
		/*	날짜*** => SimpleDateFormat
		 * 	정수*** => DecimalFormat
		 * 	출력 => MessageFormat
		 * 
		 * 	=> util
		 * 		= Random
		 * 		= StringTokenizer => 네트워크(채팅)
		 * 		  --------------- 갯수가 적은 것은 상관 없다, 많은 경우에 문제 발생
		 * 
		 */
		String s="admin|1234|홍길동"; // 아래 넥스트 토큰 내가 가진 것보다 많이 쓰면 에러남 그래서 hasMoreTokens()를 쓰는 게 나음 
		StringTokenizer st=new StringTokenizer(s,"|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

}
