package com.sist.temp;
import java.util.*;
import java.sql.*;
public class empDAO2 {
	// 오라클 연결
	private Connection conn;
	// 오라클에 SQL 문장 전송
	private PreparedStatement ps;
	
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static empDAO2 dao2;
	
	// 1. 드라이버 등록(한번만 등록)
	public empDAO2() {
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Dbeaver, sqldeveloper
		}catch(Exception ex) {}
	}
	
	// 2. 싱글턴 패턴 => 메모리 공간을 한 개만 사용 => static 
		public static empDAO2 newInstance()	{
			if(dao2==null)
				dao2=new empDAO2(); // 생성이 안 된 경우
			return dao2; // 이미 생성된 dao를 사용한다 
		}
		
	// 3. 오라클 연결 
		public void getConnection() {
			try {
				conn=DriverManager.getConnection(URL,"hr","happy");
				//conn hr/happy => 오라클 명령
			}catch(Exception ex) {}
			
		}
		
	// 4. 오라클 닫기 
		public void disConnection() {
			try {
				if(ps!=null) ps.close();
				// 송수신 => 닫고 
				if(conn!=null) conn.close();
				// exit 
			}catch (Exception ex) {}
		}
	
	// 5. 오라클에 요청
		public ArrayList<empVO2> empListData(){
			ArrayList<empVO2> List=new ArrayList<empVO2>();
			try {
				// 1. 연결
				getConnection();
				// 2. SQL 문장 만들기 
				String sql=("SELECT ZIPCODE, SIDO, GUGUN, DONG, NVL(BUNJI,' ') FROM zipcode");
				// 3. 오라클로 전송 
				ps=conn.prepareStatement(sql);
				// 4. 오라클에서 실행된 결과를 가지고 온다
				ResultSet rs2=ps.executeQuery(); // enter	
				// ==> list에 첨부
				while(rs2.next()) {
					// double => rs.getDouble(번호)
					// date => rs.getDate(번호)
					empVO2 vo2 =new empVO2();
					vo2.setZIPCODE(rs2.getString(1));
					vo2.setSIDO(rs2.getString(2));
					vo2.setGUGUN(rs2.getString(3));
					vo2.setDONG(rs2.getString(4));
					vo2.setBUNJI(rs2.getString(5));
					List.add(vo2);
				}
				rs2.close(); // 메모리 해제
			}catch(Exception ex) {
				// 에러 확인
				ex.printStackTrace();
			}finally {
				// 오라클 닫기 
				disConnection();
			}return List;
		}
		public empVO2 empDetailData(String ZIPCODE) {
			empVO2 vo2 = new empVO2(); 
			try {
				// 오라클 연결 
				getConnection(); // 반복 제거 
			
				// 2. SQL 문장
				String sql = ("SELECT ZIPCODE, SIDO, GUGUN, DONG, NVL(BUNJI,' ') FROM zipcode="+ZIPCODE);
				// 3. 오라클 전송 
				ps=conn.prepareStatement(sql);
				// 4. 실행 결과
				ResultSet rs2=ps.executeQuery();
				// 5. EmpVO => 값을 채운다
				rs2.next();
				vo2.setZIPCODE(rs2.getString(1));
				vo2.setSIDO(rs2.getString(2));
				vo2.setGUGUN(rs2.getString(3));
				vo2.setDONG(rs2.getString(4));
				vo2.setBUNJI(rs2.getString(5));
				rs2.close();
				
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				// 오라클 닫기 
				disConnection();
			}
			return vo2;
		}
		
		public ArrayList<empVO2> empFind(String DONG){
			ArrayList<empVO2> list=new ArrayList<empVO2>();
			try {
				// 연결 
				getConnection();
				
				String sql=("SELECT ZIPCODE, SIDO, GUGUN, DONG, NVL(BUNJI,' ')" 
						+"FROM zipcode "
						+"WHERE DONG LIKE '%"+DONG+"%'");
				// => 데이터는 대소문자를 구분한다
				// 3. 오라클 전송 
				ps=conn.prepareStatement(sql);
				// 4. 실행 결과
				ResultSet rs2=ps.executeQuery();
				while(rs2.next()) {
					// double => rs.getDouble(번호)
					// date => rs.getDate(번호)
					empVO2 vo2 =new empVO2();
					vo2.setZIPCODE(rs2.getString(1));
					vo2.setSIDO(rs2.getString(2));
					vo2.setGUGUN(rs2.getString(3));
					vo2.setDONG(rs2.getString(4));
					vo2.setBUNJI(rs2.getString(5));
					list.add(vo2);
				}
				rs2.close(); // 메모리 해제
					
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				disConnection();
			}
			return list;
		}
		
}
