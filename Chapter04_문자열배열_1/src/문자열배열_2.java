//	startsWith / endsWith => Cookie
//	자동 완성기
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books= {
				"자바와 오라클",
				"자바로 시작하는 웹프로그램",
				"자바와 JSP",
				"JSP와 오라클",
				"JSP와 Ajax",
				"Ajax와 JQuery",
				"혼자 배우는 자바",
				"자바 프로그래밍",
				"오라클 AND 자바",
				"최신 자바"				
		};
		//데이터 모음
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String fd=scan.next();
		for(String book:books) {
			//if(book.startsWith(fd)) {
			if(book.endsWith(fd) || book.startsWith(fd)){ //contains 쓰는 게 더 편함 포함된 거 있냐~
				System.out.println(book);
				try {
					Thread.sleep(1000); //잠시 멈출 때 쓰는 거
				}catch(Exception ex) {}
			}
		}
	}

}
