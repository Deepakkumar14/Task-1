package task1;
import java.util.*;
public class SearchAnElement
{
	public static void search() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int array1[]=new int[length+1];
		int i,flag=0;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		System.out.println("Enter the element to be found ");	
		int value=input.nextInt();
		   for(i=0;i<length;i++)
       {
         if(array[i]==value)
         {
             System.out.println("Element "+value+" found at "+i+" position");
             flag=1;
             break;
         }
     }
     if(flag==0)
     {
         System.out.println("Element "+value+" not found");
     }
	}
	
}
