
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3); //0 1 2
		// 정수 한 거면 상수도 가능한
		// 순서는 상관 없음
		switch(com) //정수
		{
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
			//default 생략이 가능
		}
	}

}
