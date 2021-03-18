package test.day0318;

public class D {

	// static int x = 200; // 클래스 기본형 변수 - 종류가 달라도 같은 클래스에서 동일한 변수이름 사용 불가
	int x = 10; // 인스턴스 기본형 변수
	
	void add() {
		int x = 200; // 지역변수 - 동일한 변수이름 사용 가능
		System.out.println(x); // -> x는 지역변수가 우선으로 대입됨.
		
		/* this - 해당 객체의 주소를 가지고 있다.
		 		  인스턴스 변수와 지역변수의 이릉이 같을 때 구별하는 용도로 사용한다.
		          생성자, 인스턴스 메서드에서만 사용 가능 */
		
		System.out.println(this.x); // -> 인스턴스 변수 x를 사용하고 싶을 때, this.x로 사용. 이름이 같을 때 구분하는 용.
		
		/* Static int x = 10; 일 경우 
		   System.out.println(D.x); -> 클래스 이름.변수 이름 ==> 클래스 변수 사용 시에는 클래스 이름을 사용하기!
		   System.out.println(this.x); 두 가지 모두 가능 */
		
	}
}
