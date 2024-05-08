package com.sist.main;
// Movie 클래스 불러오기
import com.sist.vo.Movie;
// 클래스가 다른 폴더에 저장된 경우는 반드시 import를 이용해서 불러온다
//		  ------- 패키지
/*
 *	private / public
 *	변수 => private => 데이터 공개(x)
 *			=> 접근이 가능하게 만든다
 *			=> getXxx(), setXxx()
 *
 *	메소드 / 클래스 / 생성자 => 다른 클래스에서 연결 => public
 */
import java.util.*;
import java.sql.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date=new java.util.Date();
		// 메모리에 저장
		Movie movie=new Movie();
		
		// 데이터 초기화
		movie.setRank(1);
		System.out.println("순위:"+movie.getRank());
	}

}
