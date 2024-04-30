// 5개 정수 => 넘겨주면 => 정렬(ASC,DESC)
// 선택 정렬 : 한 개를 선택해서 변경
// 버블 정렬 : 인접한 데이터끼리 변경
//-------------------------------------
/*	. . 로직(프로그램 => 2차 for)
 * 
 *	1) 이차 for	  | false일 경우 => 종료
 *			--1	 --2
 *		for(초기값;조건식;증가식){
 *				  | true일 경우
 *		-------------------
 *				  | false면 1차 for 증가식으로 이동
 *			--1	 --2    ------
 *		for(초기값;조건식;증가식){ |
 *					  --true		 |
 *			반복 출력 문장--------
 *		}
 *		-------------------
 *		}
 *
 *		(e.g)
 *		for(int i=1;i<=5;i++){
 *			for(int j=1;j<=5;j++){
 *				반복 출력 문장 => 25
 *			}
 *		}
 *		i=1 i<=5 ----------j=1 j<=5 문장수행 j++
 *			false면 종료	   j=2 j<=5 문장수행 j++
 *						   j=3 j<=5 문장수행 j++
 *						   j=4 j<=5 문장수행 j++
 *						   j=5 j<=5 문장수행 j++
 *						  -------------------- i++
 *		이거 i=5 될 때까지 반복이라 25번
 *		i=6 i<=5 false => for 전체 종료
 *
 *		선택 정렬 => 앞에서부터 고정
 *		------
 *		30 20 40 10 50 
 *		-----
 *		20 30 40 10 50 
 *		--    --
 *		20 30 40 10 50 
 *		--       --
 *		10 30 40 20 50
 *		-------------------- for 한 바퀴
 *		10 30 40 20 50 
 *		고정 -----
 *		10 30 40 20 50 
 *		   --    -- 
 *		10 20 40 30 50 
 *		-------------------- for 두 바퀴	
 *		10 20 40 30 50
 *			  -----
 *		10 20 30 40 50 
 *		-------------------- for 세 바퀴
 *		10 20 30 40 50 
 *				 -----
 *		-------------------- for 네 바퀴
 *		10 20 30 40 50 
 *		=> length-1이 붙는 이유
 *		숫자 갯수보다 한 바퀴 덜 돎
 *		
 *
 *
 */
public class 메소드_6 {
	static int []sort (int type,int []arr){
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++){
			for(int j=1;j<arr.length;j++) {
				if(type==1)
					bCheck=(arr[i]<arr[j]);
				else
					bCheck=(arr[i]>arr[j]);
				
				if(bCheck){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 변경 전 =====");
		for(int i:arr) { // for-each는 출력 전용
			
			System.out.println(i+" ");
		}
		System.out.println("\n===== 변경 후 =====");
		arr=sort(1,arr);
		for(int i=0;i<arr.length-1;i++){
			System.out.println(i+" ");
		}
		System.out.println();
		arr=sort(2,arr);
			/*for(int j=1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
		}*/
		for(int i:arr) {
			System.out.println();
		}
	}

}
