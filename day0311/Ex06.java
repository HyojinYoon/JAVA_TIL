package test.day0311;

public class Ex06 
{
	public static void main(String[] args) 
	{
		// (중요!) 변수 사용 방법
		
		// 프로그램의 구조 : 변수 / 메서드(함수)로 이루어져 있음
		// 변수 선언과 초기화 (변수 선언 = 메모리에 올려라!)
		// 타입 이름 = 값;
		int a = 10; //정수
		System.out.println(a);
		//int a = 300; 변수의 이름은  동일할 수 없음. int b = 300;
		double b = 5.6; //실수
		boolean c = true; //논리
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//a = 100 //다시 대입할 수 있음(100으로 변경되어서 다시 출력할 수 있음)
				
		//System.out.println(d);
		//int d = 500; //선언을 먼저 하고 출력명령을 해야함.
		
		// 대입(=)은 복사
		int x = a;
		a = x; //같은 타입일 때 어떤 조건 없이 가능
		
		// 형변환 = 서로 다른 타입에 대입하는 것
		// 논리형 타입은 다른 타입과 대입할 수 없다. 단독으로만 사용
		// 정수 < 실수
		// 프로그래밍에서 크다,작다 => 데이터 타입으로 결정
		double y = 5.7;
		int z = (int)y; // int(4) = double(8) 큰 타입을 작을 타입에 대입하는 것->디모션, 다운캐스팅
		
		int zz = 10;
		double yy = (double)zz; // 작은 타입을 큰 타입에 넣는 것 -> 프로모션 , 앞에 (double) 생략 가능하나 표시를 해주는 것이 좋음.
		
		z = (int)y;
		y = (double)z;
		
		// 변수를 연산할 때
		// ex.10/3 ==> 3.333333333
		// 프로그래밍에서는 연산하기 전, 타입을 확인함. int인지 double인지.
		// 10/3 ==> int/int이기 때문에 3만 나옴
		// 10.0/3 , 10/3.0 등으로 정확하게 타입 표시를 해줘야 함 
	}	
}
