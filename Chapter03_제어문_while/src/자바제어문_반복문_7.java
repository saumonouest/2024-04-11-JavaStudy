import java.util.*;
import java.io.*;
public class 자바제어문_반복문_7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\JavaDev\\movie.txt");
		int i=0; // 한글 읽기 => 정수값을 읽는다
		while((i=fr.read())!=-1) { //-1 EOF(End Of File)
			System.out.print((char)i);
		}
		fr.close();
	}

}
