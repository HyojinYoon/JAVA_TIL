package test.day0315;

public class ExReview 
{

	public static void main(String[] args) 
	{
		// 제어문 if / switch
		// 비교해서 제어문을 활용하는 경우
		// ex) 윤효진(x), 번호 사용 (주민번호,학번 등)
		
		int a = 10;
		int b = 20;
		boolean result = a > b;
		if(result) // 조건식 true/false
		{ // if문에 하나의 명령만 들어갈 경우에는 { } 생략 가능.
			a = 100;
			b = 200;  //if문이 true일 때 삽입해라, if문 안에 if문 삽입 가능.
		}
		else // false 일 때 적용되는 블록
		{
			a = 0;
			b = 0;
		}	
		int x = 100;
		switch(x) // 조건식 int, String -->int와 String 동시 사용 불가(조건식의 결과가 int면 case도 int로 정의 ex.case "hello"불가)
		{
			case 100, 101 :
				System.out.println("case 100");
			case 200 :
				break;
			case 300 :
			default :
					
		}
		
	}
}
