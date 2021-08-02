package task1;//Main class
import java.util.Scanner;

public class Task1Runner {
	public static void main(String [] args) {
		System.out.println("1.Find the index of an array element");
		System.out.println("2.Sum of elements in numeric array");
                System.out.println("3.Remove a specific element");
		System.out.println("4.Insert element at specific position in an array");
		System.out.println("5.Find if an array contains a specific value");
		System.out.println("6.Find minimum and maximum value of a numeric array");
		System.out.println("7.1.Find common elements between two integer array");
		System.out.println("7.2.Find common elements between two string array");
		System.out.println("8.Remove duplicate elements ");
		System.out.println("9.Find the number of even and odd integers in a given array");
		System.out.println("10.Compute the average value of an array except the largest and smallest value");
		System.out.println("11.Find the sum of the two elements of a array equal to a given integer");
		System.out.println("12.Reverse an array");
		System.out.println("13.Separate even and odd numbers of an array and put all even numbers first and then odd numbers");
		System.out.println("14.Sort an array");
		System.out.println("15.Print all LEADERS in array");
		System.out.println("16.Exit");
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Your Choice:");
			int choice=input.nextInt();
			switch(choice) {
				case 1:
					FindIndex.find();
					break;
				case 2:
					SumOfValues.sumOfVal();
					break;
				case 3:
					RemoveElement.removeEle();
					break;
				case 4:
					InsertElement.insert();
					break;
				case 5:
					SearchAnElement.search();
					break;
				case 6:
					MaximumAndMinimum.maxAndMin();
					break;
				case 7:
					System.out.println("1.For integer array");
					System.out.println("2.For String array");
					int value=input.nextInt();
					if(value==1){
					IntegerArrayCompare.integerCompare();
					break;
					}
					if(value==2){
					StringArrayCompare.stringCompare();
					break;
					}
				case 8:
					RemoveDuplicates.removeAllDuplicates();
					break;
				case 9:
					OddAndEven.oddEven();
					break;
				case 10:
					AverageExceptMaximumAndMinimum.averageExceptMaxAndMin();
					break;
				case 11:
					SumOfTwoElements.sumOfElements();
					break;
				case 12:
					ArrayReverse.reverse();
					break;
				case 13:
					 EvenThenOdd.evenAfterOdd();
					break;
				case 14:
					 ArraySort.sort();
					break;
				case 15:
					LeaderElement leaderelement=new LeaderElement();
					 leaderelement.leader();
					break;
			}	
			if(choice==16) {
				break;
			}
		}
	}
}
