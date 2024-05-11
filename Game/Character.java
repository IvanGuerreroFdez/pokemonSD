public class Character extends Moves {
    String name, type;
    int hp, atk, def, spa, spd, spe;

    public Character(String name, String type, 
                    int hp, int atk, int def, int spa, int spd, int spe, 
                    String moveName, int movePriority) {
                        this.name = name;
                        this.type = type;
                        this.hp = hp;
                        this.atk = atk;
                        this.def = def;
                        this.spa = spa;
                        this.spd = spd;
                        this.spe = spe;
                        super.moveName = moveName;
                        super.movePriority = movePriority;
    }
}
