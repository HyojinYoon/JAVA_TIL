package test.day0312;

public class IfEx02 
{
	public static void main(String[] args) 
	{
		int x = 10;
		if(x > 10) //true일 때의 블록
		{
			x = 100;
			System.out.println("크다");
		}
		else //false일 때의 블록
		{
			x = 50;
			System.out.println("작다");
		}
		//if와 else 중에 하나만 실행됨. true/false
		System.out.println("x="+x);
		System.out.println("종료..!!");
		
		/*삼환연산자
		x > 0 ? x=100; System.out.println("크다"); : x=50; System.out.println("작다");
		간단한 구조로 사용할 때만 사용 ex) x > 0 ? 100 : 50; , 하지만 주로 if문으로 다 사용함 */
	}
}
