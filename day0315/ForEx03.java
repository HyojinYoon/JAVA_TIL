package test.day0315;

public class ForEx03 
{
	public static void main(String[] args) 
	{
		for(int a = 0; a < 3; a++)
		{
			for(int b = 0; b < 3; b++) // for�� �ȿ� for�� ����(��� �� for���� ��ǥfor���� ���๮�� ��)
			{
				System.out.println(a+" "+b);
			}
		}
		//������
		for(int x = 2; x < 10; x++) // ��
		{
			for(int y = 1; y < 10; y++) // ���ϴ� ��
			{
				System.out.println(x+" x "+y+" = "+(x*y)); // ������ ��
			}
		}
	}
}
