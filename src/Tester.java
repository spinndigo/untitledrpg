/*
Tristan Protzman

Tester class*/

public class Tester{

	public static void main(String[] args){

		
		Character james = new Character("James", 5, 4, 2, 6, 3, 100); 
		System.out.println(james.getHealth());
		james.changeHealth(-30);
		System.out.println(james.getHealth());
		james.changeHealth(500);
		System.out.println(james.getHealth());

	}
}