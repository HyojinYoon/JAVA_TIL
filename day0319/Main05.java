package test.day0319; // import, 접근 제한자
import pro.ex.Hello;

public class Main05 {
	public static void main(String[] args) {
		//pro.ex 패키지 - hello 클래스 사용하기
		//다른 패키지 클래스 사용 시, 클래스의 풀네임을 작성해야 한다.
		
		// Hello h = new Hello(); -> 클래스명만 사용 불가
		pro.ex.Hello h1 = new pro.ex.Hello();
		System.out.println(h1); // -> Hello클래스의 주소 출력
		
		/* 상단에 import로 사용할 패키지 및 클래스 이름을 설정해두면 */
		Hello h = new Hello(); // 클래스명만 사용 가능
	// 	System.out.println(h1.msg); -> 접근 제한자 때문에 변수 사용 불가
		System.out.println(h.msg); // hello 클래스에 public 접근제한자 사용했기 때문에 출력 가능
		
	/*  System.out.println(h.x); // protected : 같은 패키지에서만. 다른 패키지라서 오류
		System.out.println(h.y); // default : 같은 패키지에서만. 다른 패키지라서 오류
		System.out.println(h.z); // private : 해당 클래스에서만. 다른 클래스라서 오류  */
		
	}

}
