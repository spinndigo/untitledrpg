/*
Tristan Protzman

Class for all consumable items in the game, ie scrolls and potions
*/

/*
TODO
	Implement applying items in combat, figure out how to manage how long the effect lasts
*/

public class Consumable extends Item{

	private int duration;
	private double modStrength;
	private double modDefense;
	private double modAgility;
	private boolean useOnEnemy;
	private boolean useOutOfBattle;

	//constructor
	public Consumable(String name, String description, int cost, int duration, double modStrength, double modDefense, double modAgility, boolean useOnEnemy, boolean useOutOfBattle){
		super(name, description, cost);
		this.duration = duration;
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
	public int useOn(Character target){							//adjusts the targets statistics and returns the duration of the effect so it can be removed later
		target.modAll(modStrength, modDefense, modAgility);
		return duration;
	}

	public void remove(Character target){						//removes the applied affect
		target.modAll(modStrength * -1, modDefense * -1,modAgility * -1);   
	}
}
