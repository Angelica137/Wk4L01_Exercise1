import java.util.*;

public class FindMaxInt {
	public int[] createArr() {
		Random rd = new Random(); // create random object
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(); // adds a random int
		}
		return array;
	}

	public int findMax(int[] array) {
		// Find-Max(A)
		// 1. max = A[1]
		// 2. for i = 2 to A.length
		// 3. if A[i] > max
		// 4. max = A[i]
		// 5. return max
		int i = 0;
		int max = array[i];
		for (i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;

	}

}
