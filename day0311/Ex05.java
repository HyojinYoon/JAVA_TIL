package test.day0311;

public class Ex05 
{
	public static void main(String[] args)
	{
		//연산에서 많이 사용되는 것은, int, double. boolean은 단독으로 사용
		int x = 10;
		double y = 5.7;
		System.out.println(x+y); //다른 타입을 더했을 때에는 더 큰 타입의 형식으로 출력됨.(정수<실수)
		System.out.println(10 / 3); //10은 int, 3도 int 즉, int/int 임으로 int의 결과로 나옴. so, 소수점이 안나오는 것
		System.out.println(10.0 / 3); //소수점이 나오게 하려면 하나는 double로 만들어줘야함.
		
		char a = 'A';
		int b = 10;
		System.out.println(a+b); //char'A'는 65, char은 2byte int는 4byte이기 때문에 int로 출력
		
	}

}
