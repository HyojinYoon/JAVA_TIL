package test.day0324;

public class Cat extends Animal{ 
	/*추상 클래스를 상속받으면, 자손클래스는 추상메서드를 반드시 오버라이딩 해야한다.
	  (추상 메서드가 10개이면 자손클래스에서 10개 모두 오버라이딩 필요)*/
	 
	public void name() { // 오버라이딩 - 메서드의 영역을 만들어주는 것
		System.out.println("고양이");
	}
}
