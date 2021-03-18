package test.day0318;

public class Test {

	// 리턴타입 이름 ()
	void add() // println은 결과가 아니기 때문에 MethodEx01에 호출되었다가 void로 돌아옴.
	{
		// if / for / 연산 / 출력 등등..
		System.out.println("add 실행..!!");
		// return; 이 생략되어 있는 것.
	}
	
	int sum() 
	{
		System.out.println("sum 실행..!!");
		return 10; // int이기 때문에 return으로 정수값을 넘겨야함.
	}
	
	void aaa(int x) // int x = 50
	{
		System.out.println(x + 100);
	}
	
	void bbb(int x, int y) 
	{
		System.out.println(x+y);
	}

	void ccc(int x, String y)
	{
		System.out.println(x+" "+y);
	}
	
	int  ddd(int x, int y)
	{
		int result = x+y;
		return result;
	}
	
}
