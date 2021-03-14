package test.day0311;

public class Oper02 
{
	public static void main(String[] args) 
	{
		int x = 100000 * 100000;
		System.out.println(x); //100억이 나와야하지만 int는 20억까지만 표시할 수 있음. but, 오류가 아닌 다른 값이 나오는 이유는 문법적으로 틀린 것은 없음
		long y = 100000 * 100000;
		System.out.println(y); //long은 100억단위를 표시할 수 있지만 다른 값이 나오는 이유: int*int인것은 여전하기 때문. ==> long*int, long*long 변경 필요
		long z = 100000L * 100000; //뒤에 L를 삽입하여 long으로 만들어주면 됨
		System.out.println(z); //100억
		
		//byte의 범위 : -128~127
		byte a = (byte)(100+30); //130 , byte와 short은 long처럼 L로 붙이는 것이 아니라 이름 자체를 붙여줌
		System.out.println(a); //-126 이유: 맞는 값은 -130이지만 byte는 표현을 할 수 없음. 
							//표현 범위 안에서 다시 도는 것. 127까지 가고 남은 3은 -128, -127, -126해서 -126으로 출력
		
		int i = 10;
		System.out.println(i % 4); // 10을 4로 나누면 4개씩 나누고 2개가 남았다. 10%3일 경우, 3개씩하고 1개 남았다로 1 출력
		
		// 증감
		// 사칙
		// 비교 ( >, <, >=, <=, ==)
		// 논리 (||, &&, !)
		// 삼항 (조건 ? true : false)
		// 대입 (=)
		
	int l = 2;
	int m = (int)l;
	System.out.println(m);
	
	double o = 3.4;
	int p = (int)o;
	System.out.println(p);
	
	int q = 3;
	double r = (double)(q);
	System.out.println(r);
	
	}
}

 