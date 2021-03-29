package test.day0329;

class A {
	public String toString() {
		return "A class";
	}
	
}

public class ObjectEx01 {
	public static void main(String[] args) {
		String s1 = "hello"; // String = 참조형 , s1은 참조형 변수
		String s2 = "hello";
		
		System.out.println(s1 == s2); // true - s1과 s2의 주소는 같음.
		/*String의 특징 : ""로 new없이 생성 가능.(jvm이 생성) 이 때 동일한 문자는 재사용 하기 때문에 주소가 동일함 */
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s3 == s4); // false // == : 기본형 비교
		/*String의 특징 : new로 객체 생성을 하면 무조건 새로운 메모리를 생성함 - 주소가 다름 */
		
		System.out.println(s3.equals(s4)); // equals - String의 문자열을 비교할 수 있게 해주는 것(hello) // equals : 참조형 비교	
		
		// StringBuffer
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}

// 상속 / 필드(상수) / 생성자 / 메서드 구성 모두 확인
// - equals(), toString() 오버라이딩 여부 확인 (오버라이딩 하지 않는 경우도 있음)