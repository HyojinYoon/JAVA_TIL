package test.day0330;

import java.util.Date;

import java.text.SimpleDateFormat;

public class DateEx01 {
	public static void main(String[] args) {
		Date day01 = new Date();
		System.out.println(day01);
		
		Date day02 = new Date(2021-1900,2,30); // ���� 0������ ���۵�.
		System.out.println(day02);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(day01));
		System.out.println(sdf.format(day02));
	}
}

/* ���α׷����� ��¥ ����. - ���ؿ������� ������ ������ �귯�� �ð��� ����ؼ� ��µǴ� ����
   1900�� 1/1 0�� 0�� 0��
   1970�� 1/1 0�� 0�� 0�� 	
   �� �� � �������� �����Ǿ� �ִ��� API �����ڸ� �а� Ȯ�� �ʿ� */