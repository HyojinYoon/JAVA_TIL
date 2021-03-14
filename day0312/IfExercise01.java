package test.day0312;

public class IfExercise01 
{
	public static void main(String[] args) 
	{
		int score = 95;
		if (score >= 95)
		{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급");
		}
		else if (score > 90)
		{
			System.out.println("B등급");
		}
		else
		{
			System.out.println("재시험");
		}
		System.out.println("시험결과 끝..");
	}
}
