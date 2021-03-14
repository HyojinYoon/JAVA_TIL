package test.day0312;

public class IfEx03 
{
	public static void main(String[] args) 
	{
		//리팩토링 작업
		int x = 10;
		int result = 50;
		String s = "작다"; //else에 해당하는 내용
		if(x > 0)
		{
			result = 100;
			s = "크다";  //if블록이 false면 위에 값이 출력
		}
		System.out.println(s);
		System.out.println("result="+result);
		System.out.println("종료..!!");
	}
}
