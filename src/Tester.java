/*
Tristan Protzman

Tester class*/

public class Tester{

	public static void main(String[] args){
		//testHealth();
		testModifiers();

	}

	public static void testHealth(){
		Character james = new Character("James", 5, 4, 2, 6, 3, 100); 
		System.out.println(james.getHealth());		//gets initial health
		james.changeHealth(-30);					//decreces health by 30
		System.out.println(james.getHealth());		
		james.changeHealth(500);					//increases health by more than maximum health
		System.out.println(james.getHealth());		//makes sure health did not go above maximum
	}

	public static void testModifiers(){
		Character james = new Character("James", 5, 4, 2, 6, 3, 100);
		System.out.println(james.getStrength());		//prints the base strenth of james
		james.modStrength(2); 							//applies a 200% modifier to strength
		System.out.println(james.getStrength());		//prints the modified strength
		james.modStrength(.25);							//weakens strength to 25% of prior
		System.out.println(james.getStrength());
		james.resetModifiers();							//resets modifiers, as if after battle
		System.out.println(james.getStrength());
	}
}