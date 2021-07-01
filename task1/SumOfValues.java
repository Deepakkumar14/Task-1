package task1;
import java.util.*;
public class SumOfValues
{
	public static void sumOfVal() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i;
		double sum=0;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		for(i=0;i<length;i++){
		 sum+=array[i];
		}
			System.out.println("Sum of array is "+sum);	
		
	}
}
