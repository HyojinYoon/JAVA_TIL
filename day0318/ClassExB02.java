package test.day0318;

public class ClassExB02 {
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = new B();
		b1.instance();
		
		b1.q = 500;
		b1.instance();
		b2.instance();
	}
}
