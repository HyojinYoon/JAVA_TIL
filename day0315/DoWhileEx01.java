package test.day0315;

public class DoWhileEx01 
{
	public static void main(String[] args) 
	{
		int x = 0;
		do 
		{
			System.out.println("hello");
			x++; //������
		}
		while(x < 3); //���ǽ�
		// �ּ� �� ���� ������ �ϰ� �ȴ�.	
		
		x = 0;
		while(x < 3)
		{
			x++;
		}
		System.out.println("hello");
	}
}
