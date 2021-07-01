package task1;
import java.util.*;
public class RemoveDuplicates
{
	public static void removeAllDuplicates() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i,j,count=-1;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
         int temp[] = new int[length];  
         for(i=0;i<length;i++){
             for(j=i+1;j<length;j++){
                 if(array[i]==array[j])
                 array[j]=count;
                  count--;
             }
            
         }
         System.out.println("Array after removing duplicates");
         for(i=0;i<length;i++)
         if(array[i]>=0){
         System.out.print(array[i]+" ");
         }
	}
}
