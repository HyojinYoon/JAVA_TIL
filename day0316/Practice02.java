package test.day0316;

public class Practice02 
{
	public static void main(String[] args) 
	{
		//01.������� 11��
		int star = 9; // �� 
		int space = 0; // ���� 
		boolean status = true; 
		for(int a = 0; a < 5; a++)
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
				star-=2;
			}
			else {
				space--;
				star+=2;
			}
			
			if(space == 0) {
				status = false;
			}
		}
	}
}
