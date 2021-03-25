package test.day0324;

public interface Control {
//인터페이스의 접근제한자는 public으로 고정되어 있음.
	public static final int x = 100; // 클래스 상수
		/*생략가능*/		int y = 200; // 클래스 상수
	
	public abstract void name(); // 추상 메서드
	   /*생략가능*/   void sound(); // 추상 메서드
}

