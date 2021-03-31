package test.day0331;

import java.io.*; 
import java.util.*; 

class StudentScore{ 
   static ArrayList record = new ArrayList(); // Student 객체 저장할 목적
   static Scanner s = new Scanner(System.in); // 계속 입력을 받아야하기 때문에 클래스로 생성

   public static void main(String args[]) { 
      while(true) { 
         switch(displayMenu()) { // display 메서드 호출
            case 1 : 
               inputRecord(); // 정보 삽입
               break; 
            case 2 : 
               deleteRecord(); // 정보 삭제
               break; 
            case 3 : 
               sortRecord(); // 정보 노출
               break; 
            case 4 : 
               System.out.println("프로그램을 종료합니다."); 
               System.exit(0); 
         } 
      } // while(true) 
   } 

   // menu를 보여주는 클래스 메서드 - int 리턴 (1~4 사이의 입력값)
   static int displayMenu(){ 
      System.out.println("**************************************************"); 
      System.out.println("*                성적 관리 프로그램              *"); 
      System.out.println("*                   version 1.0                  *"); 
      System.out.println("*                Collection Class           *"); 
      System.out.println("**************************************************"); 
      System.out.println(); 
      System.out.println(); 
      System.out.println(" 1. 학생성적 입력하기 "); 
      System.out.println(); 
      System.out.println(" 2. 학생성적 삭제하기 "); 
      System.out.println(); 
      System.out.println(" 3. 학생성적 보기"); 
      System.out.println(); 
      System.out.println(" 4. 프로그램 종료 "); 
      System.out.println(); 
      System.out.println(); 
      System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 

      int menu = 0; 
      do { 
         try { 
            menu = s.nextInt(); // nextInt : int로 값을 받음
			s.nextLine(); // nextLine : 문자열 통채로 스캔(공백포함) - nextInt로만은 다음 동작으로 넘어가지 못할수도 있기 때문에 사용

            if(menu >= 1 && menu <= 4) { 
               break; 
            } else { 
               throw new Exception(); //throw : 예외를 강제로 발생
            } 
         } catch(Exception e) { 
            System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요."); 
            System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 
         } 
      } while(true); 

      return menu; 
   } 
   
   // 입력받은 내용으로 Student 객체를 생성하고 객체를  record에 저장하는 역할
   static void inputRecord() { // 정보 삽입 역할
      System.out.println("1. 학생성적 입력하기"); 
	  System.out.println("이름,학번,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요."); 
      System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다."); 

      while(true) { 
         System.out.print(">>"); 

         do { 
            try { 
               String input = s.nextLine().trim(); //nextLine=String	// java,210010,90,80,70
               if(!input.equalsIgnoreCase("q")) { //equalsIgnoreCase : 대소문자 구분x - Q,q 모두 가능
                  Scanner s2 = new Scanner(input).useDelimiter(","); //,로 문자열 분리
                  //Student2의 객체 String으로 생성
                  record.add(new Student2(s2.next(), s2.next(), s2.nextInt(),s2.nextInt(), s2.nextInt())); // 분리된 문자열 갯수만큼 입력
                  System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요."); 
                  break; 
               } else { 
                  return;                         
               } 
            } catch(Exception e) { 
               System.out.println("입력오류입니다. 이름, 학번, 국어성적, 영어성적, 수학성적'의 순서로 입력하세요."); 
               break; 
            } 
         } while(true); 
      }
   } 

