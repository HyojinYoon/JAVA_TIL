package test.day0312;

public class IfEx01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		if( x > 0 ) //���ǽ�
		{ //���ǽ��� true�� ��, ����Ǵ� ���
			System.out.println("x �� 0 ���� ũ��.");
		}
		if( x > 10)
		{
			System.out.println("x �� 0 ���� ũ��."); //���ǽ��� false�̱� ������ ������� �ʾ� ��� ���� ������� ����.
		}
		System.out.println("����..!!");
	//��ȯ�����ڴ� false�� ���� ���������� ���شٸ�, if���� false�� ������� ����.
		if( x > 0 )
		{
			x = 100;
			System.out.println("x="+x);
		}
	}
	
}
