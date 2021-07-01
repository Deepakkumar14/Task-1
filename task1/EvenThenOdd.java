package task1;
import java.util.*;
public class EvenThenOdd
{
	public static void evenAfterOdd() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array1[]=new int[length];
			int array2[]=new int[length];
			
		int i,j=0;
		for(i=0;i<length;i++){
		    array1[i]=input.nextInt();
		}
           for( i=0;i<length;i++) {
			if(array1[i]%2==0) {
				array2[j]=array1[i];
				j++;
			}
           }
			  for( i=0;i<length;i++){
				 if (array1[i]%2!=0){
				array2[j]=array1[i];
				j++;
			}
			  }	
			
			System.out.println("Even first and the odd elements");
			for(i=0;i<length;i++){
		    System.out.print(array2[i]+" ");
		}
		
	}
}
