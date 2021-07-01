package task1;
import java.util.*;
public class IntegerArrayCompare
{
	public static void integerCompare() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array1 values");
		int array1[]=new int[length];
		int i,j;
		for( i=0;i<length;i++){
		    array1[i]=input.nextInt();
		}
		
		System.out.println("Enter array2 values");
		int array2[]=new int[length];
		
		for( j=0;j<length;j++){
		    array2[j]=input.nextInt();
		}
		System.out.println("Common Elements are");
		for( i=0;i<length;i++) {
			for( j=0;j<length;j++) {
				if(array1[i]==(array2[j])) {
					System.out.print(array1[i]+" ");
				}
			}
		}
	}
	
}
