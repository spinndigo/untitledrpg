/*
Tristan Protzman

Class for all consumable items in the game, ie scrolls and potions
*/

/*
TODO

*/

public class Consumable extends Item{

	private int duration;
	private int turnsLeft;
	private double modStrength;
	private double modDefense;
	private double modAgility;
	private boolean useOnEnemy;
	private boolean useOutOfBattle;

	//constructor
	public Consumable(String name, String description, int cost, int duration, double modStrength, double modDefense, double modAgility, boolean useOnEnemy, boolean useOutOfBattle){
		super(name, description, cost);
    	this.duration = duration;
    	this.turnsLeft = duration;
		this.modStrength = modStrength;
		this.modDefense = modDefense;
		this.modAgility = modAgility;
		this.useOnEnemy = useOnEnemy;
		this.useOutOfBattle = useOutOfBattle;
	}

	//accessors
	public int getDuration(){
		return duration;
	}

	public double getModStrength(){
		return modStrength;
	}

	public double getModDefense(){
		return modDefense;
	}

	public double getModAgility(){
		return modAgility;
	}

	public boolean canUseOnEnemy(){
		return useOnEnemy;
	}

	public boolean canUseOutOfBattle(){
		return useOutOfBattle;
	}


	//methods
	public void useOn(Character target){

		if (turnsLeft == duration){
			target.modAll(modStrength, modDefense, modAgility);
		}

		else if (turnsLeft > 0){
			duration --;
		}

		else{
			target.modAll(modStrength * -1, modDefense * -1, modAgility * -1);
		}
	}










}