import java.io.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		StringBuffer data=new StringBuffer();
		while((i=fr.read())!=-1) // 파일 끝일 때 종료 => -1 EOF
		{
			data.append((char)i);
		}
		fr.close();
		System.out.println(data.toString());
		}
}