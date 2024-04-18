/*
 * 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
 */
public class 제어문_문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=5;i<=50;i+=5)
		{
			if(i!=50)
				System.out.print(i+",");
			else
				System.out.print(i);
			
			// 콤마 없을 때는 if else 이런 거 안 쓰고
			//System.out.print(i+"\t") 이렇게 하면 띄어쓰기 되고 콤마 없어짐
		}
	}

}
