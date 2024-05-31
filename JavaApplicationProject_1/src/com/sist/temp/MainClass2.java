package com.sist.temp;

import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EmpDAO dao=new EmpDAO();
		System.out.println("dao="+dao);
		EmpDAO dao1=new EmpDAO();
		System.out.println("dao1="+dao1);*/
		empDAO2 dao2=empDAO2.newInstance();
		ArrayList<empVO2> list=dao2.empListData();
		for(empVO2 vo2:list) {
			System.out.println(vo2.getZIPCODE()+" "
					+vo2.getSIDO()+" "
					+vo2.getGUGUN()+" "
					+vo2.getDONG()+" "
					+vo2.getBUNJI());
		}
		System.out.println("=====================");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색어 입력 : ");
		String ename=scan.next();
		list=dao2.empFind(ename);
		for(empVO2 vo2:list) {
			System.out.println(vo2.getZIPCODE()+" "
					+vo2.getSIDO()+" "
					+vo2.getGUGUN()+" "
					+vo2.getDONG()+" "
					+vo2.getBUNJI());
		}
		
	}

}
