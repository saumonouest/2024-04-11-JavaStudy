/*	배열 : 같은 데이터형 여라개 데이터를 모아서 저장
 * 		  --------- 용도가 같은 데이터
 *			=> 고정적 단점
 *			=> 여러개의 데이터를 한 개의 이름 제어를 할 수 있다
 *							------------ 인덱스 => 0번부터 시작
 *		
 *		1) 선언
 *			데이터형[] 배열명;
 *			데이터형 배열명[];
 *			(e.g.)
 *				정수 
 *				int [] arr
 *				실수
 *				double [] arr
 *				문자
 *				char [] arr
 *				문자열
 *				String [] arr
 *				논리형
 *				boolean [] arr
 *
 *		2) 초기화
 *			=> 실제 값 초기화
 *			int [] arr;
 *			arr=new int[]{1,2,3,4,5}
 *			=> 기본 값을 초기화
 *			int [] arr=new int[5] => 자동으로 0으로 초기화
 *			= int[] => 0
 *			= double[] => 0.0
 *			= boolean[] => false
 *			= String[] => null(주소가 없는 상태)
 *						  null => 모든 클래스에 저장(참조할 수 있는 주소)
 *			= long[] => 0L
 *			= char[] => '\0' => 공백		
 *
 *			
 *		3) 값 변경
 *			int[] arr={10,20,30,40,50}
 *			Stack(주소) 				Heap(실제 데이터가 저장되는 영역)
 *			arr -------------->		-------------------------
 *									10	| 20  |	30	| 40 | 50
 *								   |-------------------------
 *								0*100  0*104 0*108 0*112 0*116
 *
 *						배열 변수는 시작 주소값만 가지고 있다
 *						arr=0*100
 *						arr[0] => 0*100 주소 첫번째 값
 *						arr[1] => 0*100 주소로부터 두번째 값
 *						...
 *						...
 *				세번째 값 변경 => arr[2]=100 => 30(x) => 100으로 변경
 *				마지막 값 변경 => arr[4]=500 => 50(x) => 500으로 변경
 *				배열의 값을 변경 할 때 => 배열명[인덱스번호] : 0번부터 시작 
 *
 *				=> 배열복사
 *					얕은 복사 : 공유
 *					깊은 복사 : 새로운 배열을 생성
 *
 *
 *
 *		4) 출력 => for-each
 *
 *		학생 1명에 대한 정보
 *		1. 이름 
 *		2. 성별 
 *		3. 학번
 *		4. 학년
 *		5. 주소
 *		6. 전화
 *		7. 나이
 *		------
 *		변수 => 3명 
 *		String name1,name2,name3; => String [] name=new String[3]
 *		String sex1,sex2,sex3; => => String [] sex=new String[3]
 *		int hakbun;
 *		int year;
 *		String address;
 *		String phone;
 *		int age;
 *
 *		클래스 
 *		class Student{
 *		String name,sex,address,phone;
 *		int hakbun,year,age
 *		}
 *		=> 메모리 원하는만큼 확보할 수 있다
 *		Student hong=new Student()
 *		Student hong1=new Student()
 *		Student hong2=new Student()
 *		Student hong3=new Student()
 *		Student hong4=new Student()
 *		Student hong5=new Student()
 *		Student [] std=new Student[1000]
 *		
 *		
 *
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 => Call BY Reference
		//얕은 복사
		/*int [] arr= {10,20,30,40,50};
		int [] temp=arr;
		temp[0]=100;
		temp[1]=200;
		//arr[0]=100, arr[1]=200
		
		System.out.println("temp[0]="+temp[0]);
		System.out.println("temp[1]="+temp[1]);
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);*/
		int[] arr= {10,20,30,40,50};
		int[] temp=arr.clone(); //새로운 배열 생성
		int[] temp2=arr;
		System.out.println("arr="+arr);
		System.out.println("temp="+temp);
		System.out.println("temp2="+temp2);
		// 설정된 값 그대로 복사 => 새로운 배열을 생성 => clone => 깊은 복사
		// 배열은 메모리 주소를 이용 => 주소 대입 => 별칭 => 같은 메모리를 제어
		temp[0]=100;
		temp[1]=200;
		System.out.println("temp[0]="+temp[0]);
		System.out.println("temp[1]="+temp[1]);
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		//배열은 메모리 주소
		//=> 원본이 변경 될 수 있다 => 깊은 복사
		// 주소값은 대입이 가능
		
	}	
}
