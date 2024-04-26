/*	정렬
 * 	--- 선택 정렬	/ 버블 정렬
 * 	선택 정렬 : 
 * 	30 20 40 10 50 => ASC(올림차순) / DESC(내림차순)
 * 				  10 20 30 40 50 / 50 40 30 20 10
 * 	
 *	30 20 40 10 50
 * 
 */
import java.util.*;
public class 중첩_for_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
	}

}
