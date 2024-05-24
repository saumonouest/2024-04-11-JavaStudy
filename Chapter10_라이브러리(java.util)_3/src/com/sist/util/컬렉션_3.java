package com.sist.util;

import java.util.ArrayList;

// 사용자 정의
class Student {
	private int hakbun;
	private String name;
	private int kor,eng,math;
	// 읽기 쓰기 기능 추가 -> 다른 클래스에서 사용이 가능하게 만든다
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	// 자동으로 디폴트 생성자가 생성이 안 된다 ... 
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 매개변수가 있는 생성자가 있을 경우에는 디폴트 생성자를 만들어야 제어가 편리
	public Student() {
		// 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다
	}
	// 데이터 추가
}
class A {
	int a, b;
	 public A() {
		 a=10;
		 b=20;
	 }
}
public class 컬렉션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		// Object => Student 변경
		list.add(new Student(1,"서연우",100,90,95));
		list.add(new Student(2,"이다훈",100,100,100));
		list.add(new Student(3,"한승진",90,90,70));
		list.add(new Student(4,"정동묵",80,80,70));
		list.add(new Student(5,"김주희",90,80,90));
		list.add(new Student(6,"이영휴",70,80,70));
		
		System.out.println("===== 데이터 출력 =====");
		// 배열 / 컬렉션 => for-each를 이용해서 출력 
		for(Student std:list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리 
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("===== 데이터 추가 =====");
		//Student 객체 추가
		Student s =new Student();
		s.setHakbun(7);
		s.setName("신지영");
		s.setKor(78);
		s.setEng(90);
		s.setMath(60);
		list.add(s);
		for(Student std:list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리 
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		
		System.out.println("===== 데이터 추가 2 =====");
		list.add(new Student(8,"백승현",89,80,90));
		for(Student std:list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리 
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("===== 데이터 출력 =====");
		for(Student std:list) {
			System.out.println(std.toString());
		
		}
		for(int i=0;i<list.size();i++) {
			Student std=list.get(i);
			System.out.println(std);
		}
		System.out.println("===== 학생 삭제 =====");
		list.remove(5); // 인덱스 번호 넣어야 함
		for(Student std:list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리 
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("===== 학생 수정 =====");
		list.set(6, new Student(8,"수정",90,90,90));
		for(Student std:list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리 
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("===== 학생 졸업 =====");
		list.clear();
		for(Student std:list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("현재 인원 : "+list.size());
	}

}
