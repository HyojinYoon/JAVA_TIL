package test.day0325;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		int num = 10;
		for(int a = 0; a < 10; a++) {
			int x = (int)(Math.random() * 10); // 0~9사이의 숫자가 랜덤으로 나옴
			try {
				System.out.println(num/x); // 랜덤값이 0이 나왔을 때에는 에러
			}catch(Exception e ) {
				System.out.println("0 발생");
			}
		}
	}
}
