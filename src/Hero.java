/*
Joseph Spinosa
Tristan Protzman

Extends Character class to create the hero

*/

/*
TODO
   Figure out what actually has to go into this code
   Probably some Hero specific stuff like the having an inventory, talents, and other stuff.
   It's late and Denny is distracting and I'm tired.  I'll do this later.

*/

class Hero extends Character{

   //possible talents
   private boolean backstab = false;
   private boolean heavy = false;

   //constructor
   public Hero(boolean backstab, boolean heavy){
   	this.backstab = backstab;
   	this.heavy = heavy;
   } 


}