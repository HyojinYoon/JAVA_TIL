package test.day0315;


public class Practice01 
{
	public static void main(String[] args) 
	{
		//for��
		int sum = 0;
		for(int a = 0; a <=100; a++) 
		{
			sum = sum + a;
		}
		System.out.println("1~100������ �� = "+sum);
		
		//while��
		 sum = 0;
		int a = 0;
		while(a <= 100) 
		{
			sum = sum + a;
			a++;
		}
		System.out.println("1~100������ �� = "+sum);

		//dowhile��-----------���� �ʿ�
		sum = 0;
		a = 0;
		do 
		{
			sum = sum + a;
			a++;
		}
		while(a <= 100);
		System.out.println("1~100������ �� = "+sum);
	
	}
	
}
