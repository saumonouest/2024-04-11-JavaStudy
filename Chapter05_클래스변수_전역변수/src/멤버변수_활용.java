/*class Sawon{ => 한 명의 사원에 대한 정보를 모아둔다 
 *  String name;
 *  String dept;
 * }
 * -------------------------- 변수가 아니라 데이터형(Sawon데이터형) => 사용자 데이터형 
 * public class MainClass{
 * 
 *		Sawon s=new Sawon(); => 모든 메소드에서 사용이 가능 이렇게 밖으로 빼놔야 함 아래 거처럼 안으로 넣으면 사용 못 함
 								호출 하자마자 없어지기 때문임
 * 		static void aaa()
 * 		{
 * 			Sawon s=new Sawon(); ------
 * 		}								|
 *  	static void bbb()				|
 * 		{								|
 * 			Sawon s=new Sawon(); ------		=> 메소드 안에 있는 변수는 호출 후에 사라진다
 * 		}								|	=> 다른 변수
 *  	static void ccc()				|
 * 		{								|
 * 			Sawon s=new Sawon(); ------
 * 		}
 * 		public static void main(String [] args)
 * 
 */
/*	메소드 안에서만 사용 => 지역 변수
 * 	for(int i=1;i<=10;i++){
 * 	}
 * 
 * 	전체 메소드에서 사용 => 멤버변수
 * 
 */

public class 멤버변수_활용 {
	static int a=100;
	static void aaa() {
			// aaa() => a 사라진다 
		System.out.println("aaa():a="+a);
		System.out.println("aaa():a는 사라진다");
		// {} => 블록 안에서만 사용하는 변수 => 지역 변수 
	}
	static void bbb() {
		
		System.out.println("bbb():a="+a);
		System.out.println("bbb():a는 사라진다");
	}
	static void ccc() {
		
		System.out.println("ccc():a="+a);
		System.out.println("ccc():a는 사라진다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();
		bbb();
		ccc();
	}

}
