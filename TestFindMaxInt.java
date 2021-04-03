import java.util.*;

public class TestFindMaxInt {
	public static void main(String[] args) {
		FindMaxInt a = new FindMaxInt();
		int[] array = a.createArr();
		System.out.println(Arrays.toString(array));
		System.out.println(a.findMax(array));
	}
}