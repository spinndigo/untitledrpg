/*
Joseph Spinosa
Tristan Protzman

Base character class for hero, NPCs, enemies, and bosses

*/

/*
TODO

*/


public class Character{

	//Character statistics
	private int health;
	private int maxHealth;
	private int mana;
	private int maxMana;
	private int strength;
	private int defense;
	private int agility;
	private double modStrength;		//treated as percentages
	private double modDefense;
	private double modAgility;
	private int gold;

	private String name;

	//Constructer
	//Requires a string and 6 integers
	public Character(String initName, int initHealth, int initMana, int initStrength, int initDefense, int initAgility, int initGold){
		this.name = initName;
		this.health = (initHealth * 100) + 100; //health scales by 100 HP per point, minimum of 100 HP
		this.maxHealth = health;
		this.mana = initMana * 50;
		this.maxMana = mana;
		this.strength = initStrength;
		this.defense = initDefense;
		this.agility = initAgility;
		this.gold = initGold;
	}


	//accessors

	public int getHealth(){
		return health;
	}

	public int getMana(){
		return mana;
	}

	public int getStrength(){
		return strength;
	}

	public int getDefense(){
		return defense;
	}

	public int getAgility(){
		return agility;
	}

	public int getGold(){
		return gold;
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
		modStrength += percent;
	}

	public void modDefense(double percent){
		modDefense += percent;
	}	

	public void modAgility(double percent){
		modAgility += percent;
	}


	public void resetModifiers(){
		modAgility = 0;
		modDefense = 0;
		modStrength = 0;
	}


}