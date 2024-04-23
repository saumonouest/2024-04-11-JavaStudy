// 수박:watermelon
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f="수박:watermelon";
		System.out.println("수박의 영어는?");
		System.out.println("영어는 "+f.substring(f.indexOf(":")+1));
		/*
		 * substring : 문자열을 자르는 경우에 사용
		 * Hello Java
		 * 0123456789
		 * substring(6) => 
		 * substring(int startIndex)
		 * substring(int startIndex, int endIndex)
		 */
		String msg="Hello Java";
		System.out.println(msg.substring(0,7)+". . .");
	}

}
