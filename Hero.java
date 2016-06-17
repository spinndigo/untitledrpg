// Joseph Spinosa



public class Hero{

   // fields
   private int health,maxHP, strength, defense, agility, STRmod, DEFmod, AGILmod, gold; // mods are curses, buffs (%)
   private String name;     // name of hero
   private String[] Inventory = new String[4];  // holds items for hero, 5 items max
   
   
   // constructor
   public Hero(String initName,int initHealth,int initSTR,int initDEF,int initAGIL)
      {this.name = initName;
      this.health = initHealth*100 + 100;
      this.maxHP = health;
      this.strength = initSTR;
      this.defense = initDEF;
      this.agility = initAGIL;
      this.STRmod = DEFmod = AGILmod = 0;
      this.gold = 100;   // start with 100 gold
      }
      
   // accessor methods
   
   public int getHealth(){
      return this.health;} 
      
   public int getSTR(){
      return strength;}
      
   public int getDEF(){
      return defense;}
      
   public int getAGIL(){
      return agility;}
      
   public int getGold(){
      return gold;}
      
   public void getInventory(){
      for(int i=0; i<=4; i++){
         System.out.println(Inventory[i]);
         }
      }
      
   // mutators
   
   public void changeHealth(int change){
      if(health + change <= 0){health = 0;}
     
     else{health = health + change;}
     } 
   
   public void changeGold(int change){
      if(gold + change <= 0){
         gold = 0;}
         
      else{gold = gold + change;}
   }
   
   public void modstr(int str){
   this.STRmod = STRmod + str;}
   
   public void moddef(int def){
   this.DEFmod = DEFmod + def;}
   
   public void modagil(int agil){
   this.AGILmod = AGILmod + agil;}

   public void RestoreSelf(){
   STRmod = DEFmod = AGILmod = 0;}
   
   public void getItem(String item, int place){
   if(place < 0 || place > 4){
      System.out.println("sorry! I can't do that");}
   
   else{ Inventory[place] = item;}
   }
   
      
      
      
}      

      
      
   
    
   
   



   