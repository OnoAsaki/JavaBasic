
public class Practice15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double bmi = getBmi(1.7, 60);
        checkBmi(bmi);

	}
	public static double getBmi(double height, int weight) {
        double bmi = weight / (height * height);
        return bmi;
    }
    public static void checkBmi(double bmi) {
        if (18 > bmi) {
            System.out.println("低体重");
        } else if(25 > bmi) {
            System.out.println("普通体重");
        } else {
            System.out.println("肥満");
        }
    }


}
