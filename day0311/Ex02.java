package test.day0311;

public class Ex02 
{
	public static void main(String[] args) 
	{
		//변수 사용
		int a = 100; //리터럴(변수 선언 후, 처음 입력되었던 값)
		System.out.println(a); //()안에 변수를 바로 적용해도 됨.(변수의 이름을 출력할 수는 없음. 저장된 값만 출력)
		double b = 5.7;
		System.out.println(b);
		a = 300;
		System.out.println(a); //a에 다시 300이 대입되었다고 해서 첫번째 출력값이 300으로 변경되는 것은 아님.
		
		//int value;
		//System.out.println(value); //선언만 하고 출력하는 경우, 오류 발생. value의 값을 주지 않음.
		//int result = value + 10; // 대입(=)을 중심으로 value + 10 부분이 먼저 진행됨. 그 결과를 result에 대입하는 형식.
		int value = 100;
		System.out.println(value);
		int result = value +10; //변수를 사용하면 저장된 값을 사용하는 것임. 즉, value는 100이 저장되어 있기 때문에 100+10.
		System.out.println(result);
		System.out.println(value); 
		//변수는 대입을 했을 때에만 값이 변경됨.		
	}
}
