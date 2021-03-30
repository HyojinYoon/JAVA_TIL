package test.day0330;

import java.util.ArrayList;

public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("hello");
		// list.add(100); -> <String>으로 지정되어 있기 때문에 int 사용 불가
		
		String str = list.get(0); // <String>제네릭이 세팅되어 있기 때문에 바로 String으로 받을 수 있음. 0번째에 뭐가 있는지 모르기 때문.
	}
}
