package test.day0315;

public class ForEx03 
{
	public static void main(String[] args) 
	{
		for(int a = 0; a < 3; a++)
		{
			for(int b = 0; b < 3; b++) // for문 안에 for문 삽입(블록 내 for문은 대표for문의 수행문일 뿐)
			{
				System.out.println(a+" "+b);
			}
		}
		//구구단
		for(int x = 2; x < 10; x++) // 단
		{
			for(int y = 1; y < 10; y++) // 곱하는 수
			{
				System.out.println(x+" x "+y+" = "+(x*y)); // 구구단 식
			}
		}
	}
}
