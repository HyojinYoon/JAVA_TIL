package test.day0316;

public class PracticeReview 
{

	public static void main(String[] args) 
	{
		//for/ while/ do~while(최소 1회 실행)
		
		//01.제어자문제 14번
		int star = 1; // 별 (첫줄에 1개-기준)
		int space = 4; // 공백 (첫줄에 공백 4개-기준)
		boolean status = true; //별출력 횟수가 늘어나는지 여부 판단-별이 늘어날건지 줄어들건지에 대한 기준
		for(int a = 0; a < 9; a++)
		{
			for(int b = 0; b < space; b++)
			{
				System.out.print(" "); //먼저 조건에 맞지 않을 때까지 반복 후 내려감
			}
			for(int b = 0; b < star; b++)
			{
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
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
