package test.day0401;

import java.math.BigInteger;

/*����3.
1~100������ �� �� ���Ͻÿ�.
1~100������ �� �� ���Ͻÿ� */
public class ApplyTest03 {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		
		for(a = 1; a <= 100; a++) {
			sum = sum += a;
		}
		System.out.println(sum);
		test03();
	}
	public static void test03() {
		BigInteger bi = new BigInteger("1");
		for(int i = 1; i <= 100; i++) {
			bi = bi.multiply(BigInteger.valueOf(i));//()�ȿ� BigInteger ��ü ���� �ʿ�(biginteger*ibjinteger�Ǿ���)
		}
		System.out.println(bi);	
	}
}
