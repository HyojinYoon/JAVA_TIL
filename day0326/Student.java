package test.day0326;

public class Student {
	public final static int cla = 1; //클래스 변수 (상수)
	public static Student s = new Student();
	
	int x = 100; // 인스턴스 기본형 변수***
	int y = Student.cla; // 클래스타입은 어디서든 사용 가능. y에 대입 가능
	
	// 인스턴스 변수는 객체생성 후 사용 가능 / i는 클래스변수라서 시작과 동시에 메모리에 올라감
	//public static int i = x;  - X
	//public static int i = new Student().x; //객체를 생성하고 만들어진 객체의 x를 사용해서 대입하겠다.- 사용 x
	
	/* 클래스 변수에 인스턴스 변수를 대입할 수 없다. 
	   메서드를 사용해서 대입해야 한다. */
	
	Tv t = new Tv(); // 인스턴스 참조형 변수***
}
