/*	8.	1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
 * 
 */
public class 문제_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0){
				System.out.printf("%d\t",i);
			}
		}
		
		
		System.out.println("=====while=====");
		int i=1;
		while(i<=100) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" ");
				
			}i++;
			do {
				if(i%3==0 && i%5==0) {
					System.out.println(i+" ");
				}i++;
			}
			while(i<=100);
	}
}
}
