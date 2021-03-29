package test.day0326;

public class Main {

	public static void main(String[] args) { 
		
		//API Ȱ�� - lang��Ű���� �⺻��Ű���̱� ������ import���� ��� ����.
		// Integer Ŭ������ �ʵ�(���)�� ��� ����Ͻÿ�.
		System.out.println(Integer.BYTES); // 4����Ʈ
		System.out.println(Integer.MAX_VALUE); // int�� �ִ밪
		System.out.println(Integer.MIN_VALUE); // int�� �ּڰ�
		System.out.println(Integer.SIZE); // 32 ��Ʈ = 4����Ʈ
		System.out.println(Integer.TYPE);
		
		int result = Integer.max(10, 20); // max �޼ҵ忡 int���� �����ϰ� ���ϰ��� result�� ����
		
		Integer in = new Integer(10); // integer�� �����ڴ� int�� String�� �����ϰ� �Ǿ� ����.
		Integer in2 = new Integer("55"); // ���������� ���������� ��� �ִ� ���� ������� ���� �Ǿ� ����. ��, ����55�� ����55�� �ٲ���
		int val = in.intValue();
		int val2 = in2.intValue();
		System.out.println(val);
		System.out.println(val2);
		
		// Date Ŭ������ getYear()�޼��带 ȣ���Ͻÿ�.
		/*�⺻��Ű�� (java.lang)�� ������ �ٸ� ��Ű���� Ŭ������ ����ϴ� ���,
		  -> Ŭ������ Ǯ���� ��� / import �� ��� */
		java.util.Date day = new java.util.Date(); //date�� ��¥, �ð� ���� ������ �����ϴ� Ŭ����
		int year = day.getYear(); // get: ������. Year�� �ִ� ���� = �⵵
		System.out.println(year); // -> 121 => �ش� �޼���� 1900�� �������� �귯�� �ð��� �������.
		System.out.println(year + 1900 + "��");
	}
}
