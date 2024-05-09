package com.sist.main;
import java.util.*; // util 이라는 폴더 안에 여러개의 클래스를 불러올 때 *을 쓰는 거임
import static java.lang.Math.random; // 이거 주면 아래에서 Math 빼도 됨! static 줘야 됨! 
import static java.lang.Math.max;
import static java.lang.Math.min;
public class 패키지설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*100)+1; 
		int b=(int)(random()*100)+1;
		System.out.println("최대값:"+max(a,b));
		System.out.println("최소값:"+min(a,b));
	}

}
