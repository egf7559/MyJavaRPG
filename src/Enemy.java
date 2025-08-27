public class Enemy {
    int hp;
    private static int E_physicalDamage;

    public Enemy(){

    }
    public static int getE_physicalDamage() {
        return E_physicalDamage;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}