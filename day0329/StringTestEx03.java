package test.day0329;
// String 연습문제 3번
public class StringTestEx03 {
	public static void main(String[] args) {
		System.out.println(make("Java Data Base Conectivity"));
		System.out.println(make("Java Server Pages"));
		System.out.println(make("Enterprise Java Beans"));
	}
	
	public static String make(String msg) {
		String result= "";
		
		for(int i = 0; i < msg.length(); i++) {
			if(i == 0 || msg.charAt(i-1) == ' ') {
				result+=msg.charAt(i);
			}
		}
		return result;
		
	  //또 다른 방법
	  /*String result= "";
	    String [] sp = msg.split(" ");
		for(String s : sp) {
		char c = s.charAt(0);
		result += c;
		}
		return result;*/
	}
}
