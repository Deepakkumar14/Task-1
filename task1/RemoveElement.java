package task1;
import java.util.*;
public class RemoveElement
{
	public static void removeEle() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=input.nextInt();
		System.out.println("Enter array values");
		int array[]=new int[length];
		int i,index=-1;
		for(i=0;i<length;i++){
		array[i]=input.nextInt();
		}
		System.out.println("Enter the element to be removed ");	
		int value=input.nextInt();
	 for(i = 0; i < length; i++)
    {
        if(array[i] ==value)
        {
            index = i;
            break;
        }
    }
    if(index != -1)
    {
        for(i = index; i < length-1; i++)
            array[i] = array[i+1];
            
    }
    length--;
    	System.out.println("Array after removing the Element");
		for(i=0;i<length;i++){
		    System.out.print(array[i]+" ");
		}
	}
	
}
