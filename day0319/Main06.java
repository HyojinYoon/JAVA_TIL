package test.day0319;
//싱글톤 - 객체 하나를 만들어서 사용할 수 있는 구조
class Sing{
	public int x = 100; // 인스턴스 변수
	private static Sing s1 = new Sing(); // 자신의 객체
	private Sing() {} // 생성자
	public static Sing getInstance() { // 클래스 메서드
		return s1;
	}
	
}
public class Main06 {
	public static void main(String[] args) {
		// Sing 클래스의 x를 출력하시오.
		//Sing s= new Sing(); -> 생성자가 private라서 접근 불가
		Sing s= Sing.getInstance(); // 클래스 메서드를 통해서 s1의 주소를 받음
		System.out.println(s.x);
	}

}
