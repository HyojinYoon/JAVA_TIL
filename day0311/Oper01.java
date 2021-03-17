package test.day0311;

public class Oper01 
{
	public static void main(String[] args) 
	{
		int a = 10;
		++a; //증감연산자 - 변수이름 앞뒤에 모두 사용 가능
		// a++; 
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//System.out.println(++a); // 1증가(연산) 후 출력
		System.out.println(a++); //출력 후 연산 (출력값은 연산이 되기 전의 값)
		System.out.println(a); //다시 출력을 하면 연산된 값이 촐력
		
		// 변수의 값 변경 - (=)대입
		// 증감 연산자
		++a; // a = a+1; 1증가한 값으로 a의 값이 변경이 됨
		// System.out.println(++a); 가 11이면, 다시 System.out.println(a);로 출력해도 11로 변경되어 있음
		//but, System.out.println(a++);이면 10으로 출력이 되고, 다시 System.out.println(a)를 할 때 11로 출력이 됨.->출력 후 연산
	}
}
