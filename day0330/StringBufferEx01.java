package test.day0330;

public class StringBufferEx01 {
	public static void main(String[] args) {
		//StringBuffer sb = "hello"; -> String�� �̷��� ���� ����
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		
		sb.append("world"); // append : ���� �ڿ� ����
		System.out.println(sb);
		
		sb.append(100);
		System.out.println(sb);
		
		sb.insert(0, "AAA"); // insert : ��ġ ���� ���� ���� - 0�� index�� AAA ����
		System.out.println(sb);
	}
}
