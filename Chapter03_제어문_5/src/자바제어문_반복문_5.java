/*	A ~ Z 사이에서 => 사용자가 입력한 알파벳이 몇 번째 있는지 확인
 *
 */
import java.util.Scanner;
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("알파벳 입력:");
	char ch=scan.next().charAt(0);
	int num=1;
	for(char c='A';c<='Z';c++) {
		if(ch==c) 
				break;
			num++;
	}
	System.out.println(ch+"는(은)"+num+"번째 있습니다");
	}

}
