//	알파벳 10개 난수 => 버블 정렬 (DESC)
//	중복 없는 알파벳
import java.util.*;
public class 중첩_for_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] alpha= new char[10];
		System.out.println("정렬 전:");
		for(int i=0;i<alpha.length;i++) {
		alpha[i]=(char)((Math.random()*26)+65);
			for(int j=0;j<i;j++) {
				if(alpha[i]==alpha[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		System.out.println("정렬 후:");

		for(int i=0;i<alpha.length-1;i++) {
			for(int j=0;j<alpha.length-1;j++) {
				if(alpha[j]>alpha[j+1]) {
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
			}//System.out.println((i+1)+"Round:"+Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));
		
			
		for(int i=0;i<alpha.length-1;i++) {
			for(int j=0;j<alpha.length-1;j++) {
				if(alpha[j]<alpha[j+1]) {
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
			}//System.out.println((i+1)+"Round:"+Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));
	}

}
