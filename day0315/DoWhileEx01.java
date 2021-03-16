package test.day0315;

public class DoWhileEx01 
{
	public static void main(String[] args) 
	{
		int x = 0;
		do 
		{
			System.out.println("hello");
			x++; //증감식
		}
		while(x < 3); //조건식
		// 최소 한 번은 수행을 하게 된다.	
		
		x = 0;
		while(x < 3)
		{
			x++;
		}
		System.out.println("hello");
	}
}
