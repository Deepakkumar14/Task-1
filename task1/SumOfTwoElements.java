package task1;
import java.util.*;
public class SumOfTwoElements
{
	public static void sumOfElements() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		
			
		int i,j=0;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		System.out.println("Enter value");
		int value=input.nextInt();
           for ( i = 0; i <length; i++) {  
               for( j=i+1;j<length;j++){
               int sum=array[i]+array[j];
              if(sum==value) {    
                 System.out.println(array[i] +"+"+ array[j]+"="+value); 
               }     
           }
          
           }
          
	}
}
