package test.day0311;

public class Ex03 
{
	public static void main(String[] args) 
	{
		//char은 숫자/문자로 사용 될 수 있음.
		// *** 'A'=65  'a'=97 '0'=48
		char a = 'A'; //한 글자만 가능
		char b = 50; //아스키코드표에 따라서 50은 2로 출력됨
		int x = a; //'ㄱ'은 또 다른 수치로 저장되어 있기 때문에 12593으로 출력됨
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		

	}

}
