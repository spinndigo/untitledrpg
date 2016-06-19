/*
from Character.java:

base<attribute> variables are the stats unadjusted

methods like get<attribute> return the adjusted value (accounts for mods)
*/

import java.util.Random;

public class Combat{

	Random rand = new Random();
	 
	 
	public double rawAtt(double strength){  // raw damage score (pass the "adjusted score" from Character.java)
			int r = rand.nextInt(20);
			return ((strength*10)+r);
	}
	 
	public double rawDef(double defense){   // raw defense score (pass the "adjusted score" from Character.java)
			int s = rand.nextInt(10);
			return ((defense*5)+s);
	}
	 
	public double finalScore(int adjusted, int gear){  // takes everything into account(gear, buffs)
			return ((double)(adjusted + gear));
	}
	 
	public int calcDamage(double finDam, double finDef){  // this method is the final calculation in the process
		int result;
		
		if(finDef >= finDam) result = 0;
		
		else{result = (int)finDam - (int)finDef;}
		
		return (int)result;
	}
	 
	 /*
		 your luck score is a percentage chance for landing a crit
	 */
	 
	public boolean isCrit(int luck){
		 
		if (luck >= rand.nextInt(100))
			return true;
		 else
			 return false;   
 
	}
	 
}
			
	 
			

	 