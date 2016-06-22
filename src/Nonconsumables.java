


public class Nonconsumables extends Item{

   private boolean equipable;
   private boolean keyItem;
   
   // the following fields will only apply to gear(reflected by separate constructors)
   private int     strBonus;  
   private int     defBonus;
   private int     agilBonus;
   private int     hpBonus;
   private int     manaBonus;
   private int     luckBonus; 
   private int     dispositionBonus;
   
   
   public Nonconsumables(String name, String description, int cost, boolean keyItem){
      super(name, description, cost);
      this.equipable = false;
      this.keyItem = keyItem; 
      }
      
   public Nonconsumables(String name, String description, int cost, boolean keyItem, int strBonus,
                         int defBonus, int agilBonus, int hpBonus, int manaBonus, int luckBonus, int dispositionBonus){
                         
          super(name, description, cost);
          this.equipable = true;
          this.keyItem = keyItem;
          this.strBonus = strBonus;
          this.defBonus = defBonus;
          this.agilBonus = agilBonus;
          this.hpBonus = hpBonus;
          this.manaBonus = manaBonus;
          this.luckBonus = luckBonus;
          this.dispositionBonus = dispositionBonus;
          
          }
                         
      // accessors
      
      public boolean isEquipable(){
        return this.equipable;}
      
      public boolean isKeyItem(){
        return this.keyItem;}
        
      public int getstrBonus(){
         if(this.equipable)return this.strBonus;
         else{return 0;}
      }
      
     
      public int getdefBonus(){
         if(this.equipable)return this.defBonus;
         else{return 0;}
      }


public int getagilBonus(){
         if(this.equipable)return this.agilBonus;
         else{return 0;}
      }


public int gethpBonus(){
         if(this.equipable)return this.hpBonus;
         else{return 0;}
      }


public int getmanaBonus(){
         if(this.equipable)return this.manaBonus;
         else{return 0;}
      }


public int getluckBonus(){
         if(this.equipable)return this.luckBonus;
         else{return 0;}
      }
      
      public int getdispositionBonus(){
         if(this.equipable)return this.dispositionBonus;
         else{return 0;}
      }


        
        
}
            