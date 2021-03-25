package test.day0324;

public class InnerMain {
	public static void main(String[] args) {
		Inner i = new Inner(); // Inner객체 생성하여 A를 메모리에 올림.(k는 아직)
		Inner.A a = i.new A(); // A 객체 생성하여 k를 메모리에 올림.
		System.out.println(a.k);
		
		
		System.out.println(Inner.B.x); // static - 객체 생성없이 이름으로 가능
		
		
		Inner.B b = new Inner.B(); // 인스턴스 - 객체 생성 후 사용
		System.out.println(b.y);
	}
}
