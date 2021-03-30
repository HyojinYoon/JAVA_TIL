package test.day0329;

public class StringTestEx04 {
	public static void main(String[] args) {
		String data = "basic/java_web/jsp_framework/spring";
		char[] arr=data.toCharArray(); // data.toCharArray() String-> char[]
		
		System.out.println(arr.length); // -> 35글자
		
		System.out.println(data);
		System.out.println(process(arr));
	}
	static String process(char[] arr) {

		
		String str = new String(arr);
		System.out.println(str);
		str = str.replace('/', ':');
		str = str.replace('_', ' ');
		
		return str;
		
	}	
	 // 또 다른 방법
	  /*String arr2 = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '_') {
				arr2 += " ";
			}else if(arr[i] == '/') {
				arr2 += ":";
			}else {
				arr2 += arr[i];
			}
		}
		return arr2;*/
	}
