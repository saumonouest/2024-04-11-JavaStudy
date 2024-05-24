package com.sist.util;
import java.util.*;
public class 컬렉션_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		// addAll() => set => 복사가 가능 
		for(String s:list)
			System.out.println(s);
		
		// asList 클래스는 첨부가 불가능 => 기본형 / String 만
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		
	}

}
