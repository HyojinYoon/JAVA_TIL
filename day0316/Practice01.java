package test.day0316;

public class Practice01 {
	public static void main(String[] args) 
	{
		//01.������� 12��
		int star = 5; // �� 
		int space = 0; // ���� 
		boolean status = true; 
		for(int a = 0; a < 9; a++)
		{
			for(int b = 0; b < star; b++)
			{
				System.out.print("*");
			}
			System.out.println(); 
			if(status) {
				star--;
			}
			else {
				star++;
			}
			if(star == 1) {
			status = false;
			}
		}
	}

}
