package test.day0324;

public class Main {
	public static void main(String[] args) {
		// Animal a1 = new Animal(); - 추상클래스는 객체 생성 불가.
		Animal a1 = new Cat(); // 자손으로 생성
		a1.name(); // 자손에 오버라이딩된 메서드로 사용.
		
		Control c1 = new Dog();
		c1.name();
	}
}
