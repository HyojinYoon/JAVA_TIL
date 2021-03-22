package test.day0322; // 상속

/*class A (extends object){ 로 object로부터 상속받는다는 내용이 생략되어 있는 것
  object 클래스 : 최상위 클래스이며 모든 클레스가 상속받는다
  				매서드만 가지고 있음
  				- 상속을 받지 않는 클래스에 자동으로 상속된다.
  */
class A { // 변수, 메서드, 생성자 - 변수와 메서드만 상속 가능
	int x = 100; // **접근제어자가 private는 상속 불가능.
	int y = 200;
	A(){} // 기본생성자
	A(int x, int y){ // 매개변수가 2개인 생성자
		this.x = x;
		this.y = y;
	}
}

//A - 부모(조상)
//B - 자식
class B extends A{ // B클래스가 A를 상속받았다. A는 B의 슈퍼클래스.
	int y = 300;
	int z;
	B(){ //생성자
		//super(); // 조상의 생성자 호출. - 첫줄에 사용. (this() - 자신의 생성자 호출)
		super(500,600); // 조상의 생성자 호출.
		this.z = super.y; //이름이 겹치는 조상의 객체는 super로 저장.(super - 조상주소, this - 자신주소)

	}
}

// 모든 클래스는 하나의 상속을 받을 수 있음.(ex. B가 A, S 한 번에 상속은 불가능-연계연계로 상속가능 S-A, A-B)


public class ExtendsEx01 {
	public static void main(String[] args) {
		B b = new B(); // B객체를 생성해도 x, y 모두 출력 - 상속되어 있기 때문에.
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);


	}
}
