package test.day0312;

public class IfEx04 
{
	public static void main(String[] args) 
	{
		int x = 25;
		if (x > 50) //false
		{
			System.out.println("if true");//���ǽ� true �� ��
		}
		else if(x < 0) //false�� �� �� ���ǹ��� ����� �� ����. �ٽ� t/f�� üũ. else if�� ���� �� ��� ����.
		{
			System.out.println("else if true");
		}
		else if(x > 10)
		{
			System.out.println("else if true");
		}
			
		else //�� else if�� ���ǽ��� �� false �� ��
		{
			System.out.println("else"); //else���� ��� ���ǿ� �������� ���� �� ����ϴ� ���̱� ������, ���� �������� ��ġ�ؾ� ��
		}
	}
}
