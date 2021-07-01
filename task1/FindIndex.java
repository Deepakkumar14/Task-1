package task1;
import java.util.*;
public class FindIndex
{
	public static void find() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i,flag=0;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		System.out.println("Enter the value of index to be found");	
		int value=input.nextInt();
		for(i=0;i<length;i++){
		  if(value==array[i]){
		  	System.out.println("Index of "+value+" is "+ i);
		  	flag++;	
                   }
		}
		if(flag==0)
			System.out.println("Element not present");
	}
	
}
