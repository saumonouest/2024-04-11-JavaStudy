class sundae{
	String add="전라북도 전주시 완산구 풍남문 2길 39";
	String tel="063-232-5006";
	String type="탕/찌개/전골";
	String price="만원 미만";
	String parking="무료 주차 가능";
	String time="06:00-24:00";
	String menu="순대국밥\n 피순대\n 잡채순대";
}
public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sundae s=new sundae();
		System.out.println("주소: "+s.add);
		System.out.println("번호: "+s.tel);
		System.out.println("종류: "+s.type);
		System.out.println("가격: "+s.price);
		System.out.println("주차: "+s.parking);
		System.out.println("시간: "+s.time);
		System.out.println("메뉴: "+s.menu);
		
	}

}
