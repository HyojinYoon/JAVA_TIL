package test.day0329;

public class StringEx01 {
	public static void main(String[] args) {
		String str = "hello world"; // String ��ü ���� (JVM�� ���ڸ� ����ص� ��ü ����)
		
		System.out.println(str.length()); // ���� �� ����(���鵵 �������) -> 11����
		System.out.println(str.charAt(0)); // ������ ��ġ�� ���� ���� -> h
		System.out.println(str.indexOf('l')); // ������ ������ ù��ġ ���� -> 2
		                                      /*���ڰ� ������ ���� ���, ù��°�� ������ ��ġ�� �� �� ����*/
		System.out.println(str.lastIndexOf("l")); // ������ ������ ������ ��ġ ���� -> 9
		
		byte [] b = str.getBytes(); // byte�� �ɰ��� ����
		System.out.println(b[0]); // h -> 104   /  a -> 94
		System.out.println(str.toUpperCase()); // ��� �빮�ڷ� ����
		System.out.println(str.toLowerCase()); // ��� �ҹ��ڷ� ����
		
		System.out.println(str.substring(6)); // ������ ��ġ���� ������ ���ڸ� ���� -> world / 6��°�� w
		System.out.println(str.substring(6,9)); // 6��°���� 9��° �̸����� ���� -> wor
		
		System.out.println(str.replace("l", "L")); // �ҹ��� l�� �빮�� L�� ����
		
		System.out.println(str.trim()); // �յ� ���� ����(�߰� ������ ���� x)
		
		System.out.println(100+100); // -> 200
		System.out.println(str.valueOf(100)+100); // ������ ���ڸ� ���ڷ� ���� -> 100100
		System.out.println(100+""+100); // -> 100100 / valueOf�� ���� ����� �ʿ� ����
		
		String [] s = str.split(" "); // ��������� �ڸ� �� �迭�� ���� [0]hello [1]world
		
		// ���� for�� - for(String s : �ݺ����){
		// �ݺ������ ������ �ִ� ������ŭ �ݺ�. �ݺ��� ������ �ݺ������ ���� �ϳ��� ������ String s ������ ����
		
		// String st - �ݺ������ ���Ե� ���� ����
		for(String st : s) {
			System.out.println(st);
		}
		
		// ���ڿ� "hello"�� �������� ����Ͻÿ� "olleh"
		String str2 = "hello";
		for(int i = (str2.length()-1); i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		
		// - StringBuffer�� ���� �����ϰ� ��� ����
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.reverse());
		
	}
}
