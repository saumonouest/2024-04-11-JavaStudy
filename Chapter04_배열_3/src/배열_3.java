// 두 개의 배열 제어
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"홍길동","심청이","이순신","강감찬","춘향이"};
		String[] sex= {"남자","여자","남자","남자","여자"};
		
		//이름(성별)
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"("+sex[i]+")");
		}
		//for-each
		for(String i:names) {
			//System.out.println(i+"("+sex[i]+")");
			//i++;
		}
	}

}
