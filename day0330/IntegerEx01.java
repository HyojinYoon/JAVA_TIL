package test.day0330;

public class IntegerEx01 {
	public static void main(String[] args) {
		String str = "200";
		int num = 100;
		System.out.println(str+num); //->200100
		
		int num2 = Integer.parseInt(str); //����Ÿ�� int - parseInt : ����200�� ����200���� �������� -> ���������� ���ڷ� ����
		
		System.out.println(num+num2);
	}
}
