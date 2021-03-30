package test.day0329;

public class StringEx01 {
	public static void main(String[] args) {
		String str = "hello world"; // String 객체 생성 (JVM이 문자만 사용해도 객체 생성)
		
		System.out.println(str.length()); // 문자 수 리턴(공백도 문자취급) -> 11글자
		System.out.println(str.charAt(0)); // 지정된 위치의 문자 리턴 -> h
		System.out.println(str.indexOf('l')); // 지정된 문자의 첫위치 리턴 -> 2
		                                      /*문자가 여러번 있을 경우, 첫번째와 마지막 위치만 알 수 있음*/
		System.out.println(str.lastIndexOf("l")); // 지정된 문자의 마지막 위치 리턴 -> 9
		
		byte [] b = str.getBytes(); // byte로 쪼개서 대입
		System.out.println(b[0]); // h -> 104   /  a -> 94
		System.out.println(str.toUpperCase()); // 모두 대문자로 리턴
		System.out.println(str.toLowerCase()); // 모두 소문자로 리턴
		
		System.out.println(str.substring(6)); // 지정된 위치부터 끝까지 문자를 복사 -> world / 6번째는 w
		System.out.println(str.substring(6,9)); // 6번째부터 9번째 미만까지 복사 -> wor
		
		System.out.println(str.replace("l", "L")); // 소문자 l을 대문자 L로 변경
		
		System.out.println(str.trim()); // 앞뒤 공백 제거(중간 공백은 제거 x)
		
		System.out.println(100+100); // -> 200
		System.out.println(str.valueOf(100)+100); // 지정된 숫자를 문자로 변경 -> 100100
		System.out.println(100+""+100); // -> 100100 / valueOf를 굳이 사용할 필요 없음
		
		String [] s = str.split(" "); // 공백단위로 자른 후 배열로 리턴 [0]hello [1]world
		
		// 향상된 for문 - for(String s : 반복대상){
		// 반복대상이 가지고 있는 갯수만큼 반복. 반복할 때마다 반복대상의 값이 하나씩 왼쪽의 String s 변수에 대입
		
		// String st - 반복대상이 대입될 변수 선언
		for(String st : s) {
			System.out.println(st);
		}
		
		// 문자열 "hello"를 역순으로 출력하시오 "olleh"
		String str2 = "hello";
		for(int i = (str2.length()-1); i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		
		// - StringBuffer로 더욱 간단하게 사용 가능
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.reverse());
		
	}
}
