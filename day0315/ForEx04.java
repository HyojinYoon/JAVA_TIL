package test.day0315;

public class ForEx04 
{
	public static void main(String[] args) 
	{
		// 1~100 ������ ���� ����Ͻÿ�.
		for(int a = 1; a < 101; a++)
		{
			System.out.println(a);
		}
		//����
		int sum = 0;
		for(int x = 1; x <= 100; x++)
		{
		  // sum = sum + x; //0+1, 1+2, 3+3, 6+4 ....
			sum += x;
		}
		System.out.println(sum);
		
		// 1~100������ ¦���� �� ����Ͻÿ�.(2550)
		sum = 0;
		for(int x = 2; x <= 100; x+=2) //for���ȿ��� ���� ������ �߱� ������ ������ �����̸� ��� ����.
		{
			sum += x;
			System.out.println(x);
		}
		System.out.println(sum);
	
		// Ȧ��,¦�� �����ϱ� - /2�� ���� �� ������ ���� �����̳Ŀ� ���� ���� ����.0-¦��, 1-Ȧ��
		
		for(int x = 0; x <=100; x++)
		if(x % 2 == 0) // ��Ģ������ > �񱳿�����, % - ������ ���ϴ� ������
		{
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
		// 1~100���� 100�� �ݺ�
		// Ȧ���� �� / ¦���� �� ���
		// ��� ��� ==> ¦�� : 2550 Ȧ�� : 2500
		
		int odd = 0; // Ȧ�� �� ����
		int even = 0; // ¦�� �� ����
		for(int x = 1; x <=100; x+=2)
		{
			odd += x;
		}
		for(int y = 2; y <=100; y+=2) 
		{
			even += y;
		}
			System.out.println("¦�� : "+ odd +" Ȧ�� : "+ even);
	
		/* etc */
		int aa = 0; //Ȧ�� �� ����
		int bb = 0; //¦�� �� ����
		for(int x = 1; x <=100; x++) 
		{
			if(x % 2 == 0)
				bb += x;
			else
				aa+=x;
		}
		System.out.println("¦�� : "+ aa +" Ȧ�� : "+ bb);
	}	
}
