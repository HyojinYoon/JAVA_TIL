package test.day0330;

import java.util.Date;
import java.util.Calendar; // Calendar Ŭ������ �߻�Ŭ���� , GregorianCalendar�� �ڼ� Ŭ����
import java.util.GregorianCalendar;

public class CalendarEx01 {
	public static void main(String[] args) {
		// calendar Ŭ������ Ȱ���Ͽ� ��¥�� ����Ͻÿ�.
		Calendar c1 = new GregorianCalendar(); // ������, �ڼ�Ŭ���� Ȱ��
		System.out.println(c1);
		
		Calendar c2 = Calendar.getInstance(); // �̹� �����Ǿ� �ִ� ���� �޾ƿ� - �ڽ��� ��ü ����
		System.out.println(c2);
		
		System.out.println(c1.get(Calendar.YEAR)); // c1�� ���� �ִ� YEAR�� ������.
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		
		Date day = new Date(); // �ַ� Calendar���� Date�� ���� ���
		System.out.println(day.getYear()+1900);
	}
}
