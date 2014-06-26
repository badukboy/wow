package ca.bcit.comp2613.a00192788.wow;

public class Character {
	private Race race;
	private int level;
	private int strength;
	private int armour;
	private int stamina;
	
	public Character(Race race, int level, int strength, int armour, int stamina) {
		super();
		this.race = race;
		this.level = level;
		this.strength = strength;
		this.armour = armour;
		this.stamina = stamina;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getArmour() {
		return armour;
	}
	public void setArmour(int armour) {
		this.armour = armour;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
		
}
