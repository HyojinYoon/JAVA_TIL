package test.day0312;

public class SwitchEx01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		switch(x) //���ǽ��� ����� int. (x+10)ó�� �������� ���� ��.
		{
			case 10 ://int x = 10 ���, case 10�� ã�ư��� �� ���� ���� ��� ��µ�.
				System.out.println(10);//..�ڵ� �ۼ�
			case 20 :
				System.out.println(20);//..�ڵ� �ۼ�
				break; //���� ������ �� �ȳ����� �ٶ� ��. switch�� ����.(case�� �� ����ó�� ��� ����. case~break; case~break;)
			case 30 ://int x = 30 ���, case 30�� ã�ư��� �� ���ĺ��� ��µ�.
				System.out.println(30);//..�ڵ� �ۼ�
			default : //case�� ������ default �� ��� , default�� �������� ��ġ���� �ʾƵ� ��.
				System.out.println(100);//..�ڵ� �ۼ�
				
			/*case 1,2,3: ���� ����� x
			switch("hello") { case "hello" :  ->JAVA ver.1.7 �̻���� ����.(cmdâ�� java -version���� Ȯ��, �����ǿ��� Ȯ��)
			case 10 : case 11 : case 12 : case 13 : case 14 : ��� ����.*/
		}
	//switch�� �ȿ� switch�� ���x. switch�� �ȿ� if���� ���x. (���������δ� ����)
	}
}
