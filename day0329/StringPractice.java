package test.day0329;
// String �������� 1��
public class StringPractice {
	public static void main(String[] args) {
		String str = initcap("hello world java"); // ���麰�� �ܾ �и��ϰ� [0]�� �빮�ڷ�.
		System.out.println(str);
	}
	public static String initcap(String msg) {
		String result = "";
		String [] sp = msg.split(" ");
		for(String s : sp) {
			char c = (char)(s.charAt(0)-32); //h(104) - 32 =72(H) / �빮��A�� 65 �ҹ���a�� 97 -> �ҹ��ڿ��� 32�� ���� �빮�ڰ� ��
			result += (c+s.substring(1))+" "; //(0)����ġ�� �̹� �빮�ڷ� �ٲ������ 1����.
		}
		return result;
	}
}
			
		
// �������� 2��
	/*	String h = "Hello World";
		String j = "Java Programming!";
		
		for(int i = (h.length()-1); i >= 0; i--) {
			System.out.println(h.charAt(i));
		}
		System.out.println();
	}
}*/