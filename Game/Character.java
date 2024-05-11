public class Character {
    public String name, type;
    private int hp, atk, def, spa, spd, spe;
    public Move[] moves = new Move[3];
    public String status;

    public Character() {
        // Assigns "Protect" as a default move for any Character
        this.moves[0] = new Move("Protect", "Normal", 0, 100, +4);
    }

    public Character(String name, String type, int hp, int atk, int def, int spa, int spd, int spe) {
        this.name = name;
        this.type = type;

        // Makes the corresponding calculations to change base stats from the .csv into real stats at level 50
        this.hp = (((2 * hp) * 50) / 100) + 50 + 10; // (((2 * base) * lvl) / 100) + lvl + 10
        this.atk = (((2 * atk) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.def = (((2 * def) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spa = (((2 * spa) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spd = (((2 * spd) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spe = (((2 * spe) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5

        // Assigns "Protect" as a default move for any Character
        this.moves[0] = new Move("Protect", "Normal", 0, 100, +4);
    }

    public void setIVs(int hpIV, int atkIV, int defIV, int spaIV, int spdIV, int speIV) {
        // Makes the corresponding changes with the IVs selected by the user
        this.hp = (((2 * hp + hpIV) * 50) / 100) + 50 + 10; // (((2 * base) * lvl) / 100) + lvl + 10
        this.atk = (((2 * atk + atkIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.def = (((2 * def + defIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spa = (((2 * spa + spaIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spd = (((2 * spd + spdIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spe = (((2 * spe + speIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
    }
}
