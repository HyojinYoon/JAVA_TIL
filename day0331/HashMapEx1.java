package test.day0331;

import java.util.*;

class HashMapEx1{
   public static void main(String[] args) {
      HashMap map = new HashMap();
      map.put("java", "1234"); // key = id , 값 = pw
      map.put("asdf", "1111");
      map.put("asdf", "1234");
      map.put(100, "abcd");
      
      System.out.println(map);

      Scanner s = new Scanner(System.in); // Scanner클래스로 입력받는 것은 숫자.문자
      // 화면으로부터 라인단위로 입력받는다.
      while(true) {
         System.out.println("id와 password를 입력해주세요.");
         System.out.print("id :");
         
         String id = s.nextLine().trim(); // trim : 공백제거
         System.out.print("password :");
         
         String password = s.nextLine().trim();
         System.out.println();
         
         if(!map.containsKey(id)) { // 해당 맵에 key가 있느냐
            System.out.println("id는 존재하지 않습니다. 다시 입력해주세요.");
            continue;
         } else {
            if(!(map.get(id)).equals(password)) { // equals : 해당 value와 비교
             System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
               System.out.println("id와 비밀번호가 일치합니다.");                  
               break;
            }}} } }
