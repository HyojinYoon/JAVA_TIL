package test.day0316;

public class ArrayEx01 
{
	public static void main(String[] args) 
	{
		// 타입 [] 이름;
		// new - 새로운 메모리를 만든다.
		/*int [] num; // null - 아무것도 없다.(주소가 없다)

		num = new int[3]; //몇 개짜리를 만들 것인지.(3개짜리를 만들겠다)*/
		int [] num = new int[3]; //방 번호 - 0,1,2 무조건 0부터 시작
		/* double [] num = new double[3]; */
		
		System.out.println(num); // -> I@7637f22 : [I - 배열임을 의미 , @뒤 16진수 - 메모리주소 =>참조한다
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]); //int로 만들어주면 기본값으로 0이 들어가있음.
		
		num[0] = 100; //0번째 num에 100 대입
		num[1] = 200;
		num[2] = 300;
		
		num[0]++;
		System.out.println(num[0]);
		System.out.println(num[1]+num[2]);
		
		int a = 100;
		System.out.println(num[0] + a); //num[0]에 있는 값도 int, a도 int라서 연산 가능. (num+a는 X - num은 주소)
		
	}
}
