import java.util.*;
public class NewInstance
{
	public static void main(String [] arg)
	{
	        String username = "Dev.@123";
			String password = "123";
			System.out.println("welcome to notepad");	
			if(username.isEmpty() || password.isEmpty())
			{
				System.out.println("Enter username & password");
				}
				else
				{
					if(username.equals("Dev.@123")&&password.equals("123"))
					{
						System.out.println("welcome to devs notepad");
						
					}
					else{
						System.out.println("Enter valid cardentials");
					}
					
				}
				
				
				
				
	    		System.out.println("");
		System.out.println("************************************************************************************************************************************");
		System.out.println("");
				
		
		
		
		
		
		
           Boolean  gpsStatus = true;
		   Boolean  internetStatus = false;

                       if(internetStatus )
						   
					   {
						   if(gpsStatus)
						   {
							   System.out.println("Reading the values");
						   }
						   else{
						      System.out.println("please enable GPS");
						   }
					   }else
					   {
						    System.out.println("please enable INTERNET");
					   }	
					   
					   
					   
					   
					   
					   		
									System.out.println("");
   System.out.println("*********************************************************************************************************************************************");
   		System.out.println("");		
		
		
		
		
		int itema=200, itemb=75, itemc=500;
		double price;
		price = ((itema*2)+(itemb)+(itemc*3));
		price = price-(0.1*price);
		price = price+(0.05*price);
		System.out.println(price);
		
		if(price>1800)
		{
			System.out.println("Congrats,you won the 20% discount cupon");
		}
		 else 
		 {
			System.out.println("thanks for shoping"); 

		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		System.out.println("");
						System.out.println("**************************************************************************************************************************");
						System.out.println("");		
				
				
				
				
				
				
				
				
				
				
		
		    int maths,science,chemistry,computersc,studentnumber;
			double finalscore;
			
			
		Scanner marks = new Scanner(System.in);
		System.out.println("enter no .of students");
		 studentnumber= marks.nextInt();
		
		for(int i = 0; i <= studentnumber; i++)
		{
			System.out.println("Enter the maths marks");
			maths = marks.nextInt();
			System.out.println("Enter the science marks");
			science = marks.nextInt();
			System.out.println("Enter the chemistry marks");
			chemistry = marks.nextInt();
			System.out.println("Enter the computersc marks");
			computersc = marks.nextInt();
			finalscore= (maths+science+chemistry+computersc)/4;
			
			 if(finalscore>90)
			 {
				 System.out.println("Excellent");
			 }
			else if(finalscore>80)
			{ 
		     System.out.println("very good");
			}
			else if(finalscore>50)
			{
				 System.out.println("good");
			}
			else if(finalscore>40)
			{
				 System.out.println("avarage");
			}
			else if (finalscore<40)
			{
				 System.out.println("poor");
			}
			else
			{
				 System.out.println("if any student else (ture/false)");
			}
			   
		}
		    
	   
	}
	
	
}