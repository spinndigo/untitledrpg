/*
Tristan Protzman

Class for all consumable items in the game, ie scrolls and potions
*/

/*
TODO

*/

public class Consumable extends Item{

	private int duration;
	private double modStrength;
	private double modDefense;
	private double modAgility;
	private boolean useOnEnemy;
	private boolean useOutOfBattle;


	public Consumable(String name, String description, int cost, int duration, double modStrength, double modDefense, double modAgility, boolean useOnEnemy, boolean useOutOfBattle){
		super(name, description, cost);
      this.duration = duration;
		this.modStrength = modStrength;
		this.modDefense = modDefense;
		this.modAgility = modAgility;
		this.useOnEnemy = useOnEnemy;
		this.useOutOfBattle = useOutOfBattle;
	}


}