package test.day0324;

public class Inner01 {
	int value = 10; // 인스턴스 변수
	
	public void add() {
		int x = 100; // 지역변수
		class C{ // 지역클래스 - 메서드 안에서만 사용 가능.
			public void getData() {
				System.out.println(x);
				System.out.println(value);
			}
		}
		C c = new C(); // 메서드 내부에서 객체 형성 해야 함
		c.getData(); // 메서드 안에서 객체 호출
	}
	
	
	class B
	{
		int value = 20; // 인스턴스 변수
		void method() {
			int value = 30; // 지역변수
			System.out.println(value); // 30
			System.out.println(this.value); // 20
			System.out.println(Inner01.this.value); // 10
		}
	}
}
