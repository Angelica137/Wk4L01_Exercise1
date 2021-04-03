import java.util.*;

public class CreateArray {
	public static void main(String[] args) {
		Random rd = new Random(); // create random object
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(); // adds a random int
		}
		System.out.println(Arrays.toString(array)); // prints the array
	}
}
