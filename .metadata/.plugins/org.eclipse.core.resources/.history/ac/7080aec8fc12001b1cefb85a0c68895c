
import java.util.Scanner;

public class Example1 {
	
	public static int[] sort(int[] numArray) {
		//[45 14 23 5]
		//return [5 14 23 45]
		//create the for loop and iterate through the for loop
		//compare (number[i] and number[i+1})
		for(int i = 1; i < numArray.length; i++) { //マイナス１にするのは最後のが比べるものがないから一個前で終わらせる
			for(int j = i; j > 0; j--) {
				if(numArray[j] < numArray[j-1]) {
					int d = numArray[j-1];
					numArray[j-1]= numArray[j];
					numArray[j] = d;
				}
			}
		}
		//return numArray
		return numArray;
	}
	
	public static boolean search(int[] numArray, int num){
		//iterate through numArray
		//inside the for loop check if each element equals to num --> return true
		//after for loop return false
		boolean isFound = false;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == num) {
				isFound = true;
			}
		}
		return isFound;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask user "how may numbers wants to add?"
		System.out.println("how may numbers do you have?");
		//Declare array with that number
		int[] numberArray = new int[input.nextInt()];
		//Iterate through for loop and add the numbers to Array 
		System.out.println("enter the numbers");
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = input.nextInt();
		}
		//ask the number from user
		System.out.println("enter the number for searching in the array");
		int searchNum = input.nextInt();
		//call search method here and print the result
		boolean found = search(numberArray, searchNum);
		
		if(found == true) {
			System.out.println(searchNum + "is in the list");
		} else {
			System.out.println(searchNum + "is not in the list");
		}
		
		System.out.println("---------------------------------------");
		System.out.println("soreted Array");
		int[] sortedArray = new int[numberArray.length];
		sortedArray = sort(numberArray);
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

}
