package test.day0315;

public class PracticeEx01 
{
	public static void main(String[] args)
	{
		//01.������� 1��
		for(int a = 1; a <= 5; a++)
		{
			System.out.println(a+"�� : "+"***");
		}
		
		//01.������� 2��
		for(int a = 0; a < 5; a++) 
		{
			for(int b = 0; b < 1+a; b++) 
			{
				System.out.print("*"); //���η� ���
			}
			System.out.println(); //�ٹٲ�
		}
		  //etc
	      String star ="" ;
	      for(int i = 1; i <= 5 ; i++)
	      {
	         star += "*"; 
	         System.out.println(star);
	      }
	      
	      //01.������� 3��
	      for(int a = 0; a < 5; a++)
	      {	
	    	  for(int b = 0; b <5-a; b++)
	    	{
	    	  System.out.print("*");
	    	}
	      	System.out.println();
	      }
	      
	      //01.������� 4��
	      for(int a = 1; a <= 5; a++)
	      {
	    	  System.out.print(a);
	    	  System.out.print(a+1);
	    	  System.out.print(a+2);
	    	  System.out.print(a+3);
	    	  System.out.println(a+4);
	    	}
	      
	      //�� ���
	      for(int a = 1; a <= 5; a++) {
	    	  for(int b = a; b < 5+a; b++) {
	    		  System.out.print(b);
	    	  }
	    	  System.out.println();
	      }
	      
	    
	    //01.������� 5��
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
	      
	      //01.������� 6��
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
	      
	      //01.������� 7��
	      for(int a = 0; a < 5; a++) 
	      {
	    	for(int b = 0; b < 4-a; b++) //����for��
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int b = 0; b < 1+a; b++) //*for��
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	      }
	}	    	  
}
   
	

