package com.sist.io;

/*	ObjectInputStream / objectOutputStream
 * 	=> 객체 단위 저장
 * 	   -----------
 * 	   직렬화				역직렬화
 * 	   				-------------
 * 						-----	
 * 						-----
 * 						-----
 * 						-----
 * 					--------------
 * 	-------------------------------
 * 		|	|	|	|	|	|	|	=> 직렬화
 * 	-------------------------------		
 * 
 */
import java.util.*;
import java.io.*;
class Student implements Serializable{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 디폴트 생성자
	public Student() {
		
	}
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
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"서연우",90,80,70));
		list.add(new Student(2,"이다훈",90,90,95));
		list.add(new Student(3,"서정우",100,95,90));
		list.add(new Student(4,"신지영",80,70,75));
		list.add(new Student(5,"한승진",80,65,70));
		// 객체단위 저장 => list를 통으로 저장
		ObjectOutputStream oos=null;
		try {
			File file =new File("c:\\java_data\\std.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			// 객체 단위 파일 저장
			oos.writeObject(list); // 병렬 => 직렬
			System.out.println("객체 단위 저장 완료");
		}catch (Exception ex)	{
			ex.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch(Exception ex) {}
		}
		
	}

}
