package test.day0312;

public class IfEx03 
{
	public static void main(String[] args) 
	{
		//�����丵 �۾�
		int x = 10;
		int result = 50;
		String s = "�۴�"; //else�� �ش��ϴ� ����
		if(x > 0)
		{
			result = 100;
			s = "ũ��";  //if����� false�� ���� ���� ���
		}
		System.out.println(s);
		System.out.println("result="+result);
		System.out.println("����..!!");
	}
}
