package test.day0316;

public class ArrayEx02 
{
	public static void main(String[] args) 
	{
		// 배열 크기 명령어 : length
		// 배열이름.length //num.length
		int [] num = new int[10]; // 방번호 0~9
		int a = 1;
		
		System.out.println(num[a]); //int값과 혼용해서 사용 가능. =num[1]
		
		System.out.println(num.length);
		/* int a = 10;
		 int [] = new int[a];  가능*/
				
		for(int x = 0; x < num.length; x++) // num의 크기만큼 반복해주겠다로 num.length 삽입
		{
			System.out.println(num[x]);
		}
	}
}
