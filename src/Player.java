public class Player {
    int hp;
    int physical_dmg;
    int range_dmg;
    int magic_dmg;
    String player_name;

    public Player(String player_name) {
        this.player_name = player_name;
        this.hp = 50;
        this.physical_dmg = 7;
        this.range_dmg = 2;
        this.magic_dmg = 5;
    }

    public String getPlayer_name(){
        return player_name;
    }
    public void setPlayer_name(String player_name){
        this.player_name = player_name;
    }
    public int getHp() {
        return hp;
    }
    public int getPhysical_dmg() {
        return physical_dmg;
    }
    public int getRange_dmg() {
        return range_dmg;
    }
    public int getMagic_dmg() {
        return magic_dmg;
    }

}
