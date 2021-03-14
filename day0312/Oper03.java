package test.day0312;

public class Oper03 
{
	public static void main(String[] args) 
	{
		//삼항 연산자 ->if문이 삼항 연산자를 대신하기 때문에 주로 if문을 사용함
		int x = 10;
		int y = 20;
		// 조건식 ? true값 : false값; (조건식이 true면 true값을, false면 false값을 실행)
		System.out.println(x > y ? 100 : 200); //-> 200
		System.out.println(x > y ? "크다" : "작다");
		System.out.println(x < y ? "크다" : "작다");
		
		//대입 연산자
		System.out.println(x += y); //더하고 대입해라, x = x+y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x -= y); //빼고 대입해라, x = x-y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x *= y); //곱하고 대입해라, x = x*y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x /= y); //나누고 대입해라, x = x/y;
		System.out.println(x);
		System.out.println(y);
	}
}
