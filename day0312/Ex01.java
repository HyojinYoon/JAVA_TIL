package test.day0312;

public class Ex01 
{
	public static void main(String[] args) 
	{
		// 변수 - 하나의 값 저장
		// 타입 이름 = 값;
		int a;
		a = 10;
		
		int b = 10; //가장 많이 사용되는 방법!
		
		int c,d; // 같은 타입 동시 선언 가능
		//c=10 , d=20; //대입도 동시에 불가. 
		c=10; d=20;
		
		int e=10, f=20;
		// int x, double y; 다른 타입을 동시에 선언은 불가.
		
		int x = 10; // 정수
		double y = 5.6; // 실수, 소수점 한자리는 무조건 가진다.
		boolean z = true; // 논리, true/false
		
		System.out.println(x);
		int m = x+10;
		int n = m+x; //m에 저장되어 있는 값 + x에 저장되어 있는 값 = 20+10
		
		//int o = x+10.5; //20.5가 아님. x는 int, 10.5는 double. o는 int로 구하는 것이기 때문에 오류.
		// 1. double o = x+10.5로 변경 2. int o = (int)x+10.5로 강제실행
		
		// 증감 연산자 (++,--) - 정수/실수에서 사용 가능, 이름 앞,뒤에서 사용 가능, 1증가/1감소
		++x; 
		x--;
		++y; //5.6 -> 6.6
		System.out.println(++y); //연산 후 출력, 6.6
		System.out.println(y++); //출력 후 연산, 5.6 다시 출력하면 6.6
		
		int value = 100000 * 100000;
		System.out.println(value); //int는 20억까지만 표시 가능해서 다른 값이 나옴
		// int value = 100000L * 100000 -> long 타입으로 만들어주면 가능. (int보다 작은 byte,short는 추가로 붙여주지 않아도 됨)
		
		String s = ""; //출력할 때, string과 연결하면 문자로 사용 가능
		
	}
	
}
