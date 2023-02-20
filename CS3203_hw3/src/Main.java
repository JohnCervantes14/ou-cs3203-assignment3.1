import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		int[] toAdd = new int[5];
		int[] toMultiply = new int[5];
		int[] toReverse = new int[5];

		System.out.println("Enter 5 numbers to add");
		for(int i = 0; i < 5; ++i) {
			toAdd[i] = input.nextInt();
		}
		
		System.out.println("Enter 5 numbers to multiply");
		for(int i = 0; i < 5; ++i) {
			toMultiply[i] = input.nextInt();
		}
		
		System.out.println("Enter 5 numbers to reverse");
		for(int i = 0; i < 5; ++i) {
			toReverse[i] = input.nextInt();
		}
		
		int sum = ListSum(toAdd);
		int product = Multiply(toMultiply);
		int[] reversed = Reverse(toReverse);
		
		System.out.println("Sum: " + sum + " Product: " + product + "\n" + "Reversed: ");
		for(int i = 0; i < 5; ++i) {
			System.out.print(reversed[i] + " ");
		}
	}
//add the contents of an array together
	public static int ListSum(int[] array1) {
		int sum = 0;
		for(int i = 0; i < array1.length; ++i) {
			sum += array1[i];
		}
		return sum;
	}
//multiplies the contents of an array together
	public static int Multiply(int[] list) {
		int product = 1;
		for(int i = 0; i < list.length; ++i) {
			product = list[i] * product;
		}
		return product;
	}
	
	public static int[] Reverse(int[] toReverse) {
		int[] result = new int[toReverse.length];
		
		for(int i = 0; i < result.length; ++i) {
			result[i] = toReverse[toReverse.length-1-i];
		}
		
		return result;
	}
}
