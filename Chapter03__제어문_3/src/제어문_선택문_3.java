import java.io.IOException;
import java.util.Scanner;
/*
 * C:\Windows\System32\notepad.exe
 * C:\Program Files\Windowsapp\Microsoft.paint
 * "C:\Program Files\Google\Chrome\Application\chrome.exe"
 */

public class 제어문_선택문_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("메모장,그림판,크롬 >>");
		//결과 출력
		switch(scan.next())
		{
			case"메모장":
				Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
				break;
			case"그림판":
				Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
				break;
			case"크롬":
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://naver.com");
				break;
			default:
					System.out.println("잘못된 입력입니다!!");
				
		}
	}

}
