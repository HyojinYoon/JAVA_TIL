package test.day0315;

public class ExReview 
{

	public static void main(String[] args) 
	{
		// ��� if / switch
		// ���ؼ� ����� Ȱ���ϴ� ���
		// ex) ��ȿ��(x), ��ȣ ��� (�ֹι�ȣ,�й� ��)
		
		int a = 10;
		int b = 20;
		boolean result = a > b;
		if(result) // ���ǽ� true/false
		{ // if���� �ϳ��� ��ɸ� �� ��쿡�� { } ���� ����.
			a = 100;
			b = 200;  //if���� true�� �� �����ض�, if�� �ȿ� if�� ���� ����.
		}
		else // false �� �� ����Ǵ� ���
		{
			a = 0;
			b = 0;
		}	
		int x = 100;
		switch(x) // ���ǽ� int, String -->int�� String ���� ��� �Ұ�(���ǽ��� ����� int�� case�� int�� ���� ex.case "hello"�Ұ�)
		{
			case 100, 101 :
				System.out.println("case 100");
			case 200 :
				break;
			case 300 :
			default :
					
		}
		
	}
}
