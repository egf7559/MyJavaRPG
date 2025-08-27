public class Player {
   int hp;
   private static final int physicalDamage = 7;
   private static final int magicalDamage = 5;
   private static final int rangeDamage = 2;
   String name;

   public Player()
   {

   }

   public Player(String name) {
        this.name = name;
   }

   public static int getPhysicalDamage() {
      return physicalDamage;
   }
   public static int getMagicalDamage() {
       return magicalDamage;
   }
   public static int getRangeDamage() {
       return rangeDamage;
   }

   public int getHp() {
      return hp;
   }
   public void setHp(int hp) {
       this.hp = hp;
   }
}
