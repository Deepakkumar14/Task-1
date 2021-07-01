package task1;
import java.util.*;
public class AverageExceptMaximumAndMinimum
{
	public static void averageExceptMaxAndMin() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
		int min=array[0];
		int max=array[0];
		float sum=0,count=0;
			for( i=0;i<length;i++) {
				if(array[i]>max) {
					max=array[i];
				}
				else if(array[i]<min) {
					min=array[i];
				}
			}
			for( i=0;i<length;i++) {
				if(array[i]!=min && array[i]!=max) {
					sum+=array[i];
					count++;
				}
			}
			float average=sum/count;
			System.out.println("Average value of array except the largest and smallest values "+average);
	}
}
