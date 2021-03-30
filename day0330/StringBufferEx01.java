package test.day0330;

public class StringBufferEx01 {
	public static void main(String[] args) {
		//StringBuffer sb = "hello"; -> String만 이렇게 생성 가능
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		
		sb.append("world"); // append : 문자 뒤에 삽입
		System.out.println(sb);
		
		sb.append(100);
		System.out.println(sb);
		
		sb.insert(0, "AAA"); // insert : 위치 지정 삽입 가능 - 0번 index에 AAA 삽입
		System.out.println(sb);
	}
}
