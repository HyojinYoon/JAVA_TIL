package test.day0324;

public class Dog implements Control{ // 인터페이스를 구현한다는 의미
/*public class Dog extends ~~~ implements Control 로 상속받고 인터페이스 구현 가능*/
	
	// 상속(extends) - 하나의 클래스만 상속 받을 수 있다.
	// 인터페이스(구현-implements) - 여러 개의 인터페이스 구현 가능 
	
	
	 // 클래스 입장에서 Dog이후는 조상 부분 - 오버라이딩하여 사용 필요.
	public void name() {
		System.out.println("강아지");
	}
	public void sound() {
		System.out.println("으르렁");
	}

}
