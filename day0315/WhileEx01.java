package test.day0315;

public class WhileEx01 
{
	public static void main(String[] args) 
	{
		int a = 0; // �ʱ��
		while(a < 3) // ���ǽ�(�ڸ� ����)
		{
			System.out.println("hello"); // ���೻��
			a++; // ������
		}
		// ������!
		int x = 2; // �ʱ��
		while(x < 10) //���ǽ�
		{ 				//���೻��
			int y = 1; //���೻�� - �ʱ��
			while(y < 10) //���೻�� - ���ǽ�
			{
				System.out.println(x+"x"+y+"="+(x*y));
				y++; //���೻�� - ������
			}
			x++; //������
		}
	}
}
