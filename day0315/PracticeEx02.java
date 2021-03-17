package test.day0315;

public class PracticeEx02 
{
	public static void main(String[] args) 
	{
		//01.제어문문제 8번
	      for(int a=0; a < 5; a++)
	      {
	    	  for(int b = 0; b < a; b++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int b = 0; b <= 4-a; b++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	      
	    //01.제어문문제 9번
	      for(int a = 0; a < 6; a++)
	      {
	    	  for(int b = 0; b < 5-a; b++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int b = 0; b < 1+a; b++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	      for(int a =0; a < 5; a++)
	      {
	    	  for(int b = 0; b < a+1; b++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int b = 0; b < 5-a; b++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	      
	     //01.제어문문제 10번
	      for(int a = 0; a < 10; a+=2) 
	         {
	          for(int b = 0; b < 4-a; b++) 
	          {
	             System.out.print(" ");
	          }
	          for(int b = 0; b < 1+a; b++) 
	          {
	             System.out.print("*");
	          }
	          System.out.println();
	         }		
	      
	      
	      for(int a = 0; a < 5; a++)
	         {
	          for(int b = 0; b < 4-a; b++)
	          {
	             System.out.print(" ");
	          }
	          for(int c = 0; c < 2*a+1; c++)
	          {
	             System.out.print("*");
	          }
	          System.out.println();
	   }
	}
}
