package test.day0316;

public class ArrayEx02 
{
	public static void main(String[] args) 
	{
		// �迭 ũ�� ��ɾ� : length
		// �迭�̸�.length //num.length
		int [] num = new int[10]; // ���ȣ 0~9
		int a = 1;
		
		System.out.println(num[a]); //int���� ȥ���ؼ� ��� ����. =num[1]
		
		System.out.println(num.length);
		/* int a = 10;
		 int [] = new int[a];  ����*/
				
		for(int x = 0; x < num.length; x++) // num�� ũ�⸸ŭ �ݺ����ְڴٷ� num.length ����
		{
			System.out.println(num[x]);
		}
	}
}
