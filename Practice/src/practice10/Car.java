package practice10;

public class Car {

	int serialNo;

	String color;

	int gasoline;

	int distance;


	public int run() {

		int n = gasoline; // ガソリン最大量
		for(int i = n; i >= 0; i--) {
			gasoline--;
			distance -= new java.util.Random().nextInt(15)+1;
			if(distance <= 0) {
				break;
			}
		}
		if(gasoline < 0) {
			return -1;
		}else {
			return gasoline;
		}
	}

}
