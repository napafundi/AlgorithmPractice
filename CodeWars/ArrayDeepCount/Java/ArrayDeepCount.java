import java.util.ArrayList;

public class ArrayDeepCount {
	
	@SuppressWarnings("unchecked")
	public int deepCount(ArrayList<Object> arr) {
		int sum = 0;
		for (Object obj: arr) {
			sum++;
			if (obj instanceof java.util.ArrayList) {
				sum += deepCount((ArrayList<Object>) obj);
			}
		}
		return sum;
	}

}