package com.sist.util;
/*	컬렉션(Collection)
 * 	=> 데이터가 많은 경우에 처리를 쉽고 효율적으로 관리 가능하게 만드는 자료구조
 * 		=> 라이브러리 => 표준화 (모든 개발자가 같은 코딩으로 사용)
 * 					  ------
 * 		=> 자료구조 : 데이터 수정, 데이터 추가, 데이터 삭제, 데이터 읽기 => CRUD
 *		=> 배열은 고정적 => 선언과 동시 저장 갯수를 지정 (추가, 삭제 => 불가능)
 *		   ---------- 추가 => 큰 배열을 다시 만들어야 한다
 *		   ---------- 삭제 => 작은 배열을 다시 만들어야 한다
 *
 *	자료 구조 : 메모리에서 데이터 관리
 *				=> 추가 : add()
 *				=> 삭제 : remove()
 *				=> 읽기 : get()
 *				=> 수정 : set()
 *				=> 전체 삭제 : clear()
 *				=> 저장 갯수 : size()
 */
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// 문자열만 저장해서 관리
		// add(Object) => add(String) => 사용자 정의 데이터형으로 변경이 가능
		// => 가급적이면 1개의 데이터형을 저장한다
		// 			  ------------ 데이터형이 통일 => 반복문 수행에 좋음
		list.add("홍길동");
		list.add(10);
		list.add(10.5);
		list.add(true);
		list.add('A');
		
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				String name=(String)list.get(i);
				System.out.println(name);
			}
			else if(i==1) {
				int no=(int)list.get(i);
				System.out.println(no);
			}
			else if(i==2) {
				double d=(double)list.get(i);
				System.out.println(d);
			}
			else if(i==3) {
				boolean b=(boolean)list.get(i);
				System.out.println(b);
			}
			else if(i==4) {
				char c=(char)list.get(i);
				System.out.println(c);
			}
		}
	}

}
