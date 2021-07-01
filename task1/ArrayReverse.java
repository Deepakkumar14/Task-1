package task1;
import java.util.*;
public class ArrayReverse
{
	public static void reverse() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
	for( i=0;i<length/2;i++) {
			int temp=array[i];
			array[i]=array[length-i-1];
			array[length-i-1]=temp;
		}
		System.out.println("Reversed array");
		for( i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
