package test.day0319;
//�̱��� - ��ü �ϳ��� ���� ����� �� �ִ� ����
class Sing{
	public int x = 100; // �ν��Ͻ� ����
	private static Sing s1 = new Sing(); // �ڽ��� ��ü
	private Sing() {} // ������
	public static Sing getInstance() { // Ŭ���� �޼���
		return s1;
	}
	
}
public class Main06 {
	public static void main(String[] args) {
		// Sing Ŭ������ x�� ����Ͻÿ�.
		//Sing s= new Sing(); -> �����ڰ� private�� ���� �Ұ�
		Sing s= Sing.getInstance(); // Ŭ���� �޼��带 ���ؼ� s1�� �ּҸ� ����
		System.out.println(s.x);
	}

}
