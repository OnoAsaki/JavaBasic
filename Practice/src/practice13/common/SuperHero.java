package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;



	public SuperHero(int hp, int power, int endurance) {
		super(25, 10, 7);
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();

	}
}
