package task1;
import java.util.*;
public class InsertElement
{
	public static void insert() {
		
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
		System.out.println("Enter the element to be be inserted ");	
		int value=input.nextInt();
		System.out.println("Enter the index ");	
		int index=input.nextInt();
	    
   for (i = 0; i <=length; i++) {
            if (i < index )
                array1[i] = array[i];
            else if (i == index )
                array1[i] = value;
            else if (i > index )
                array1[i] = array[i - 1];
        }
    	System.out.println("Array after inserting the Element");
		for(i=0;i<=length;i++){
		    System.out.print(array1[i]+" ");
		}
	}
	
}
