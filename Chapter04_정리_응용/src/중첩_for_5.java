/*	중복이 없는 난수
 * 	1~10 => 10개의 난수 발생 => 중복 없이
 * 
 */
public class 중첩_for_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 용도가 같은 정수 10개 저장
		int[] arr=new int[10]; // 변수 이름을 1개로 통일 => 구분은 인덱스로
		// 인덱스 번호는 0번부터 시작 => 범위는 length-1부터 시작
		// 제어하기가 좋음 > 읽기/쓰기 => 반복문을 사용하기 때문에 소스코딩을 줄인다
		// int a=random()=> 500
		// 클래스 => 한 개의 이름 => 여러개를 동시에 제어 => 인터페이스
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) { // 만약 중복일 때 
					i--; //다시 난수 발생해서 증가식을 못 올라가게 내려가게 하는 거임 그래서 중복 없을 때까지 돌리는 거임	
					break; // 2차 for문만 제외하는 거임
				}
			}
		}
		
		//초기화 => 출력
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}

}
