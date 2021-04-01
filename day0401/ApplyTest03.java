package test.day0401;

import java.math.BigInteger;

/*문제3.
1~100까지의 합 을 구하시오.
1~100까지의 곱 을 구하시오 */
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
			bi = bi.multiply(BigInteger.valueOf(i));//()안에 BigInteger 객체 삽입 필요(biginteger*ibjinteger되야함)
		}
		System.out.println(bi);	
	}
}
