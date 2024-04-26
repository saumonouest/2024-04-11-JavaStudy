/*	버블 정렬
 * 	인접한 수끼리 비교 ==> 뒤에부터 고정
 * 	27, 22, 17, 23, 9, 2 => 2, 9, 17, 22, 23, 27 // ASC
 * 						 => 27, 23, 22, 17, 9, 2 // DESC
 * 
 */
import java.util.Arrays;
public class 중첩_for_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {27,22,17,23,9,2};
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j]; 
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println((i+1)+"Round:"+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		//DESC 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) { // DESC는 이거 부호 하나 다름
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println((i+1)+"Round:"+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

}
