package com.sist.util;
import java.util.*;
public class 라이브러리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 크기 => 작은 배열, 큰 배열 => 고정 ( 한 번 지정하면 변경할 수 없음)
		// 변경이 있는 경우에는 새로운 배열을 만들어서 처리 => copyOf
		Random r = new Random();
		int [] arr = new int[7];
		// 초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 배열 => 작게 생성 => 값은 arr에 있는 데이터를 그대로 저장 => 3개만 저장
		int [] sub = new int [3];
		for(int i=0;i<sub.length;i++) {
			sub[i]=arr[i];
		}
		System.out.println(Arrays.toString(sub));
		
		int [] sub2=Arrays.copyOf(arr,3);
		System.out.println(Arrays.toString(sub2));
		
		int [] sup = new int [10];
		for(int i=0;i<arr.length;i++) {
			sup[i]=arr[i];
		}
		System.out.println(Arrays.toString(sup));
		
		int [] sup2 = Arrays.copyOf(arr,10);
									//  -- 배열 갯수 
		System.out.println(Arrays.toString(sup2));
		
		// Arrays => toString(), sort(), copyOf() 
	}

}
