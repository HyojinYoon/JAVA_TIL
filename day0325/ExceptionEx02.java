package test.day0325;

public class ExceptionEx02 {
	public static void main(String[] args) {
		// add() ȣ��
		add(); // ���� Ŭ������ ���� ������ Ŭ������ ����. Exception02.add();
	}
							// throws - ���� �˸���(���ǥ��) : add()ȣ���ϸ� Null���ܰ� �߻��� �� �ִٴ� ���
	public static void add() throws NullPointerException {
		// throw - ���� �����߻�!
		throw new NullPointerException();
	}
}
