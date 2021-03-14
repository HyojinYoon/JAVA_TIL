package test.day0312;

public class Oper02 
{
public static void main(String[] args) 
	{
		// and 연산 -> 모든 조건에 다 만족했냐에 따른 결과 추출
		 //true && true; 조건식 && 조건식 -> 조건식이 모두 true일 때 true결과가 나옴, true&&false 는 false가 나옴
		
		int x = 10;
		int y = 20;
		boolean result = x > 0 && x > y; // true && false
		System.out.println(result); // ->false	
		
		result = x > 0 && x > 5 && x > y; // true && true && false
		System.out.println(result); // ->false

		// or 연산 (||) -> 하나라도 true면 결과는 true
		result = x > 0 || x < y; 
		System.out.println(result); // ->true
		
		result = x > 0 || x > 5 || x > y; // false || true || false
		System.out.println(result); // -> true
		
		// &&와 || 섞어서 사용하지 않기!
		
		// 논리 부정 연산 (!) -> 값의 반대값 출력 (변수 값 변하는 것은 아님, 반대로 출력만 되는 것) *스위치 켜고 끄는 조건을 만들 때 사용(결과가 2가지만 있는 경우)
		boolean r = true;
		System.out.println(!r); // 반대로 출력, true->false로 false->true로 출력
		System.out.println(r);
		
		
	}
}
