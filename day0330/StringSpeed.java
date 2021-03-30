package test.day0330;

public class StringSpeed {
	   public static void main(String[] args) {
	      String str = "";
	      long start = System.currentTimeMillis(); // 현재시간을 1000/1초로 변환하여 리턴
	      for(int a = 0 ; a < 100000 ; a++) {
	         str+=a;
	      }
	      long end = System.currentTimeMillis();
	      System.out.println(end - start);
	      
	      StringBuffer sb = new StringBuffer("");
	      start = System.currentTimeMillis();
	      for(int a = 0 ; a < 100000 ; a++) {
	         sb.append(a);
	      }
	      end = System.currentTimeMillis();
	      System.out.println(end - start);
	   }
	}