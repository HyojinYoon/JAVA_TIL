package test.day0315;


public class Practice01 
{
	public static void main(String[] args) 
	{
		//for문
		int sum = 0;
		for(int a = 0; a <=100; a++) 
		{
			sum = sum + a;
		}
		System.out.println("1~100까지의 합 = "+sum);
		
		//while문
		 sum = 0;
		int a = 0;
		while(a <= 100) 
		{
			sum = sum + a;
			a++;
		}
		System.out.println("1~100까지의 합 = "+sum);

		//dowhile문-----------질문 필요
		sum = 0;
		a = 0;
		do 
		{
			sum = sum + a;
			a++;
		}
		while(a <= 100);
		System.out.println("1~100까지의 합 = "+sum);
	
	}
	
}
