package practical1;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
	
	System.out.println("This will print 500 random numbers between 100 and 1000!");
		int start=100;
		int end =1000;
	
     int number_array [] = new int[500];
	for(int i=0;i<500;i++) 
	{
	Random rand=new Random();
	int random_number=rand.nextInt(end-start)+1 +start;
	
	number_array[i]=random_number;
	}
	for(int n=0;n<number_array.length;n++) 
	{
		System.out.print(number_array[n]+ ",");
		
	}
	
	int smallest=number_array[0];
	
	for(int i=1;i<number_array.length;i++) 
	{
	
		if (number_array[i]<smallest) 
		{
			smallest=number_array[i];
		}			
	}
	
	System.out.println("\n"+ "The smallest N"+ "th" + " number is:" +smallest);
	}
	
	}
