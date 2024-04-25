/* 1. 배열의 범위를 벗어나면 => 오류 발생 => 0번 ~ 갯수-1
 * 2. 프로그래머의 실수가 가장 많은 곳 => 실행 시에 오류 발생
 * 	=> ArrayIndexOutOfBoundsException
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2};
		//0,1
		System.out.println(arr[2]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		//at 배열_4.main(배열_4.java:11)
		//배열에 없는 거 입력 했을 때 오류는 안 뜨는데 이렇게 뜨면서 값이 안 나옴
	}

}
