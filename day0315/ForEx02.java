package test.day0315;

public class ForEx02 
{

	public static void main(String[] args) 
	{
		for(int x = 0; x < 3; x++ ) 
		{
			System.out.println(x);
		}
		//System.out.println(x); // --> for�� �ȿ��� ������ ����Ǿ��� ������ for�� �ۿ����� ��� �Ұ�.(�������� Ư¡)

		int y,z;
		for(y = 0, z = 1; y < 3; y+=2) // --> for�� �ۿ��� ���� ����. ���� ���� �� ��� ����(�� ��� x)
		{						//y++���������ڷθ� ����� �ʿ�� ����.(x+=2�� ����-> x=x+2)
			System.out.println(y);
		}
		System.out.println(y);
	
	}

}