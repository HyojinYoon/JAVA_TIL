package test.day0330;

public class IntegerEx01 {
	public static void main(String[] args) {
		String str = "200";
		int num = 100;
		System.out.println(str+num); //->200100
		
		int num2 = Integer.parseInt(str); //리턴타입 int - parseInt : 문자200을 숫자200으로 변경해줌 -> 숫자형식을 숫자로 변경
		
		System.out.println(num+num2);
	}
}
