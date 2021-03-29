package test.day0329;

class A {
	public String toString() {
		return "A class";
	}
	
}

public class ObjectEx01 {
	public static void main(String[] args) {
		String s1 = "hello"; // String = ������ , s1�� ������ ����
		String s2 = "hello";
		
		System.out.println(s1 == s2); // true - s1�� s2�� �ּҴ� ����.
		/*String�� Ư¡ : ""�� new���� ���� ����.(jvm�� ����) �� �� ������ ���ڴ� ���� �ϱ� ������ �ּҰ� ������ */
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s3 == s4); // false // == : �⺻�� ��
		/*String�� Ư¡ : new�� ��ü ������ �ϸ� ������ ���ο� �޸𸮸� ������ - �ּҰ� �ٸ� */
		
		System.out.println(s3.equals(s4)); // equals - String�� ���ڿ��� ���� �� �ְ� ���ִ� ��(hello) // equals : ������ ��	
		
		// StringBuffer
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}

// ��� / �ʵ�(���) / ������ / �޼��� ���� ��� Ȯ��
// - equals(), toString() �������̵� ���� Ȯ�� (�������̵� ���� �ʴ� ��쵵 ����)