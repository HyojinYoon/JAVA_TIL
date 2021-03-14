package test.day0312;

public class IfEx01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		if( x > 0 ) //조건식
		{ //조건식이 true일 때, 실행되는 블록
			System.out.println("x 는 0 보다 크다.");
		}
		if( x > 10)
		{
			System.out.println("x 는 0 보다 크다."); //조건식이 false이기 때문에 수행되지 않아 어떠한 값도 추출되지 않음.
		}
		System.out.println("종료..!!");
	//삼환연산자는 false일 때도 실행조건을 써준다면, if문은 false는 실행되지 않음.
		if( x > 0 )
		{
			x = 100;
			System.out.println("x="+x);
		}
	}
	
}
