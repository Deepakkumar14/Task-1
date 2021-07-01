package task1;
import java.util.*;
public class MaximumAndMinimum
{
	public static void maxAndMin() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int array1[]=new int[length+1];
		int i;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		int min=array[0];
		int max=array[0];
		for(i=1;i<length;i++){
		    if(array[i]>max)
		    max=array[i];
		    else if(array[i]<min)
		    min=array[i];
		}
			System.out.println("Maximum value is "+max);
	       	System.out.println("Minimum value is "+min);
	}
	
}
