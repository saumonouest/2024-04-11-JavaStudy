package com.sist.set;
import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 장르별 / 부서명 / 상품명
		Set<String> set=new HashSet<String>();
		// 저장 장소 선언
		
		set.add("사과");
		set.add("딸기");
		set.add("포도");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("복숭아");
		set.add("망고");
		set.add("체리");
		set.add("사과"); // 중복된 데이터는 저장할 수 없음 => 이미 존재하는...
		System.out.println("===== 자징된 과일 출력 =====");
		// 인덱스 번호가 없음 => for-each
		for(String f:set) {
			System.out.println(f);
		}
	}

}
