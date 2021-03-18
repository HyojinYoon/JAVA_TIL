package test.day0318;

public class Ex {
	public static void main(String[] args) 
	{	
		System.out.println(A.x);
		System.out.println(A.t.channel);
		
		// y Ãâ·Â, t2-channel
		A a = new A();
		System.out.println(a.y);
		System.out.println(a.t2.channel);
	}
}
