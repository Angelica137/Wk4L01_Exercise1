import java.util.*;

public class TestFindMaxInt {
	public static void main(String[] args) {
		FindMaxInt a = new FindMaxInt();
		int[] array = a.createArr();
		System.out.println(Arrays.toString(array));
		System.out.println(a.findMax(array));

		// simple tests
		int[] a1 = { 1, 2, 3, 4, 5 };
		System.out.println(a.findMax(a1));

		int[] a2 = { 100, 2, 50 };
		System.out.println(a.findMax(a2));
	}
}