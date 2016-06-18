/*
Tristan Protzman

Item class
*/

/*
TODO
	Name
	Description
	isUsable
	isConsumable
	modifiers
	cost

*/

public class Item{
	
	//item statistics
	private String name;
	private String description;
	private boolean consumable;
	private int cost;
	private double modStrength;
	private double modDefense;
	private double modAgility;

	//contsructors
	public Item(String name, String description, boolean consumable, int cost, double modStrength, double modDefense, double modAgility){
		this.name = name;
		this.description = description;
		this.consumable = consumable;
		this.cost = cost;
		setModifiers(modStrength, modDefense, modAgility);
	}

	public Item(String name){
		this.name = name;
		this.description = "An useless item";
		this.consumable = false;
		this.cost = 0;
		setModifiers(1, 1, 1);
	}

	public Item(String name, int cost){
		this.name = name;
		this.description = "A sellable item";
		this.consumable = false;
		this.cost = cost;
		setModifiers(1, 1, 1);
	}



	private void setModifiers(double strength, double defense, double agility){
		this.modStrength = strength;
		this.modDefense = defense;
		this.modAgility = agility;
	}

}