/*
 * import java.util.*;
 * 
 * import org.jsoup.Jsoup; //JSoup => 미리보기에 데이터가 출력된 경우만 import
 * org.jsoup.nodes.Document; import org.jsoup.select.Elements;
 * 
 * public class 메소드_5 { static void find(int type,String fd) throws Exception {
 * Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
 * Elements title=doc.select("div.wrap_song_info div.rank01"); Elements
 * singer=doc.select("div.wrap_song_info div.rank02 span.check");
 * 
 * for(int i=0;i<title.size();i++) { boolean bCheck=false; if(type==1)
 * bCheck=title.get(i).text().contains(fd); else
 * bCheck=singer.get(i).text().contains(fd); if(bCheck)
 * System.out.println((i+1)+"."+title.get(i).text()+"["+singer.get(i).text()+"]"
 * ); } } public static void main(String[] args) throws Exception { //웹에서 뭐 할
 * 때?...
 * 
 * // TODO Auto-generated method stub Scanner scan=new Scanner(System.in);
 * while(true) { System.out.println("=====menu=====");
 * System.out.println("1. 노래 목록"); // 멜론 System.out.println("2. 노래 검색");
 * System.out.println("3. 가수 검색"); System.out.println("4. 프로그램 종료");
 * System.out.println("=============="); System.out.print("메뉴 선택 : "); int
 * menu=scan.nextInt(); if(menu==1) { Document
 * doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get(); Elements
 * title=doc.select("div.wrap_song_info div.rank01"); Elements
 * singer=doc.select("div.wrap_song_info div.rank02"); for(int
 * i=0;i<title.size();i++){ String fd=scan.next();
 * if(title.get(i).text().contains(fd)) {
 * System.out.println((i+1)+"."+title.get(i).text()); }
 * 
 * }
 * 
 * } else if(menu==2) { System.out.println("검색어 입력:"); String fd=scan.next();
 * 
 * }
 * 
 * } } else if(menu==3) { System.out.println("가수 입력:"); } String fd=scan.next();
 * Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
 * Elements title=doc.select("div.wrap_song_info div.rank01"); Elements
 * singer=doc.select("div.wrap_song_info div.rank02"); for(int
 * i=0;i<title.size();i++){ if(title.get(i).text().contains(fd)) {
 * System.out.println((i+1)+"."+title.get(i).text()+"["+singer.get(i).text()+"]"
 * ); }
 * 
 * } }
 * 
 * else if(menu==4) { System.out.println("프로그램 종료"); break; // for, while => 둘 다
 * 바로 종료 } else { System.out.println("존재하지 않는 메뉴"); continue; for(초기값;조건식;증가식)
 * continue; => 증가식 이동 => 특정부분 제외
 * 
 * while(조건식) { continue; ==> 조건식 이동 => 처음부터 다시 시작 }
 * 
 * 
 * }
 * 
 * 
 * }
 */