
public class Main {
	
	
	public static int ListSum(int[] array1) {
		int sum = 0;
		for(int i = 0; i < array1.length; ++i) {
			sum += array1[i];
		}
		return sum;
	}
	
	public static int Multiply(int[] list) {
		int product = 1;
		for(int i = 0; i < list.length; ++i) {
			product = list[i] * product;
		}
		return product;
	}
}
