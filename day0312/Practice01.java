package test.day0312;

public class Practice01 
{
	public static void main(String[] args) 
	{
		int a = 10;
		String b = "\"이상이다\"";
		System.out.println("\""+b+"\""+a);
		System.out.println(b+a);
		a++;
		a++;
		++a;
		System.out.println(a);
		String c = "평균";
		System.out.println(c+"\t"+b);
		int d = 20;
		if(a>15 || d>15) {
			System.out.println("맞다");
		}
	}
}
