package test.day0316;

public class PracticeReview 
{

	public static void main(String[] args) 
	{
		//for/ while/ do~while(�ּ� 1ȸ ����)
		
		//01.�����ڹ��� 14��
		int star = 1; // �� (ù�ٿ� 1��-����)
		int space = 4; // ���� (ù�ٿ� ���� 4��-����)
		boolean status = true; //����� Ƚ���� �þ���� ���� �Ǵ�-���� �þ���� �پ������� ���� ����
		for(int a = 0; a < 9; a++)
		{
			for(int b = 0; b < space; b++)
			{
				System.out.print(" "); //���� ���ǿ� ���� ���� ������ �ݺ� �� ������
			}
			for(int b = 0; b < star; b++)
			{
				System.out.print("*");
			}
			System.out.println(); //�ٹٲ�
			if(status) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			if(space == 0) {
				status = false;
			}
		}
	}

}
