/*import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

class Melon{
	String rank;
	String title;
	String singer;
	String album;
	String poster;
	String key;
}
class  MM{
	static Melon[] musics=new Melon[100];{
		try {
			int k=1;
			for(int i=50;i<=100;i+=50) {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("tr.lst"+i+" div.wrap div.rank01 a");
			Elements singer=doc.select("tr.lst"+i+" div.wrap div.rank01 a");
			Elements album=doc.select("tr.lst"+i+" div.wrap div.rank01 a");
			Elements poster=doc.select("div.wrap a.image_typeAll img");
	
				for(int j=0;j<title.size();j++) {
					System.out.println("순위"+(k));
					System.out.println("노래명: "+title.get(j).text());
					System.out.println("가수명: "+title.get(j).text());
					System.out.println("앨범명: "+title.get(j).text());
					System.out.println("이미지: "+title.get(j).text());
					System.out.println("======================================================");
					FileWriter fw=
						new FileWriter("c:\\javaDev\\melon.txt",true);
					String data=k+"|"+title.get(j).text()+"|"
							+singer.get(j).text()+"|"
							+album.get(j).text()+"|"
							
							+poster.get(j).text()+"\r\n";
					fw.write(data);
					fw.close();
					k++;			
					
				}
		}
			/*FileReader fr =new FileReader("c:\\javaDev\\melon.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
public class MelonMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
