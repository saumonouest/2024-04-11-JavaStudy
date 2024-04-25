import java.util.*;
import java.io.*;
public class 문자열배열_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Java_data\\seoul_location.txt");
		String data="";
		int i=0;
		//fr => 한글짜식 => ASC => 정수
		while((i=fr.read())!=-1) {//-1 파일 끝이라는 뜻 (EOF)
			data+=(char)i;
		}
		fr.close();
		//System.out.println(data);
		String[]location=data.split("\n");
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("==========menu==========");
			System.out.println("1. 목록");
			System.out.println("2. 명소 검색");
			System.out.println("3. 주소 검색");
			System.out.println("4. 종료");
			System.out.println("========================");
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==4) {
				System.out.println("프로그램 종료");
				break; // while 종료
			}
			else if(menu==1) {
				for(String loc:location) {
					String[]locData=loc.split("\\|");
					System.out.println("명소명:"+locData[1]);
					System.out.println("명소 소개:"+locData[2]);
					System.out.println("위치:"+locData[3]);
					System.out.println("========================");			
				}
			
			}
			
			else if(menu==2) {
				System.out.println("검색어 입력:");
				String fd=scan.next();
				for(String loc:location) {
					if(loc.contains(fd)) {
						String[]locData=loc.split("\\|");
						System.out.println("명소명:"+locData[1]);
						System.out.println("명소 소개:"+locData[2]);
						System.out.println("위치:"+locData[3]);
						System.out.println("========================");	
					}
				}
			}
			else if(menu==3) {
				System.out.println("주소 입력:");
				String address=scan.next();
				for(String loc:location) {
					if(loc.contains(address)) {
						String[]locData=loc.split("\\|");
						System.out.println("명소명:"+locData[1]);
						System.out.println("명소 소개:"+locData[2]);
						System.out.println("위치:"+locData[3]);
						System.out.println("========================");	
					}
				}
				
			}
		}
	}

}
