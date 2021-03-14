package test.day0312;

public class SwitchEx02 
{
	public static void main(String[] args) 
	{
		double x = 5.5; 
		//switch(x) { //조건식으로 사용할 수 있는 것은 int, string
		
		/* 90이상 출력A
		 * 80~89 출력B
		 * 70~79 출력C
		 * 이하 F*/
		int score = 85;
		switch(score) {
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
				System.out.println("A");
				break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				System.out.println("B");
				break;
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
				System.out.println("C");
				break;
			default :
				System.out.println("F");
		}
		//효율적으로 하는 법
		int score1 = 85;
		switch(score1 / 10) { //8.5가 되어야하지만 int값이기 때문에 8로 적용
			case 10: case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default :
				System.out.println("F");
		}
	}
}
