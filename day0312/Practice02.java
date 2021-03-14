package test.day0312;

public class Practice02 
{
	public static void main(String[] args) 
	{
		int score = 80;
		int good = (score>70 ? 'A' : 'B');
			System.out.println(good); // -> 65로 출력됨. 'A'로 출력하고 싶으면 char good = 으로 변경 필요.
		char good1 = (score>70 ? 'A' : 'B');
			System.out.println(good1);
	}
}
