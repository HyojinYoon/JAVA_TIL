package test.day0325;

public class ExceptionEx02 {
	public static void main(String[] args) {
		// add() 호출
		add(); // 같은 클래스에 있을 때에는 클래스명 생략. Exception02.add();
	}
							// throws - 예외 알리기(경고표시) : add()호출하면 Null예외가 발생할 수 있다는 경고
	public static void add() throws NullPointerException {
		// throw - 예외 강제발생!
		throw new NullPointerException();
	}
}
