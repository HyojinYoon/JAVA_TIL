package test.day0324;
//��ø Ŭ����(�̳�Ŭ����)
public class Inner {
	
	class A { // �ν��Ͻ� Ŭ���� - Ŭ���� ���� ��� �Ұ�.
		      // Ŭ���� ���(final)�� ����.
		static final int xx = 100; // ��� ����
		// static int yy = 200; -> ���� ��� �Ұ�.
		int k = 500;
	}
	static class B{ // ����(static) Ŭ���� - ���� Ŭ�����̱� ������ static ����
		static int x = 100;
		int y = 200; // �ν��Ͻ� ����
	}
}
