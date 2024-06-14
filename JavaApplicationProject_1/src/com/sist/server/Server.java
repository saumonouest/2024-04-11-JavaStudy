package com.sist.server;
import java.util.*;
import java.io.*;
import java.net.*;
import com.sist.dao.*;
/*
 *	Server 
 *		1. 접속을 받는 클래스 => 접속을 받아서 클라이언트 정보 저장
 *									  ---------- IP, PORT(연결)
 *										IP : 전화번호, PORT : 전화선
 *										------------------------ 전화기 => 소켓
 *		2. 접속된 클라이언트마다 통신 담당 클래스
 *		   ------------ 따라 제작 => 한번에 제작, 여러개가 동시에 수행 => 쓰레드 
 *		
 *		=> 자바 : 두 개 쓰레드
 *				main / gc
 */
public class Server implements Runnable {
	// 접속 담당 => 교환 소켓
	/*
	 *	1. ServerSocket을 생성
	 *	   ------------
	 *		bind => 연결 => 전화기 개통
	 *					   ------- 전화 / 전화선 매칭
	 *				bind(ip, port)
	 *
	 *		listen => 대기 상태
	 *
	 *	2. 대기 중에 클라이언트가 접속
	 *	   -------------------
	 *		accept() => 사용자 정보를 수집 => 메모리에 저장 
	 *					--------
	 *					ㄴ쓰레드 매칭 후에 통신
	 *					
	 *	3. 종료 요청시에는 
	 *		Thread 종료
	 */
	/*
	 *	결정 : 서버 컴퓨터, 연결선(숫자) => 0~65535
	 *								------- 0~1023 사용 중
	 */
	private ServerSocket ss; // 접속을 받는 클래스
	private final int PORT = 3355;
	// 클라이언트의 정보 저장 => IP, PORT, id, name, sex
	//								--- => Oracle에서 정보를 가지고 온다
	private Vector<Client> waitVc = new Vector<Client>();
	public Server () {
		 try {
	         ss = new ServerSocket(PORT); // 개통
	         System.out.println("Server Start. . .");
	         // 클라이언트 접속을 대기
	      }catch(Exception ex) {
	         ex.printStackTrace();
	      }
	   }

	public void run() {
		try { 
			while(true) {
				// 접속이 된 경우
				Socket s = ss.accept(); // 접속자의 ip를 받아서 저장
				// Socket => 클라이언트의 정보가 들어가 있음 (ip, port)
				/*
				 *	서버 : ServerSocket => PORT : 고정 
				 *	클라이언트 : Socket => PORT 자동 설정
				 */
				/*System.out.println("접속 IP : "+s.getInetAddress().getHostAddress()); // ip 어드레스 가져오는 거임
				System.out.println("포트번호 : "+s.getPort());
				OutputStream out = s.getOutputStream();
				// s => 클라이언트
				out.write("서버에 접속 됨\n".getBytes()); // 바이트로 바꿔주는 거임*/
				Client client = new Client(s);
				waitVc.add(client); // 정보 저장
				client.start(); // 클라이언트와 통신을 시작
				
			}
		}catch(Exception ex) {}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	// 통신 담당 
	// 프로그램 안에서 여러개의 프로그램을 동시 수행 => 프로세스 => 여러개 쓰레드가 동시 수행
	// => Server가 가지고 있는 모든 변수 / 메소드를 사용할 수 있다
	// => 한 개의 컴퓨터에서 Server는 1개만 동작이 가능
	// => Server => 고정 IP를 가지고 있어야 함
	class Client extends Thread{
		String id;
		Socket s;
		OutputStream out; // 클라이언트 전송
		BufferedReader in; // 클라이언트 요청 받기
		public Client(Socket s) {
			try {
				this.s=s;
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
			}catch(Exception ex){}		
		}
		// 통신 역할
		public void run () {
			try {
				while(true) {
					// 1. 클라이언트 요청 받기
					String msg = in.readLine();
					System.out.println("Client=> "+msg);
					// 2. 서버에서 응답
					for(Client client : waitVc) { // 접속한 모든 사람에게 위에 리드라인 저거를 보내라~
						client.out.write((msg+"\n").getBytes());
					}
				}
			}catch(Exception ex) {}
		}
		
	}
}




















