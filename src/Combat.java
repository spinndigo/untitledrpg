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
   
   public double finalScore(int adjusted, int gear){  // takes everything into account(gear, buffs) NOT YET IMPLEMENTED
      return ((double)(adjusted + gear));
   }
   
   public int calcDamage(double finAtt, double finDef){  // this method is the final calculation in the process
      int result;
      
      if(finDef >= finAtt) result = 0;
      
      else{result = -(int)finAtt - (int)finDef;}
      
     return (int)result; // 0 or a negative value, reflecting the change in the targets health
   }
   
   /*
     your luck score is a percentage chance for landing a crit
   */
   
   public void performCombat(Character attacker, Character defender) {
      
      double offense = attacker.getStrength();
      double defense = defender.getDefense(); 
      int damage = calcDamage(rawAtt(offense), rawDef(defense));
      
      defender.changeHealth(damage);  // damage is the change in health probably negative in this case
   }
   
   public boolean isCrit(int luck){  // NOT YET IMPLEMENTED
   
   
      if (luck >= rand.nextInt(100))
        return true;
       else
         return false;   
   
        }
         
          
      
    
   
}
      
   
      

   