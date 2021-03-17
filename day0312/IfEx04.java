package test.day0312;

public class IfEx04 
{
	public static void main(String[] args) 
	{
		int x = 25;
		if (x > 50) //false
		{
			System.out.println("if true");//조건식 true 일 때
		}
		else if(x < 0) //false일 때 또 조건문을 사용할 수 있음. 다시 t/f를 체크. else if는 여러 번 사용 가능.
		{
			System.out.println("else if true");
		}
		else if(x > 10)
		{
			System.out.println("else if true");
		}
			
		else //위 else if의 조건식이 또 false 일 때
		{
			System.out.println("else"); //else문은 모든 조건에 만족되지 않을 때 사용하는 것이기 때문에, 가장 마지막에 위치해야 함
		}
	}
}
