/*	배열 => 5
 * 	-------------------------
 *		|	|	|	|	|
 *	-------------------------
 *	 --- --- --- --- --- --- 간격이 동일해야함 => 인덱스
 *							 -------- 단위가 byte => 4byte(int[]) 8byte(double[])
 *	1) 초기값
 *	   0번부터 추가
 *	   마지막부터 추가
 *	   -----------
 *		정수 입력을 받아서 => 2진법을 출력
 *
 *		8bit
 *		10 => 00001010 => 뒤에서부터 첨부
 */
import java.util.Scanner;
public class 배열활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767 사이의 정수 입력:");// bit : 16bit
		int input=scan.nextInt();
		//0,1 저장
		int[]binary=new int[16];
		int index=binary.length-1; //0~15
		
		
		//System.out.println("=====API이용=====");
		//System.out.println(Integer.toBinaryString(input)); 2진법
		//이게 훨씬 더 편함
		//System.out.println(Integer.toOctalString(input)); 8진법
		//System.out.println(Integer.toHexString(input)); 16진법
		/*
		 * 1 100 100
		 * 144
		 * 
		 * 110 0100
		 * 64
		 * 
		 */
		
		while(true) {
			binary[index]=input%2;
			input=input/2;
			if(input==0) break;
			index--;
		}
		//출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0) { // 4개 출력 후에 1칸 공백 추가한다는 뜻 => 0%4 => 0
				System.out.println(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
