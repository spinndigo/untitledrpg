/*
Tristan Protzman

Tester class*/

public class Tester{

	public static void main(String[] args){
		//testHealth();
		//testModifiers();
		//testItem();
		testCombat();

	}

	public static void testHealth(){
		Character james = new Character("James", 5, 4, 2, 6, 3, 100); 
		System.out.println(james.getHealth());		//gets initial health
		james.changeHealth(-30);					//decreces health by 30
		System.out.println(james.getHealth());		
		james.changeHealth(500);					//increases health by more than maximum health
		System.out.println(james.getHealth());		//makes sure health did not go above maximum
		james.changeHealth(-9000);
		System.out.println(james.getHealth());		//makes sure health cannot go below 0
	}

	public static void testModifiers(){
		Character james = new Character("James", 5, 4, 2, 6, 3, 100);
		System.out.println(james.getStrength());		//prints the base strenth of james
		james.modStrength(1); 							//applies a 200% modifier to strength
		System.out.println(james.getStrength());		//prints the modified strength
		james.modStrength(-0.5);						//weakens strength to 25% of prior
		System.out.println(james.getStrength());
		james.resetModifiers();							//resets modifiers, as if after battle
		System.out.println(james.getStrength());
	}


	public static void testItem(){
		Item sword = new Item("Sword", "A great sword", false, 300, 2, 0, -.1);
		System.out.println(sword.getName());
		System.out.println(sword.isConsumable());
		System.out.println(sword.getStrength());
		
		Item trinket = new Item("Picture");
		System.out.println("\n" + trinket.getName());
		System.out.println(trinket.getDescription());
		System.out.println(trinket.getDefense());

		Item vase = new Item("Vase", 400);
		System.out.println("\n" + vase.getName());
		System.out.println(vase.getCost());

	}

	public static void testCombat(){
		Combat combat = new Combat();

		Character hero = new Character("Hero", 8, 0, 5, 4, 2, 40);
		Character enemy = new Character("Enemy", 7, 0, 6, 4, 2, 10);
		

		while(hero.getHealth() > 0 && enemy.getHealth() > 0){
			combat.performCombat(hero, enemy);
			System.out.println("Enemy Health: " + enemy.getHealth() + "\n");
			combat.performCombat(enemy, hero);	
			System.out.println("Hero Health: " + hero.getHealth() + "\n");
		}
		if (hero.getHealth() == 0  && enemy.getHealth() != 0)
			System.out.println("Enemy won!");
		else if (enemy.getHealth() == 0 && hero.getHealth() != 0)
			System.out.println("Hero won!");
		else
			System.out.println("¯\\_(ツ)_/¯");

	}
}