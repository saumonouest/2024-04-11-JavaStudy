
public class 메소드_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 새로운 사이트 제작 => 로그인
		// 재사용 가능
		boolean bCheck=메소드_2.isLogin("admin","1234");
		if(bCheck) {
			System.out.println("로그인 완료");
		}
		else {
			System.out.println("아이디 혹은 비밀번호 오류");
		}
			
	}

}