   // 학번을 입력받아 record에 저장된 객체와 비교 후 삭제하는 역할
   static void deleteRecord() { // 정보 삭제 역할
      while(true) { 
         displayRecord(); // 성적을 한 번 더 확인하도록
         System.out.println("삭제하고자 하는 데이터의 학번을 입력하세요.(q:메인화면)"); 
         System.out.print(">>"); 

         do { 
            try { 
               String input = s.nextLine().trim(); 

               if(!input.equalsIgnoreCase("q")) { 
                  int length = record.size(); 
                  boolean found = false; 

                  for(int i=0; i < length; i++) { 
                     Student2 student = (Student2)record.get(i); 
                     if(input.equals(student.studentNo)) { //학번과 비교 후에 true이면 삭제 진행
                        found = true; 
                        record.remove(i); 
                        break; 
                     } 
                  } 

                  if(found) { 
                     System.out.println("삭제되었습니다."); 
                  } else { 
                     System.out.println("일치하는 데이터가 없습니다."); 
                  } 
                  break; 
               } else { 
                  return;                         
               } 
            } catch(Exception e) { 
               System.out.println("입력오류입니다. 다시 입력해 주세요."); 
               break; 
            } 
         } while(true); 
      } 
   } 
   
   // 저장된 내용을 출력
   static void sortRecord() {  
	   displayRecord(); 
   } 
 
   static void displayRecord() { // 정보 출력 역할 
      int koreanTotal = 0; 
      int englishTotal = 0; 
      int mathTotal = 0; 
      int total = 0; 

      System.out.println(); 
      System.out.println("이름 번호 국어 영어 수학 총점 "); 
      System.out.println("======================================"); 

      int length = record.size(); // 저장된 갯수

      if(length > 0) { 
         for (int i = 0; i < length ; i++) { 
            Student2 student = (Student2)record.get(i); //record의 i번째를 추출
            System.out.println(student); 
            koreanTotal += student.koreanScore; 
            mathTotal += student.mathScore; 
            englishTotal += student.englishScore; 
            total += student.total; 
         } 
      } else { 
         System.out.println(); 
         System.out.println(" 데이터가 없습니다."); 
         System.out.println(); 
      } 

      System.out.println("======================================"); 
      System.out.println("총점: " 
         + Student2.format(koreanTotal+"", 11, Student2.RIGHT) 
         + Student2.format(englishTotal+"", 6, Student2.RIGHT) 
         + Student2.format(mathTotal+"", 6, Student2.RIGHT) 
         + Student2.format(total+"", 8, Student2.RIGHT) 
      ); 
      System.out.println(); 
   } 
} 

// inputtRecord 메서드 실행 시 생성되는 Student 클래스
class Student2 { // 학생정보 저장 클래스
   final static int LEFT = 0; 
   final static int CENTER = 1; 
   final static int RIGHT = 2; 

   String name = ""; 
   String studentNo = ""; 
   int koreanScore = 0; 
   int mathScore = 0; 
   int englishScore = 0; 
   int total = 0; 

   Student2(String name, String studentNo, int koreanScore, int mathScore, int englishScore) { 
      this.name = name; 
      this.studentNo = studentNo; 
      this.koreanScore = koreanScore; 
      this.mathScore = mathScore; 
      this.englishScore = englishScore; 
      total = koreanScore + mathScore + englishScore; 
   } 

   public String toString() { 
      return format(name, 4, LEFT) // 이름 4개공백 왼쪽에 붙힘
         + format(studentNo, 4, RIGHT) 
         + format(""+koreanScore,6, RIGHT) 
         + format(""+mathScore,6, RIGHT) 
         + format(""+englishScore, 6, RIGHT) 
         + format(""+total,8, RIGHT); 
   } 

   static String format(String str, int length, int alignment) { 
      int diff = length - str.length(); 
      if(diff < 0) return str.substring(0, length); 

      char[] source = str.toCharArray(); 
      char[] result = new char[length]; 

      for(int i=0; i < result.length; i++) 
         result[i] = ' '; 

      switch(alignment) { 
         case CENTER : 
            System.arraycopy(source, 0, result, diff/2, source.length); 
            break; 
         case RIGHT : 
            System.arraycopy(source, 0, result, diff, source.length); 
            break; 
         case LEFT : 
         default : 
            System.arraycopy(source, 0, result, 0, source.length); 
      } 
      return new String(result); 
   } 
} 