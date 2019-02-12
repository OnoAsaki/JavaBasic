
public class Plactice17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Employee employee1 = new Employee();
        Employee employee2  = new Employee("太郎");
        Employee employee3  = new Employee("二郎", 30);

        System.out.println(employee1.getProfile());
        System.out.println(employee2.getProfile());
        System.out.println(employee3.getProfile());

	}

}
