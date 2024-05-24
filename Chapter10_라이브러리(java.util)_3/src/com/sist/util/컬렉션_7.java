package com.sist.util;
import java.util.*;
public class 컬렉션_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("서연우");
		list.add("한승진");
		list.add("김주희");
		list.add("신지영");
		list.add("배소영");
		System.out.println("현재 저장된 갯수: "+list.size());
		list.remove("신지영");
		System.out.println("현재 저장된 갯수: "+list.size());
	}

}
