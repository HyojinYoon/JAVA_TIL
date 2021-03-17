package test.day0312;

public class Oper01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		System.out.println(x > y); //비교연산자 , 비교는 연산 후 출력, 즉 연산값을 출력하는 것(true/false)
		System.out.println(y > x); //->true
		
		//print문 속에서 연산하지 말고 boolean으로 연산을 저장해놓자!
		
		boolean result = x > y; //print문 안에서 연산하지 말고 boolean으로 연산을 저장하고 출력하는 것이 좋은 코드.
		System.out.println(result); //비교연산자 ->false
		
		result = x < y; //위에 값은 없어짐
		System.out.println(result); //비교연산자 ->true
		
		result = x != y; // 두 값이 다르냐.
		System.out.println(result); //->true
		
		result = x == y; // 두 값이 같냐.
		System.out.println(result); //->false
		
		result = x+10 == y; //사칙연산 후 비교
		System.out.println(result); //->true
	}
}
