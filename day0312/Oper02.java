package test.day0312;

public class Oper02 
{
public static void main(String[] args) 
	{
		// and ���� -> ��� ���ǿ� �� �����߳Ŀ� ���� ��� ����
		 //true && true; ���ǽ� && ���ǽ� -> ���ǽ��� ��� true�� �� true����� ����, true&&false �� false�� ����
		
		int x = 10;
		int y = 20;
		boolean result = x > 0 && x > y; // true && false
		System.out.println(result); // ->false	
		
		result = x > 0 && x > 5 && x > y; // true && true && false
		System.out.println(result); // ->false

		// or ���� (||) -> �ϳ��� true�� ����� true
		result = x > 0 || x < y; 
		System.out.println(result); // ->true
		
		result = x > 0 || x > 5 || x > y; // false || true || false
		System.out.println(result); // -> true
		
		// &&�� || ��� ������� �ʱ�!
		
		// �� ���� ���� (!) -> ���� �ݴ밪 ��� (���� �� ���ϴ� ���� �ƴ�, �ݴ�� ��¸� �Ǵ� ��) *����ġ �Ѱ� ���� ������ ���� �� ���(����� 2������ �ִ� ���)
		boolean r = true;
		System.out.println(!r); // �ݴ�� ���, true->false�� false->true�� ���
		System.out.println(r);
		
		
	}
}
