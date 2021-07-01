package task1;
import java.util.*;
public class ArraySort
{
	public static void sort() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		
			
		int i,j=0,temp=0;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
           for ( i = 0; i <length; i++) {     
          for ( j = i+1; j <length; j++) {     
              if(array[i] >array[j]) {    
                 temp = array[i];    
                 array[i] = array[j];    
                 array[j] = temp;    
               }     
            }     
        }    
			
			System.out.println("Array after sorting");
			for(i=0;i<length;i++){
		    System.out.print(array[i]+" ");
		}
		
	}
}
