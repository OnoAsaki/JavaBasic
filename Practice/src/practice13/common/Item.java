package practice13.common;

public class Item {

	private String name;

	private int additionalDamage;

	public Item (int additionalDamage,String name) {
	 this.additionalDamage = additionalDamage;
	 this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

}
