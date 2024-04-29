// char 리턴 => 알파벳을 전송 => 대문자를 소문자로, 소문자는 대문자로
public class 메소드_7 {
	static char upper(char c) {
		return (char)(c-32);
		//a=97, A=65
	}
	static char lower(char c) {
		return (char)(c+32);
	}
	static char upperLower(char c) {
		char res=' '; // 결과값이 여러개인 경우 => 변수를 선언
		if(c>'A' && c<='Z')
			res=(char)(c+32);
		else
			res=(char)(c-32);
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c=upper('m');
		System.out.println(c);
		c=lower('M');
		System.out.println(c);
		*/
		char c=upperLower('A');
		System.out.println(c);
		c=upperLower('a');
		System.out.println(c);
	}

}
