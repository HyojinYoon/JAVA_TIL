package test.day0329;
// String 연습문제 1번
public class StringPractice {
	public static void main(String[] args) {
		String str = initcap("hello world java"); // 공백별로 단어를 분리하고 [0]을 대문자로.
		System.out.println(str);
	}
	public static String initcap(String msg) {
		String result = "";
		String [] sp = msg.split(" ");
		for(String s : sp) {
			char c = (char)(s.charAt(0)-32); //h(104) - 32 =72(H) / 대문자A는 65 소문자a는 97 -> 소문자에서 32를 빼면 대문자가 됨
			result += (c+s.substring(1))+" "; //(0)번위치는 이미 대문자로 바뀌었으니 1부터.
		}
		return result;
	}
}
			
		
// 연습문제 2번
	/*	String h = "Hello World";
		String j = "Java Programming!";
		
		for(int i = (h.length()-1); i >= 0; i--) {
			System.out.println(h.charAt(i));
		}
		System.out.println();
	}
}*/