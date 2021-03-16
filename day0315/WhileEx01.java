package test.day0315;

public class WhileEx01 
{
	public static void main(String[] args) 
	{
		int a = 0; // 초기식
		while(a < 3) // 조건식(자리 지정)
		{
			System.out.println("hello"); // 수행내용
			a++; // 증감식
		}
		// 구구단!
		int x = 2; // 초기식
		while(x < 10) //조건식
		{ 				//수행내용
			int y = 1; //수행내용 - 초기식
			while(y < 10) //수행내용 - 조건식
			{
				System.out.println(x+"x"+y+"="+(x*y));
				y++; //수행내용 - 증감식
			}
			x++; //증감식
		}
	}
}
