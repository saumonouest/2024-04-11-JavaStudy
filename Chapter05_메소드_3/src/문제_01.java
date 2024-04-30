//사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
// 매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_01 {
	//boolean idCheck(String id)
	static boolean isLogin(String a, String b) {
		boolean bCheck=false;
		if(a=="seoeonu" && b=="1234") 
			bCheck=true;
		
		else
			bCheck=false;
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String a=scan.next();
		System.out.println("비밀번호 입력: ");
		String b=scan.next();
		System.out.println(isLogin(a,b));
	}

}
