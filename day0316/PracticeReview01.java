package test.day0316;

public class PracticeReview01 {
	public static void main(String[] args) 
	{		
		//01.�����ڹ��� 13��
		int star = 5; // �� (ù�ٿ� 1��-����)
		int space = 0; // ���� (ù�ٿ� ���� 4��-����)
		boolean status = true; //����� Ƚ���� �þ���� ���� �Ǵ�-���� �þ���� �پ������� ���� ����
		for(int a = 0; a < 9; a++)
		{
			for(int b = 0; b < space; b++)
			{
				System.out.print(" "); 
			}
			for(int b = 0; b < star; b++)
			{
				System.out.print("*");
			}
			System.out.println(); 
			if(status) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
			}
			if(space == 4) {
				status = false;
			}
		}
	}

}
