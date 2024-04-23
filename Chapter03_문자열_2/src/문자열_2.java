// contains
/*
 * JDBC => DBCP => MyBatis => (JPA)
 * Ajax => Vue => React => Redux => React-Query => Next
 * MSA
 * 
 */
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1.노래명 2.가수");
		int menu=scan.nextInt();
		int k=1;
		
		if(menu==1) {
			System.out.print("노래명 입력");
			String fd=scan.next();
			for(int i=1;i<=4;i++) {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.title");
				for(int j=0;j<title.size();j++) {
					if(title.get(j).text().contains(fd)) {
			
					System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text( )+")");
					k++;
					}
				}
			}
		}
		else if(menu==2) {
			System.out.print("가수명 입력");
			String fd=scan.next();
			for(int i=1;i<=4;i++) {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.artist");
				for(int j=0;j<title.size();j++) {
					if(singer.get(j).text().contains(fd)) {
			
					System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text( )+")");
					k++;
					}
				}
			}
			
		}
	}

}
