package test.day0316;

public class PracticeReview01 {
	public static void main(String[] args) 
	{		
		//01.제어문문제 13번
		int star = 5; // 별 
		int space = 0; // 공백 
		boolean status = true; //별출력 횟수가 늘어나는지 여부 판단-별이 늘어날건지 줄어들건지에 대한 기준
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
