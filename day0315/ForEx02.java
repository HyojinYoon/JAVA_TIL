package test.day0315;

public class ForEx02 
{

	public static void main(String[] args) 
	{
		for(int x = 0; x < 3; x++ ) 
		{
			System.out.println(x);
		}
		//System.out.println(x); // --> for문 안에서 변수가 선언되었기 때문에 for문 밖에서는 사용 불가.(지역변수 특징)

		int y,z;
		for(y = 0, z = 1; y < 3; y+=2) // --> for문 밖에서 변수 선언. 변수 여러 개 사용 가능(잘 사용 x)
		{						//y++증감연산자로만 사용할 필요는 없음.(x+=2도 가능-> x=x+2)
			System.out.println(y);
		}
		System.out.println(y);
	
	}

}