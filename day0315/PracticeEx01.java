package test.day0315;

public class PracticeEx01 
{
	public static void main(String[] args)
	{
		//01.제어문문제 1번
		for(int a = 1; a <= 5; a++)
		{
			System.out.println(a+"행 : "+"***");
		}
		
		//01.제어문문제 2번
		for(int a = 0; a < 5; a++) 
		{
			for(int b = 0; b < 1+a; b++) 
			{
				System.out.print("*"); //가로로 출력
			}
			System.out.println(); //줄바꿈
		}
		  //etc
	      String star ="" ;
	      for(int i = 1; i <= 5 ; i++)
	      {
	         star += "*"; 
	         System.out.println(star);
	      }
	      
	      //01.제어문문제 3번
	      for(int a = 0; a < 5; a++)
	      {	
	    	  for(int b = 0; b <5-a; b++)
	    	{
	    	  System.out.print("*");
	    	}
	      	System.out.println();
	      }
	      
	      //01.제어문문제 4번
	      for(int a = 1; a <= 5; a++)
	      {
	    	  System.out.print(a);
	    	  System.out.print(a+1);
	    	  System.out.print(a+2);
	    	  System.out.print(a+3);
	    	  System.out.println(a+4);
	    	}
	      
	      //쌤 방식
	      for(int a = 1; a <= 5; a++) {
	    	  for(int b = a; b < 5+a; b++) {
	    		  System.out.print(b);
	    	  }
	    	  System.out.println();
	      }
	      
	    
	    //01.제어문문제 5번
	      for(int a = 5; a >= 1; a--)
	      {
	    	  System.out.print(a);
	    	  System.out.print(a+1);
	    	  System.out.print(a+2);
	    	  System.out.print(a+3);
	    	  System.out.println(a+4);
	      }
	      
	      for(int a = 5; a >= 1; a--){
	    	  for(int b = a; b < 5+a; b++)
	    	  {
	    		  System.out.print(b);
	    	  }
	    	  System.out.println();
	      }
	      
	      //01.제어문문제 6번
	      for(int a = 0; a < 5; a++)
	      {
	    	  for(int b = 0; b < 1+a; b++)
	    	  {
	    		  System.out.print("*");  
	    	  }
	    	System.out.println();
	      } 
	      for(int a = 0; a < 5; a++)
	      {
	    	  for(int b = 0; b< 4-a; b++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	      
	      //01.제어문문제 7번
	      for(int a = 0; a < 5; a++) 
	      {
	    	for(int b = 0; b < 4-a; b++) //공백for문
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int b = 0; b < 1+a; b++) //*for문
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	      }
	}	    	  
}
   
	

