/*
 * 5. 1~100사이의 정수를 10개 저장하고  
 * 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장 
 * 정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
 *
 */
import java.util.*;
public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		int etotal=0;
		int ototal=0;
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			
			if(arr[i]%2==0) 
				etotal+=arr[i];
			if(arr[i]%2!=0)
				ototal+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
			
		System.out.println("짝수합:"+etotal);
		System.out.println("홀수합:"+ototal);
	}

}
