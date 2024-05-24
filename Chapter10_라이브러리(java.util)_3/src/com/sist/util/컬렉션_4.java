package com.sist.util;
import java.lang.reflect.Array;
import java.util.*;
public class 컬렉션_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("서연우");
		names1.add("이다훈");
		names1.add("한승진");
		names1.add("정동묵");
		names1.add("김주희");
		System.out.println("===== names1 =====");
		for(String name : names1) {
			System.out.println(name);
		}
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("서정우");
		names2.add("이다빈");
		names2.add("한승진");
		names2.add("정동묵");
		names2.add("김지윤");
		System.out.println("===== names2 =====");
		for(String name : names2) {
			System.out.println(name);
		}
		
		System.out.println("===== 데이터 복사 =====");
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(names1); // 전체 데이터 추가
		for(String name : temp) {
			System.out.println(name);
		}
		
		System.out.println("===== 교집합 ====="); // 오라클 => INTERSECT => JOIN (INNER JOIN)
		temp.retainAll(names2); // => 지니 뮤직, 멜론 이라고 가정시 같은 노래 제목 있냐? 찾기
		for(String name : temp) {
			System.out.println(name);
		}
		System.out.println("===== 차집합 ====="); // 오라클 => MINUS => OUTER JOIN (LEFT, RIGHT)
		ArrayList<String> temp2 = new ArrayList<String>();
		temp2.addAll(names1);
		temp2.removeAll(names2); 
		for(String name : temp2) {
			System.out.println(name);
		}
		
		ArrayList<String> names3 = new ArrayList<String>(names1.subList(0,2));
		/*	
		 * 
		 */
		System.out.println("===== 부분적 복사 =====");
		for(String name : names3) {
			System.out.println(name);
		}
		
	}

}
