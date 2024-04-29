// 매개변수 => 메소드 안에서만 사용이 가능 => 지역변수
// 메소드 호출 시에 메모리 저장 => 메소드 종료 시 자동으로 해제가 된다
public class 메소드_3 {
	static int i=1; // 이렇게 하면 안 사라짐, 전역변수 => 프로그램 종료시에 메모리 해제
	static void increment() { // 호출시마다 => 변수는 자동삭제 => 다시 생성
		
		// 지역변수 우선순위
		int i=1; //지역 변수
		System.out.println("i="+i);
		++i;
		
		//노란색 지역 변수, 파란색 클래스 변수
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment(); // {} 선언된 모든 변수는 메모리에서 사라진다 (지역 변수)
		increment();
		increment();
		
	}

}
