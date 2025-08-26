public class Player {
    public int hp;
    public int physical_dmg;
    public int range_dmg;
    public int magic_dmg;
    public String player_name;

    public Player(String player_name, int hp, int physical_dmg, int range_dmg, int magic_dmg) {
        this.player_name = player_name;
        this.hp = hp;
        this.physical_dmg = physical_dmg;
        this.range_dmg = range_dmg;
        this.magic_dmg = magic_dmg;

    }
}
