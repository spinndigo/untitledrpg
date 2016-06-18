/*
Tristan Protzman

Base character class for hero, NPCs, enemies, and bosses

*/

/*
TODO

*/


public class Character{

	//Character statistics
	private int health;
	private int maxHealth;		//health cannot exceed this value
	private int mana;
	private int maxMana;		//mana cannot exceed this value
	private int baseStrength;	//base valuse, only changed on creation or level up
	private int baseDefense;
	private int baseAgility;
	private double strength;	//used levels, affected by modifiers
	private double defense;
	private double agility;
	private double modStrength = 1.0;		//treated as percentages
	private double modDefense = 1.0;
	private double modAgility = 1.0;
	private int gold;

	private String name;

	//Constructer
	public Character(String initName, int initHealth, int initMana, int initStrength, int initDefense, int initAgility, int initGold){
		this.name = initName;
		this.health = (initHealth * 100) + 100; //health scales by 100 HP per point, minimum of 100 HP
		this.maxHealth = health;
		this.mana = initMana * 50;
		this.maxMana = mana;
		this.baseStrength = initStrength;
		this.baseDefense = initDefense;
		this.baseAgility = initAgility;
		applyModifiers();
		this.gold = initGold;
	}


	//accessors

	public int getHealth(){
		return health;
	}

	public int getMana(){
		return mana;
	}

	public double getStrength(){
		return strength;
	}

	public double getDefense(){
		return defense;
	}

	public double getAgility(){
		return agility;
	}

	public int getGold(){
		return gold;
	}

	public String getName(){
		return name;
	}


	//mutators

	public void changeHealth(int change){
		if (health + change <= 0)
			health = 0;
		else if (health + change >= maxHealth)
			health = maxHealth;
		else
			health += change;
	}

	public void changeMana(int change){
		if (mana + change <= 0)
			mana = 0;
		else if (mana + change >= maxMana)
			mana = maxMana;
		else
			mana += change;
	}	

	public void changeGold(int change){
		if (gold + change <= 0)
			gold = 0;
		else
			gold += change;

	}

	public void modStrength(double percent){
		percent -= 1;						//accounts for 100% default
		modStrength += percent;
		applyModifiers();
	}

	public void modDefense(double percent){
		percent -= 1;						//accounts for 100% default
		modDefense += percent;
		applyModifiers();
	}	

	public void modAgility(double percent){
		percent -= 1;						//accounts for 100% default
		modAgility += percent;
		applyModifiers();
	}


	//methods
	public void resetModifiers(){
		modAgility = 1;
		modDefense = 1;
		modStrength = 1;
		applyModifiers();
	}

	private void applyModifiers(){						//applys the percent change from modifiers to the base statistics, setting the usable statistics
		strength = baseStrength * modStrength;
		defense = baseDefense * modDefense;
		agility = baseAgility * modAgility;
	}
}
