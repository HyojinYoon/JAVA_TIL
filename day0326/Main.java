package test.day0326;

public class Main {

	public static void main(String[] args) { 
		
		//API 활용 - lang패키지는 기본패키지이기 때문에 import없이 사용 가능.
		// Integer 클래스의 필드(상수)를 모두 출력하시오.
		System.out.println(Integer.BYTES); // 4바이트
		System.out.println(Integer.MAX_VALUE); // int의 최대값
		System.out.println(Integer.MIN_VALUE); // int의 최솟값
		System.out.println(Integer.SIZE); // 32 비트 = 4바이트
		System.out.println(Integer.TYPE);
		
		int result = Integer.max(10, 20); // max 메소드에 int값을 대입하고 리턴값을 result에 대입
		
		Integer in = new Integer(10); // integer의 생성자는 int와 String만 가능하게 되어 있음.
		Integer in2 = new Integer("55"); // 문자이지만 숫자형식을 띄고 있는 것을 넣으라고 설정 되어 있음. 즉, 문자55를 숫자55로 바꿔줌
		int val = in.intValue();
		int val2 = in2.intValue();
		System.out.println(val);
		System.out.println(val2);
		
		// Date 클래스의 getYear()메서드를 호출하시오.
		/*기본패키지 (java.lang)을 제외한 다른 패키지의 클래스를 사용하는 경우,
		  -> 클래스의 풀네임 사용 / import 후 사용 */
		java.util.Date day = new java.util.Date(); //date는 날짜, 시간 관련 정보를 제공하는 클래스
		int year = day.getYear(); // get: 꺼낸다. Year에 있는 정보 = 년도
		System.out.println(year); // -> 121 => 해당 메서드는 1900을 기준으로 흘러온 시간을 출력해줌.
		System.out.println(year + 1900 + "년");
	}
}
