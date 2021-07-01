package task1;
import java.util.*;
public class LeaderElement
{
	public static void leader() {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		
			
		int i;
		for(i=0;i<length;i++){
		    array[i]=input.nextInt();
		}
            int last = array[length-1];
        System.out.println(last + " is a leader");
        for (i=length-2; i>=0;i--) 
        {
            if (array[i]>last) 
            {
                last=array[i];
                System.out.println(last+ " is a leader");
            }
        }
	}
}
