package test.day0319;

class Pro{
	public static int x = 10;
	private static int y = 10;
	public static void add() {}
	private static void sum() {}
	
	public int a = 1000;
	private Pro(){ //������ , private Pro(){}�� �Ǹ� �ٸ� Ŭ�������� ��ü ������ �Ұ�.
	 // �����ڴ� �⺻���� public ���������ڸ� ���.
	}
	

}
public class Main05a {
	public static void main(String[] args) {
		System.out.println(Pro.x);
		//System.out.println(Pro.y); // ���� - private�� ������ ���� ����
		
		Pro.add();
		//Pro.sum(); // ����
	}
}
