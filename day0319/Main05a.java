package test.day0319;

class Pro{
	public static int x = 10;
	private static int y = 10;
	public static void add() {}
	private static void sum() {}
	
	public int a = 1000;
	private Pro(){ //생성자 , private Pro(){}가 되면 다른 클래스에서 객체 생성이 불가.
	 // 생성자는 기본으로 public 접근제한자를 사용.
	}
	

}
public class Main05a {
	public static void main(String[] args) {
		System.out.println(Pro.x);
		//System.out.println(Pro.y); // 오류 - private은 접근할 수가 없음
		
		Pro.add();
		//Pro.sum(); // 오류
	}
}
