/*
 * 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드) 정수 입력 이진법 처리 출력
 * 
 * import java.util.*; public class 문제_04// { static int input() { Scanner
 * scan=new Scanner(System.in);{ System.out.print("0~32767사이의 정수 입력:"); //
 * return scan.nextInt(); // } //public static void main(String[] args) { //
 * TODO Auto-generated method stub //입력 처리 //Scanner scan=new
 * Scanner(System.in);{ //System.out.print("0~32767사이의 정수 입력:"); //int
 * num=scan.nextInt();
 * 
 * //이진법 처리 => 처리 부분 //int [] binary=new int[16]; // new를 이용하면 16 개의 정수가 0으로 초기화
 * // new를 이용하게 되면 데이터형이 초기화 됨 // int => 0, double=> 0.0, boolean=> false,
 * char=>'\0', String => null // new => 동적 메모리 할당 (실행시에 메모리를 만들어서 배치)
 * 
 * //int index=15; // 뒤에서부터 값을 저장한다는 뜻임 왜냐면 16개 있는데 15번째 거 했다는거니까 //while(true)
 * { // 반복횟수를 알 수 없다(입력된 값에 따라 다르다) // 2로 나누고 나머지 값 //binary[index]=num%2;
 * 
 * // 2로 나누기 //num=num/2;
 * 
 * // num => 0이 될 때까지 //if(num==0) // break;
 * 
 * //index--; //} //출력 //for(int i=0;i<binary.length;i++);{ // if(i%4==0 &&
 * i!=0) { // System.out.println(" "); // } // System.out.println(binary[i]);
 * //} //}
 * 
 * 
 * 
 * //} //}
 * 
 * //}
 */