public class DamageTest {
    public static void main(String[] args) {
        Character greninja = new Character("Greninja", "Water", 72, 95, 67, 103, 71, 122);
            Move waterShuriken = new Move("Water Shuriken", "Water", 70, 100, +1);
            greninja.moves[1] = waterShuriken;

        Character infernape = new Character("Infernape", "Fire", 76,104,71,104,71,108);
            Move flareBlitz = new Move("Flare Blitz", "Fire", 120, 100, 0);
            infernape.moves[1] = flareBlitz;

        DamageCalculator damage = new DamageCalculator();
        damage.damageCalculator(greninja, infernape, 1, false);
    }
}