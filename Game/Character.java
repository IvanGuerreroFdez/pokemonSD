public class Character {
    public String name, type;
    private int baseHp, baseAtk, baseDef, baseSpA, baseSpD, baseSpe; 
    public int hp;
    private int atk, def, spa, spd, spe;
    public Move[] moves = new Move[3];
    public String status;
    public int maxHp;

    public Character() {
        // Assigns "Protect" as a baseDefault move for any Character
        this.moves[0] = new Move("Protect", "Normal", 0, 100, +4);
    }

    public Character(String name, String type, int baseHp, int baseAtk, int baseDef, int baseSpA, int baseSpD, int baseSpe) {
        this.name = name;
        this.type = type;

        // Makes the corresponding calculations to change base stats from the .csv into real stats at level 50
        // Assigns final stats
        this.hp = (((2 * baseHp) * 50) / 100) + 50 + 10; // (((2 * base) * lvl) / 100) + lvl + 10
            this.maxHp = hp;
        this.atk = (((2 * baseAtk) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.def = (((2 * baseDef) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spa = (((2 * baseSpA) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spd = (((2 * baseSpD) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spe = (((2 * baseSpe) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5

        // Assigns base stats
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.baseSpA = baseSpA;
        this.baseSpD = baseSpD;
        this.baseSpe = baseSpe;

        this.status = "Normal";

        // Assigns "Protect" as a baseDefault move for any Character
        this.moves[0] = new Move("Protect", "Normal", 0, 100, +4);
    }

    public void setIVs(int hpIV, int atkIV, int defIV, int spaIV, int spdIV, int speIV) {
        // Makes the corresponding changes with the IVs selected by the user
        this.hp = (((2 * this.baseHp + hpIV) * 50) / 100) + 50 + 10; // (((2 * base) * lvl) / 100) + lvl + 10
            this.maxHp = hp;
        this.atk = (((2 * this.baseAtk + atkIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.def = (((2 * this.baseDef + defIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spa = (((2 * this.baseSpA + spaIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spd = (((2 * this.baseSpD + spdIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
        this.spe = (((2 * this.baseSpe + speIV) * 50) / 100) + 5; // ((2 * base) * lvl / 100) + 5
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpA() {
        return spa;
    }

    public int getSpD() {
        return spd;
    }

    public int getSpe() {
        return spe;
    }

    public String toString() {
        return name;
    }
}
