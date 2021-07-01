package task1;
import java.util.*;
public class StringArrayCompare
{
	public static void stringCompare() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array1 values");
		String array1[]=new String[length];
		int i,j;
		for( i=0;i<length;i++){
		    array1[i]=input.next();
		}
		
		System.out.println("Enter array2 values");
		String array2[]=new String[length];
		
		for( j=0;j<length;j++){
		    array2[j]=input.next();
		}
		System.out.println("Common Elements are");
		for( i=0;i<length;i++) {
			for( j=0;j<length;j++) {
				if(array1[i].equals(array2[j])) {
					System.out.print(array1[i]+" ");
				}
			}
		}
	}
	
}
