package test.day0319;
class B{
	int b = 1000; // 인스턴스 변수 (A클래스에서 객체 생성)
}
class A{
	int a = 500; // 인스턴스 변수 - 객체를 생성 후에 사용 가능(Test클래스에서 객체 생성)
	B b1 = new B(); // 인스턴스 참조형 변수
	B b2; // B b1 = null;
}
class Test{
	static int x = 200; // 클래스 변수
	static int y = Main.x; // -> Main의 x를 y에 대입 가능.(같은 종류이기 때문에 같은 시점에 실행됨)
	static A a1 = new A(); // 클래스 참조형 변수
}

public class Main {
	static int x = 100; // 클래스 변수
	
	public static void main(String[] args) // -> 한 파일에 main은 1개!!
	{
		System.out.println(Main.x); // -> 클래스명.변수명 (생략하지 않는 것이 좋음)
		System.out.println(x); // -> 자기 클래스에서 실행되기 때문에 클래스명 생략가능
		
		System.out.println(Test.x); // -> Test클래스의 x변수
		
		System.out.println(Test.a1.a); // -> newA()로 객체가 만들어지고 그 안의 a를 출력
									   // *** newA()인 a1만 출력하면 주소만 출력됨.
		System.out.println(Test.a1.b1.b); // Test클래스의 a1=A클래스-b1=B클래스-b=1000;
		System.out.println(Test.a1.b2); // b2는 null이기 때문에 더 내려갈 값이 없음

	}
}

