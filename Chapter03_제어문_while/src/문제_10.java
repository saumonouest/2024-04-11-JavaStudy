/*	10.	10~99까지 정수중에 같은 자리의 정수를 출력하시오
 * 
 */
public class 문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=10;i<=99;i++) {
			if(i%11==0) {
				System.out.printf("%d\t", i);
				// =System.out.println(i+" ");
			}
		}
		System.out.println("=====while=====");
		i=10;
		while(i<99) {
			if(i%11==0)
				System.out.print(i+" ");
			i++;
		}
		System.out.println("=====do~while=====");
		i=10;
		do {
			if(i%11==0)
				System.out.print(i+" ");
			i++;
		}while(i<=99);
	}

}
