class Human{ // Human 이라는 데이터형을 제작 => 한 개의 정보 => 따로 저장시에는 new 사용
	String name; //여기서 static을 쓰면 같은 공간을 사용하기 때문에 name에 여러개를 넣어도 마지막에 넣는 걸로 값이 바뀜, static 사용시 공통으로 사용하는 메모리가 생성
	String sex; //new 사용시 다른 메모리 생성
}
public class 멤버변수_활용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human seo=new Human();
		seo.name="서연우";
		seo.sex="여자";
		
		Human lee=new Human();
		lee.name="이다훈";
		lee.sex="남자";
	
		System.out.println("이름:"+seo.name);
	}

}
