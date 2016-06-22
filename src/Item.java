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
	private int cost;

	//contsructors

	public Item(String name){
		this.name = name;
		this.description = "An useless item";
		this.cost = 0;
	}

	public Item(String name, String description, int cost){
		this.name = name;
		this.description = description;
		this.cost = cost;
	}


	

	//accessors
	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public int getCost(){
		return cost;
	}

	//methods
}