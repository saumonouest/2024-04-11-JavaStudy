/*
 * 	국어 영어 수학 > 총점 / 평균 / 학점 (ABCDF)
 * int 국어=90;
 * int 영어=59;
 * int 수학=43;
 */
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=80;
		int math=75;
		int total=kor+eng+math;
		double avg=total/3.0; //정수 나누기 정수=정수, 정수를 나눌 때는 .0으로 나눠야 함
		System.out.println("국어점수"+kor+"점");
		System.out.println("영어점수"+eng+"점");
		System.out.println("수학점수"+math+"점");
		System.out.println(total);
		System.out.println(avg);
		System.out.printf("평균:%.2f",avg); // :%.2f 소수점 두 자리 반올림해서 나타내기
	}

}
