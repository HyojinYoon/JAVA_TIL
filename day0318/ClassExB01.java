package test.day0318;

public class ClassExB01 {
	public static void main(String[] args) {
		// B 클래스의 p 변수 출력 - (클래스 이름. 변수이름)
		System.out.println(B.p);
		
		// B 클래스의 q변수 출력 - 인스턴스 -> 객체 형성 후 출력
		B b1 = new B();
		System.out.println(b1.q);
		
		// instance 메서드 호출 - 객체 생성 후 사용
		b1.instance();
		
		// 클래스 메서드 method() 호출 - 클래스이름.메서드이름
		B.method();
	}
}
