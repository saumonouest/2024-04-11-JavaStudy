// 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
import java.util.Scanner;
public class 문제_6 {
	static void munje6(String msg) {
		
		if(msg.length()%2!=0) {
			System.out.println("잘못된 입력입니다.");
			return; // 메소드 종료 => return은 원하는 위치에서 사용이 가능
		}
		/*	ABBA
		 *	0123
		 * 
		 */
		boolean bCheck=false;
		for(int i=0;i<msg.length()/2;i++) {
			char c1=msg.charAt(i);
			char c2=msg.charAt(msg.length()-1-i);
			if(c1!=c2) {
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
			System.out.println("좌우 대칭");
		else
			System.out.println("좌우 비대칭");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//munje6=new scan.next();
		System.out.println("문자열 입력:");
		
		
	}

}
