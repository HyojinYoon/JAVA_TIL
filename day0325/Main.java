package test.day0325;
//예외
public class Main {
	public static void main(String[] args) 
	{
		try { // 예외발생 여부 감시 - 예외발생 시 catch() 호출
			int [] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			//System.out.println(a[3]); //예외 발생 - 실행 시 발생하는 예외
		
			Main m1 = null; // 자기 클래스의 객체 생성
			System.out.println(m1);
			System.out.println(m1.toString()); //-> 예외 발생 - null인데 .을 사용해 내려갈 때 발생하는 예외
		}
		catch(Exception a) { // Exception이 Array~와 NullPoint~의 조상이기 때문에 Exception으로 한 줄만 catch 생성
			System.out.println("예외 처리!!" + a.getMessage()); //예외 내용 메세지도 함께 출력
			a.printStackTrace(); // 어디서 발생되었는지 표시
		}
		
	/*	catch(ArrayIndexOutOfBoundsException a) // 처리할 예외 클래스 선언
		{ //예외 발생한 부분에서 catch로 넘어옴.
			System.out.println("배열 인덱스 예외 처리!!");
		}
		catch(NullPointerException a){
			System.out.println("객체가 생성되지 않았습니다.");
		} */
		
	}	
}
