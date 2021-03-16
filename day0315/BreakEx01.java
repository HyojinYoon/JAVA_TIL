package test.day0315;

public class BreakEx01 
{
	public static void main(String[] args) 
	{
		for(int a=0; a < 10; a++)
		{
			if(a == 5) {
				break; // 5가 되면 반복멈춤.
			}
			System.out.println(a);
		}
		for(int a=0; a < 10; a++)
		{
			if(a == 5) {
				continue; // 5빼고 출력되는 결과.반복하다가 5가 되었을 때, 수행을 멈추고 다음 동작으로 가라(출력으로 내려가지 말고 증감으로 넘어가라.)
			}
			System.out.println(a);
		}
	}
}
