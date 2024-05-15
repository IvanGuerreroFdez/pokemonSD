import java.util.Random;

public class DamageCalculator {
    public static int damageCalculator(Character attacker, Character receiver, int moveNo, boolean rain) { // Calculates the damage of a move
        Random rn = new Random();
        double random = rn.nextDouble(1 - 0.85) + 0.85; // Random number between 0.85 and 1
        int atk, def;
        double type = 1.0;
        //double critical = 1;

        if(attacker.getSpA() > attacker.getAtk()) { // Checks if attacker is a special attacker
            atk = attacker.getSpA();
            def = receiver.getSpD(); // Special defense is used in calcs
        } else { // If physical attacker
            atk = attacker.getAtk();
            def = receiver.getDef(); // Physical defense is used in calcs
        } // end if else conditions

        // Checks the type of both
        if(attacker.type.compareTo(receiver.type) == 0) { // Same type --> not very effective
            type = 0.5;
        } else {
            if(attacker.type.compareTo("Grass") == 0) {
                if(receiver.type.compareTo("Water") == 0) { // Super effective
                    type = 2;
                } else if(receiver.type.compareTo("Fire") == 0) { // Not very effective
                    type = 0.5;
                } // end if else if conditions
            } else if(attacker.type.compareTo("Fire") == 0) {
                if(receiver.type.compareTo("Grass") == 0) { // Super effective
                    type = 2;
                } else if(receiver.type.compareTo("Water") == 0) { // Not very effective
                    type = 0.5;
                } // end if else if conditions
            } else if(attacker.type.compareTo("Water") == 0) {
                if(receiver.type.compareTo("Fire") == 0) { // Super effective
                    type = 2;
                } else if(receiver.type.compareTo("Grass") == 0) { // Not very effective
                    type = 0.5;
                } // end if else if conditions
            } else {
                type = 1;
            } // end if, else if x2, else conditions
        } // end if else conditions

        /* // Handle critical hits
        int critRand = rn.nextInt(2);
        //System.out.println(critRand);

        if(critRand == 1) {
            critical = 1.5;
        } // end if condition */

        double weather = 1;
        if(rain && attacker.type == "Water") { weather = 1.5; }

        int damage = (int) Math.round(((((2 * 50 / 5 + 2) * attacker.moves[moveNo].power * atk / def) / 50 + 2) * random * 1.5 * type * Decorator.crit() * weather));

        if(type == 2) {
            System.out.println("It's super effective!");
        } else if(type == 0.5) {
            System.out.println("It's not very effective...");
        } // end if, else if conditions

        if(Decorator.crit() == 1.5) {
            System.out.println("A critical hit!");
        } // end if condition

        System.out.printf("(%s lost %d%% of its health!)\n", receiver.toString(), damage * 100 / receiver.getHp());

        receiver.hp -= damage;

        if(receiver.hp < 0) {
            receiver.hp = 0;
            System.out.printf("%s fainted!\n", receiver.toString());
        }
        
        return damage;
    } // end of damageCalculator
}
