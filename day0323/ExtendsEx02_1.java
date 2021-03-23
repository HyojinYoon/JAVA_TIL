package test.day0323;

public class ExtendsEx02_1 {
	public static void main(String[] args) {
		Super su = new Super(); // su는 Super 자기 객체를 갖고 있지만 멤버가 3개
		
		// su객체를 Sub클래스로 대입할 수 있는가를 확인하는 것.
		if(su instanceof Sub) { // su - 참조변수, Sub - 클래스
			Sub s1 = (Sub)su;
			System.out.println("대입 가능");
		}else {
			System.out.println("대입 불가능");
		}
		
		/* 바로 대입하지 말고 instanceof로 확인 후 대입하는 것이 좋음*/
		Sub s1 = (Sub)su; // 문법적으로는 문제x. but, 자손은 5개를 충족시켜야 해서 오류.
		
		System.out.println(su);
		System.out.println(s1);
	}
}
