package practice10;

public class Car {

	int serialNo;

	String color;

	int gasoline;


	public int run() {

		gasoline--;

		if(gasoline < 0) {
			return -1;
		}else {
			return new java.util.Random().nextInt(15)+1;
		}
	}

}
