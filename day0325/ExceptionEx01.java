package test.day0325;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		int num = 10;
		for(int a = 0; a < 10; a++) {
			int x = (int)(Math.random() * 10); // 0~9������ ���ڰ� �������� ����
			try {
				System.out.println(num/x); // �������� 0�� ������ ������ ����
			}catch(Exception e ) {
				System.out.println("0 �߻�");
			}
		}
	}
}
