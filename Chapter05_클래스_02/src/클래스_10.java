/*	static /  instance  변수의 차이점
 * 	------	  -------- new 사용할 때마다 메모리 공간이 따로 생성
 * 	ㄴ 메모리 공가는 1개 생성 => 모든 객체가 공유
 * 
 */
class Member100{
	String name;
	String address;
}
class MemberSystem{
	
	// static 붙이면 공유
	// 데이터가 공통으로 사용이 될 때 => 크롤링, 파일 읽은 데이터 => 오라클에 저장된 데이터는 static
	static Member100[] members=new Member100[3]; // 배열은 객체 생성하는 부분이 아님 => 저장할 공간을 만들어 주는 거임
	/*
	 * Member[] members=new Member[3]; => null, null, null => 메모리 주소가 없는 상태 
	 * int [] arr = new int [3] => 0,0,0
	 * 
	 * 각각 저장하는 변수 => 멤버변수 (인스턴스) => new 갯수만큼 만들어진다
	 * 공유 (한개만 저장) => 정적변수 (공유변수) => static : 메모리 공간이 한개만 만들어진다 
	 * 
	 */
	static int index=0;
}


public class 클래스_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberSystem ms1=new MemberSystem();
		ms1.members[ms1.index]=new Member100();
		ms1.members[ms1.index].name="서연우";
		ms1.members[ms1.index].address="용산";
		ms1.index++;
		ms1.members[ms1.index]=new Member100();
		ms1.members[ms1.index].name="이다훈";
		ms1.members[ms1.index].address="방배";
		ms1.index++;
		ms1.members[ms1.index]=new Member100();
		ms1.members[ms1.index].name="박문수";
		ms1.members[ms1.index].address="인천";
		for(Member100 m:ms1.members) {
			System.out.println(m.name+","+m.address);
		}
		MemberSystem ms2=new MemberSystem();
	}

}
