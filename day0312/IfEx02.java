package test.day0312;

public class IfEx02 
{
	public static void main(String[] args) 
	{
		int x = 10;
		if(x > 10) //true�� ���� ���
		{
			x = 100;
			System.out.println("ũ��");
		}
		else //false�� ���� ���
		{
			x = 50;
			System.out.println("�۴�");
		}
		//if�� else �߿� �ϳ��� �����. true/false
		System.out.println("x="+x);
		System.out.println("����..!!");
		
		/*��ȯ������
		x > 0 ? x=100; System.out.println("ũ��"); : x=50; System.out.println("�۴�");
		������ ������ ����� ���� ��� ex) x > 0 ? 100 : 50; , ������ �ַ� if������ �� ����� */
	}
}
