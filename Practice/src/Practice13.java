
public class Practice13 {

	public static void main(String[] args) {
		int[][] array = {{95,88,87},
						{70,81,100},
						{12,98,90}
						};
		for(int[] i : array) {
			int sum = 0;
			for(int j : i) {
				sum += j;
			}
			System.out.println(sum);
		}

	}

}
