package test.day0330;

import java.util.ArrayList;

public class ListEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(100);
		list.add(5.7);
		list.add("hello");
		list.add("world");
		list.add(true);
		System.out.println(list);
		
		// 타입이 지정되지 않은 리스트에서 String만 출력하세요.
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof String) { // String으로 형변환이 되냐 = String이 맞냐
				String s = (String)obj;
				System.out.println("위치 : "+i+" / 값 : "+s);
			}
		}
		
		
	}
}
