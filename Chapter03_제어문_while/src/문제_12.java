/*	12.	5개으 정수를 임의로 추출하여 
최대값,최소값을 출력하는 프로그램을 작성하시오
 * 
 */
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int min=100;
		for(int i=1;i<=5;i++) {
			int num=(int)(Math.random()*100)+1;
			System.out.println(num+" ");
			if(max<num)
				max=num;
			if(min>num)
				min=num;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		System.out.println("=====while=====");
		int i=1;
		max=0;
		min=100;
		while(i<=5) {
			int num=(int)(Math.random()*100)+1;
			System.out.println(num+" ");
			if(max<num)
				max=num;
			if(min>num)
				min=num;
			i++;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	
		
		
	}

}
