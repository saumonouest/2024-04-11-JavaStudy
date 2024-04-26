/*
 * ★
 * ★★
 * ★★★
 * ★★★★
 * 
 * 줄수 별표
 * 	i	j
 *  1	1
 *  2	2
 *  3	3
 *  4	4 => i==j
 *  
 *  ★★★★
 *  ★★★
 *  ★★
 *  ★
 *  
 *  	*
 *     **
 *    ***
 *   ****
 *   
 *   ****
 *    ***
 *     **
 * 		*
 *  
 *  줄수 공백 별표
 *  i	j	k
 *  1	3	1
 *  2	2	2
 *  3	1	3
 *  4	0	4
 *  
 *  1	0	4 j+1=i => j=i-1
 *  2	1	3
 *  3	2	2
 *  4	3	4 k=5-i
 */
public class 중첩_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.printf(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
			System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.printf(" ");
			}
			for(int k=1;k<=5-i;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println("==========");
	}

}
