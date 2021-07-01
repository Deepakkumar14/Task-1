package task1;
import java.util.*;
public class OddAndEven
{
	public static void oddEven() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		int odd=0,even=0;
		for( i=0;i<array.length;i++) {
			if(array[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Number of odd integers : "+odd);
		System.out.println("Number of even integers : "+even);
	}
}
